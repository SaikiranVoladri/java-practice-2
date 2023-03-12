import java.lang.reflect.Array;
import java.util.*;
public class collections {
    public static void main(String args[]){
        ArrayList <Integer> l= new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(50);
        l.add(0);
        l.add(3);
        Collections.sort(l);

        ArrayList<Integer> l1= new ArrayList<>();
        l1= (ArrayList)l.clone();

        Iterator i= l1.listIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    //    int bs= Collections.binarySearch(l, 5);
    //    System.out.println(bs);
    // System.out.println(l);
    }

    
}
