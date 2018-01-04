public class SinglyLinkedList<E> {
    private static class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n){
            element=e;
            next=n;
        }
        public E getElement(){
            return element;
        }
        public Node<E> getNext(){
            return next;
        }
        public void setNext(Node<E> n){
            next=n;
        }
    }
    private Node<E> head;
    private Node<E> tail;
    private int size;
    public SinglyLinkedList(){

    }
    public int size(){
        return  size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public E first(){
        if(isEmpty())return null;
        return head.getElement();
    }
    public E last(){
        if (isEmpty())return null;
        return tail.getElement();
    }
    public void addFirst(E e){
       head=new Node<>(e,null);
       if (size==0){
           tail=head;
       }
       size++;
    }
    public void addLast(E e){
        Node<E> newst=new Node<>(e,null);
        if(isEmpty()){
            head=newst;
        }else{
            tail.setNext(newst);
            tail=newst;
            size++;
        }
    }
    public E removeFirst(){
        if (isEmpty())return null;
        E temp=head.getElement();
        head=head.getNext();
        size--;
        if(size==0){
            tail=null;
        }
        return temp;
    }

}
