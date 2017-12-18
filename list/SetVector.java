import java.security.KeyStore;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

public class SetVector extends AbstractSet {

    protected Vector data;
    public SetVector() {
        data=new Vector();
    }

    public SetVector(Structure other) {
        this();
        addAll(other);
    }

    public void clear() {
        Iterator yourElment=iterator();
        while(yourElment.hasNext())
        {
            remove(yourElment);
        }
    }

    public boolean isEmpty() {
        return this.size()==0;
    }

    /**
     * Returns an iterator over the elements contained in this collection.
     *
     * @return an iterator over the elements contained in this collection
     */
    @Override
    public Iterator iterator() {
        return null;
    }

    public boolean add(Object obj){
        data.add(obj);
        if (contains(obj))
        {return  true;}
        else {return false;}
    }
    public boolean remove(Object obj){
        Object s= data.remove(obj);
        if (s != null){
            return true;
        }
        return false;
    }
    public boolean contains(Object obj){
        return data.contains(obj);

    }
    public boolean containsAll(Structure other){
        Iterator yourElements =other.iterator();
        boolean iscontainsAll= true;
        while (yourElements.hasNext())
        {
            if (!data.contains(yourElements.next()))
            { iscontainsAll =false;
                break;
            }
        }
        return iscontainsAll;

    }

    public Object clone(){
        return data;
    }

    public void addAll(Structure other){
        Iterator yourElements =other.iterator();
        while (yourElements.hasNext())
        {
            add(yourElements.next());
        }
    }
    public void retainAll(Structure other){

    }
    public void removeAll(Structure other){

    }

    public int size(){
        return data.size();
    }


}
