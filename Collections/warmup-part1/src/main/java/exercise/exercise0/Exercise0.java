package exercise.exercise0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Radu.Hoaghe on 4/20/2015.
 *
 * Exercise 0: Create a List (ArrayList or LinkedList), add elements to it and print all of them using ListIterator
 *             for loop and foreach loop.
 *
 */
public class Exercise0 {

    public Exercise0(){

    }

    public void iterateThroughList(){

        // TODO Exercise #0 a) Create a list (ArrayList or LinkedList) and add elements to it
        ArrayList myList = new ArrayList();
        myList.add(new Integer(5));
        myList.add(new Integer(6));
        myList.add(new Integer(7));
        // TODO Exercise #0 a) Don't forget to specify the type of the list (Integer, String etc.)

        // TODO Exercise #0 b) Iterate through the list using ListIterator and print all its elements
        Iterator it = myList.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + ";");

        }
        System.out.print("\n");
        // TODO Exercise #0 c) Iterate through the list using classic for loop and print all its elements
        for (int i = 0; i < myList.size(); i++){
            System.out.print(myList.get(i).toString() + ";" );
        }
        System.out.print("\n");
        // TODO Exercise #0 d) Iterate through the list using foreach loop and print all its elements
        for (Object list : myList ){
            System.out.print(list + ";");
        }
    }

    public static void main(String[] args) {
        // TODO Exercise #0 e) Create a new instance of Exercise0 class and call the iterateThroughList() method
        Exercise0 var = new Exercise0();
        var.iterateThroughList();
    }
}
