import java.util.List;

public abstract class AbstractList<E> implements List<E> {
    public AbstractList(){};
    public boolean isEmpty(){
        return size()==0;
    };
    public void addFirst(E value){
        add(0,value);
    };
    public void addLast(E value){
        add(size(),value);
    };
    public E getFirst(){
        return get(0);
    };
    public E getLast(){
        return get(size()-1);
    };
    public E removeFirst(){
        return remove(0);
    };
    public E removeLast(){
        return remove(size()-1);
    };

    @Override
    public void add(E value) {
        addLast(value);
    }

    public E remove(){
        return removeLast();
    };
    public E get(){
        return getLast();
    };

    public boolean contains(E value){
        return -1!=indexOf(value);
    };

}
