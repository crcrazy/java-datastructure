import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.AbstractList;
import java.util.Iterator;

public class NewVector<E> extends AbstractList<E> implements Cloneable{
    private Object elementData[];
    protected int elementCount;
    protected int capacityIncrement;
    protected E initialValue;
    protected final static int defaultCapacity=10;

    public NewVector()
    { this(defaultCapacity);}
    public NewVector(int initCapacity)
    {
        assert initCapacity>=0:"Nonnegative capacity";
        elementData=new Object[initCapacity];
        elementCount=0;
    }
    public NewVector(int initCapacity,int capacityIncr)
    {
        assert initCapacity>=0:"Nonnegative capacity";
        elementData=new Object[initCapacity];
        elementCount=0;
        capacityIncrement=capacityIncr;
    }
    public NewVector(int initCapacity,int capacityIncr,E initValue)
    {
        assert initCapacity>=0:"Nonnegative capacity";
        capacityIncrement=capacityIncr;
        elementData=new Object[initCapacity];
        elementCount=0;
        initialValue=initValue;
    }
    public boolean add(E e)
    {
        ensureCapacity(elementCount+1);
        elementData[elementCount]=e;
        elementCount++;
        if (contains(e))
        {return true;}
        else return false;
    }

    public E remove(int index)
    {
        assert index>=0&&index<=elementCount:"Index not in range";
        E result=(E) elementData[index];
        for (int i=index;i<=elementCount;i++)
        {
            elementData[i]=elementData[i+1];
        }
        elementData[elementCount]=null;
        elementCount--;
        return result;
    }
    public boolean Contains(E elem)
    {
        Iterator myIterator=iterator();
        while (myIterator.hasNext())
        {
            if (myIterator.next()==elem)
            {return true;}
        }
        return false;
    }
    public E get(int index)
    {
        return (E) elementData[index];
    }
    public void insertElementAt(E e,int index)
    {
        assert index>=0&&index<=elementCount+1;

    }
    public E set(int index,E e)
    {
        assert index>=0&&index<=elementCount: "Index Outof Range";
        E previous=(E)elementData[index];
        elementData[index]=e;
        return previous;
    }
    public void ensureCapacity(int minCapacity)
    {
        int newLength=elementData.length;
        if (minCapacity>elementData.length)
        {
            if (capacityIncrement==0)
            {
                if (newLength==0) newLength=1;
                while(newLength<minCapacity)
                {newLength*=2;}
            }
            else{
                while (newLength<minCapacity)
                {newLength+=capacityIncrement;}
            }
        }
        Object newElementData[]=new Object[newLength];
        for (int i=0;i<elementCount;i++)
        {
            newElementData[i]=elementData[i];
        }
        elementData=newElementData;
    }
    public int size()
    {return elementCount;}

}
