public class Vector {
    protected Object elementData[];
    protected  int elementCount;
    protected int capacityIncrement;

    public Vector()
    {
        // if no initialization, then create 10 elements
        this(10);
    }
    public Vector(int InitialCapacity)
    {
        assert InitialCapacity >=0:"Initial capacity should not be negative";
        elementData =new Object[InitialCapacity];
        elementCount=0;
    }
    public Vector(int InitialCapacity,int capacityIncr)
    {
        //Assert.pre(InitialCapacity>=0,capacityIncr>=0,"Neither Capacity nor increment should not be negative");
        assert InitialCapacity>=0&&capacityIncr>=0:"Neither Capacity nor increment should not be negative";
        elementData=new Object[InitialCapacity];
        elementCount=0;
        capacityIncrement=capacityIncr;
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
    public boolean contains(Object obj){
        for (int i=0;i<this.size();i++)
        {
            if (elementData[i]==obj)
            {
                return true;
            }
        }
        return false;
    }

    public void add(Object obj)
    {
        ensureCapacity(elementCount+1);
        elementData[elementCount]=obj;
        elementCount++;
    }
    public void add(Object obj, int index)
    {
        int i;
        ensureCapacity(elementCount+1);
        for(i=elementCount; i>index;i--)
        {
            elementData[i]=elementData[i-1];
        }
        elementData[index]=obj;
        elementCount++;
    }
    public Vector remove(Object obj)
    {
        Vector results=new Vector();
        for (int i =0;i<elementData.length;i++)
        {
            if (elementData[i]==obj)
            {
                remove(i);
                results.add(i);
            }
        }
        return results;
    }
    public Object remove(int Index)
    {
        assert Index >=0: "Index should not be negative";
        Object result= get(Index);
        elementCount--;
        while(Index < elementCount)
        {
            elementData[Index]=elementData[Index+1];
            Index++;
        }
        elementData[elementCount]=null;
        return result;
    }
    public Object get(int index)
    {
        assert index >=0: "Index should not be negative";
        return elementData[index];
    }
    public Object set(int index,Object obj)
    {
        assert index >=0: "Index should not be negative";
        Object previous=elementData[index];
        elementData[index]=obj;
        return previous;
    }
    public boolean isEmpty()
    {
        return size()==0;
    }
    public int size()
    {
        return elementCount;
    }
}
