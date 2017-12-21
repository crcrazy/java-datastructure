public class ComparableAssociation<K extends Comparable<K>,V> extends Association<K,V> {
    public ComparableAssociation(K key)
    {}
    public ComparableAssociation(K key, V value){}
    public int compareTo(ComparableAssociation<K,V> that){}

}
