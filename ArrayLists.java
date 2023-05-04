import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add elements
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);

        //get element
        int element = list.get(0);
        System.out.println(element);

        list.add(1,1);
        System.out.println(list);

        //set
        list.set(2, 5);
        System.out.println(list);

        //remove
        list.remove(3);
        System.out.println(list);

        //size

        int size = list.size();
        System.out.println(size);

        //loops
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        //sort

        Collections.sort(list);
        System.out.println(list);

    }
}