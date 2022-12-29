package collectionsExamaples;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayList1 {
    public static void main(String args[]) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(11);
        list1.add(66);
        list1.add(55);

        List<String> list2 = new ArrayList<String>();
        list2.add("java");
        list2.add("sql");
        list2.add("python");

        System.out.println(list1.remove(0));

        Collections.sort(list1);
        System.out.println(list1);
        Collections.sort(list2);
        System.out.println(list2);

        List<Object> obj = new ArrayList<Object>();
        obj.addAll(list1);
        obj.addAll(list2);
        System.out.println(obj.size());

        //for loop

      /*  for(Object o1:obj)
        {
            System.out.println(o1);
        } */


        // listiterator interface
        ListIterator<Object> l1 = obj.listIterator(obj.size()); /////////l1 is captial or not
        while (l1.hasPrevious())
        {
            Object o1 = l1.previous();
            System.out.println(o1);

        }



        /*Iterator itr=obj.iterator();
        while(itr.hasNext()){
        System.out.println(itr.next());
        }

         */






    }
}
