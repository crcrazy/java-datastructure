public class Association<K,V> {
    protected K theKey;
    protected V theValue;
    public Association(K key,V value){

    }
    public V getValue(){
        return theValue;
    }
    public K getKey(){
        return theKey;
    }
    public V setValue(V value){
        V oldvalue =theValue;
        theValue=value;
        return  theValue;
    }
}
