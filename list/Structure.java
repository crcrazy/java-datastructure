import java.util.Collection;
import java.util.Iterator;

public interface Structure {
    public int size();
    public boolean isEmpty();
    public void clear();
    public boolean contains(Object value);
    public void add(Object value);
    public Object remove(Object value);
    public java.util.Enumeration elements();
    public Iterator iterator();
    public Collection values();
}
