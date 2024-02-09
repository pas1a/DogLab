// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************

import java.util.ArrayList;
import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {

        ArrayList<Dog> dogArrayList = new ArrayList<Dog>();

	Dog dogs = new Dog("Spike");
    Labrador labrador = new Labrador("Billy", "YELLOW");
    Yorkshire yorkshire = new Yorkshire("yorky",14);

        dogArrayList.add(dogs);
        dogArrayList.add(labrador);
        dogArrayList.add(yorkshire);

        for (int i = 0; i < dogArrayList.size(); i++) {
          System.out.println(dogArrayList.get(i).bark());
          
        }

         for(Dog dog: dogArrayList){
           System.out.println(dogs.bark());
         }
      
System.out.println(((Yorkshire)yorkshire).waddle());
        

        System.out.println(labrador.getName() + " says " + labrador.bark());
	System.out.println(dogs.getName() + " says " + dogs.bark());
        System.out.println(yorkshire.waddle());
        System.out.println(yorkshire.getName() + " says " + yorkshire.bark());
        System.out.println(labrador.waddle());
	
	

    }
}
