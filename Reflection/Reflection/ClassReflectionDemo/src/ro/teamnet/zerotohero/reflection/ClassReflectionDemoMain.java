package ro.teamnet.zerotohero.reflection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO
 * in order to resolve the exercises below, you will have to create
 * all the needed clasees, with their members and methods
 * (in ro.teamnet.zerotohero.reflection.demoobjects package)
 */
public class ClassReflectionDemoMain {
    public static void main(String[] args) throws NoSuchFieldException {
        //TODO get the class for a String object, and print it
        System.out.println("Alexandra".getClass());

        //TODO get the class of an Enum, and print it
//        name_enum bbbb = new name_enum();
//        System.out.println(bbbb.getClass());


        //TODO get the class of a collection, and print it

        MyArrayList llist = new MyArrayList();
        System.out.println(llist.getClass());

        //TODO get the class of a primitive type, and print it
        int a=5;
        System.out.println(((Object) a).getClass());

        //TODO get and print the class for a field of primitive type
        try {
            System.out.println(((Object) a).getClass().getField("MIN_VALUE"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        //TODO get and print the class for a primitive type, using the wrapper class
        Integer b=5;
        System.out.println(b.getClass());
        //TODO get the class for a specified class name
        cars masina = new cars(23);
        System.out.println(masina.getClass());

        //TODO get the superclass of a class, and print it
        System.out.println(masina.getClass().getSuperclass());
        //TODO get the superclass of the superclass above, and print it
        System.out.println(masina.getClass().getSuperclass().getSuperclass());

        //TODO get and print the declared classes within some other class
        

        //TODO print the number of constructors of a class
        

        //TODO get and invoke a public constructor of a class
        

        //TODO get and print the class of one private field 
        
		
		//TODO set and print the value of one private field for an object
        

        //TODO get and print only the public fields class
        

        //TODO get and invoke one public method of a class
        

        //TODO get and invoke one inherited method of a class
       
		
		//TODO invoke a method of a class the classic way for ten times, and print the timestamp (System.currentTimeMillis())
		//TODO invoke a method of a class by Reflection for 100 times, and print the timestamp
		//what do you observe?
		
    }
}
