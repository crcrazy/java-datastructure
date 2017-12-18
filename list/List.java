    public interface List<E> extends Structure<E>;
    public int size();
    public boolean isEmpty();
    public void clear();
    public void addFirst(E value);
    public void addLast(E value);
    public E getFirst();
    public E getLast();
    public E removeFirst();

    @Override
    public E remove(Object value);

    public E removeLast();
}
