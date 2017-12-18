public class SinglyLinkedList<E> {
    protected int count;
    protected Node<E> head;

    public SinglyLinkedList()
    {
        head =null;
        count=0;
    }
    public int size(){
        return count;
    }
    public void addFirst(E value)
    {
        head=new Node<E>(value,head);
        count++;
    }
    public E removeFirst()
    {
        Node<E> temp=head;
        head=head.next();
        count--;
        return temp.value();
    }
    public E getFirst()
    {
        return head.value();
    }
    public void addLast(E value)
    {
        Node<E> temp=new Node<E>(value,null);
        if (head!=null)
        {
            Node<E> finger=head;
            while (finger.next()!=null)
            {finger=finger.next();}
            finger.setNext(temp);
        }
        else head=temp;
        count++;
    }
    public E removeLast()
    {
        Node<E> finger=head;
        Node<E> previous=null;
        if (head.next()!=null)
        {
            while (finger.next()!=null)
            {
                previous=finger;
                finger=finger.next();
            }
           if (previous==null)
           {head=null;}
           else{
                previous.setNext(null);
           }
            count--;
            return finger.value();
        }
        else return null;
    }
    public boolean contains(E value)
    {
        Node<E> finger=head;
        if (head.next()!=null)
        {
            while(finger.next()!=null)
            {
                finger=finger.next();
                if (finger.value()==value)
                {return true;}
            }
            return  false;
        }
        else return false;
    }
    public E remove(E value)
    {
        Node<E> finger=head;
        Node<E> previous=null;
        while(finger.next()!=null && !finger.value().equals(value))
        {
            previous=finger;
            finger=finger.next();
        }
        if (finger !=null)
        {
            if (previous==null)
            {
                head=finger.next();
            }else
            {
                previous.setNext(finger.next());
            }
            count--;
            return finger.value();
        }
        return null;
    }
    public void clear()
    {
        head=null;
        count=0;
    }
    public void add(int index, E value)
    {
      if (index<0 || index>size())
      {System.out.print("Index is out of range");}
      else if (index=size())
      {addLast(value);}
      else
      {
          Node<E> temp=new Node<E>(value,null);
          Node finger=head;
          Node previous=null;
          for (int i=0;i<index;i++)
          {
              previous=finger;
              finger= finger.next();
          }
          previous.setNext(temp);
          count++;
          temp.setNext(finger.next());
      }
    }
    public E remove(int index){
        Node<E> previous=null;
        Node<E> finger=head;
        if (index<0 || index>size())
        {System.out.print("Index is out of range");}
        else if (index=size())
        {removeLast();}
        else{
            for (int i=0;i<index;i++)
            {
                previous=finger;
                finger=finger.next();
            }
            previous.setNext(finger.next());
            count--;
        }
    }

}

