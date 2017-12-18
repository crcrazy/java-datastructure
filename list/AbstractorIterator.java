import java.util.Enumeration;
import java.util.Iterator;


public abstract class AbstractorIterator<E> implements Enumeration<E>,Iterator<E>,Iterable<E>
{
    public abstract void reset();
    public abstract boolean hasNext();
    public abstract E next();
    public abstract E get();
    public void remove()
    {
    }
    final public E nextElement(){
        return next();
    }
    final public boolean hasMoreElements(){
        return hasNext();
    }
    final public Iterator<E> iterator(){
        return this;
    }
}
