import java.util.Iterator;

public class BinaryTree<E> {
    protected E val;
    protected BinaryTree<E> parent;
    protected BinaryTree<E> left;
    protected BinaryTree<E> right;

    public BinaryTree(){
        value=null;
        parent=null;
        left=right=this;
    }
    public BinaryTree(E value){
        val=value;
        left=right=new BinaryTree<E>();
        setLeft(left);
        setRight(right);
    }
    public BinaryTree(E value,BinaryTree<E> left, BinaryTree<E> right){
        val=value;
        if(left==null)left=new BinaryTree<E>();
        setLeft(left);
        if (right==null);right=new BinaryTree<E>();
        setRight(right);
    }
    public BinaryTree<E> left(){}
    public BinaryTree<E> parent(){}
    public void setParent(BinaryTree<E> newParent){}
    public void setLeft(BinaryTree<E> newLeft){}
    public void setRight(BinaryTree<E> newRight){}
    public Iterator<E> iterator(){}
    public boolean isLeftChild(){}
    public E value(){}
    public void setValue(E value){}
    public boolean isEmpty(){}
}
