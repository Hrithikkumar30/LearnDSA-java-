import java.util.NoSuchElementException;

public class LinkedLIst {
    private class Node{
        private int value;
        private Node next; // reference to next node 
        public Node(int value) {
            this.value =  value;
        }
        
    }
    private Node head;
    private Node tail;

    public void addLast(int item){
        var node = new Node(item);
        if(head == null){
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            tail = node;
        }
       
    }

    public void addfirst(int item){
        var node = new Node(item);
        if (head == null){
            head = node;
            tail = node;
        }
        else {
            node.next = head;
            head = node;
        } 
    }

    public int indexOf( int item){
        var current = head;
        int index = 0;
        while(current != null){
            if(current.value == item){
                // System.out.println(index);
                return index;
            }
            current = current.next;
            index++;
        }
        // System.out.println(-1);
        return -1;

    }
    
    public boolean contains(int item){
        return indexOf(item) != -1;
    }
    public void removeFirst(){
        if(head == null){
            throw new NoSuchElementException() ;
        }
        if (head == tail){
            head = tail =null;
            return ; 
        }
        var second = head.next;
        head.next = null;
        head = second ;
    }

    public void removeLast(int item){
        if(head == null){
            throw new NoSuchElementException() ;
        }
        if (head == tail){
            head = tail =null;
            return ; 
        }
        
        var previous = getPrevious(tail);
        tail =  previous;
        tail.next = null;
    }

    private Node getPrevious(Node node){
        var current = head;
        while(current!= null){
            if (current.next == node){
                return current;
                
            }
            current = current.next;
        }
        return null;
    }




    


    public static void main(String[] args) {
        var list = new LinkedLIst();
        list.addLast(10);
        list.addLast(20);

        
    }
}
