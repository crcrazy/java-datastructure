public class CircularlyLinkedList<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }
    private Node<E> tail;
    private int size;
    public CircularlyLinkedList(){
        //constructor
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public E first(){
        if(isEmpty()) return null;
        return tail.getNext().getElement();
    }
    public E last(){
        if(isEmpty()) return null;
        return tail.getElement();
    }


}
