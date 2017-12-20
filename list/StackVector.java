import java.util.Iterator;

public class StackVector<E> {
    protected NewVector<E> data;

    public StackVector(){
        data=new NewVector<E>();
    }
    public StackVector(int size){
        data=new NewVector<E>(size);
    }
    public void add(E item){
        data.add(item);
    }
    public E remove(){
        return data.remove(data.size()-1);
    }
    public boolean isEmpty(){
        return data.size()==0;
    }
    public int size(){
        return data.size();
    }
    public void clear(){
        data.clear();
    }
}
