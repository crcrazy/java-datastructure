class VectorIterator<E> extends AbstractorIterator<E> {
    protected NewVector<E> theVector;
    protected int current;
    public VectorIterator(NewVector<E> v)
    {
        theVector =v;
        reset();
    }
    public void reset(){
        current=0;
    }
    public boolean hasNext(){
        return current < theVector.size();
    }
    public E get(){
        return theVector.get(current);
    }
    public E next(){
        return theVector.get(current++);
    }
}
