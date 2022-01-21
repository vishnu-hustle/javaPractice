import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {

    public static void main(String args[]){
        LinkedList ll=new LinkedList();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        ListIterator li=ll.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
            System.out.println(li.previousIndex());
        }
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());


    }
}
