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

	Dog dog = new Dog("Spike");
    Labrador labrador = new Labrador("Billy", "YELLOW");
    Yorkshire yorkshire = new Yorkshire("yorky",14);

        dogArrayList.add(dog);
        dogArrayList.add(labrador);
        dogArrayList.add(yorkshire);



        dogArrayList.forEach((n) -> n.getName();


        System.out.println(labrador.getName() + " says " + labrador.bark());
	System.out.println(dog.getName() + " says " + dog.bark());
        System.out.println(yorkshire.waddle());
        System.out.println(yorkshire.getName() + " says " + yorkshire.bark());
        System.out.println(labrador.waddle());
	
	

    }
}
