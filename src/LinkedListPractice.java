import java.util.*;

public class LinkedListPractice {

    public static void main(String args[]){
        LinkedList ll=new LinkedList();

        ll.add(1);
        ll.add(2);
        ll.add(10);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        Collections.sort(ll,new CustomComparator());
        ListIterator li=ll.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
            //System.out.println(li.previousIndex());
        }
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());


    }
    public static class CustomComparator implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            System.out.println((int)o1+"-----------"+(int)o2);
            return (int)o1<(int)o2?0:-1;
        }
    }
}
