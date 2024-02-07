// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
	Dog dog = new Dog("Spike");
    Labrador labrador = new Labrador("Billy", "YELLOW");
        System.out.println(labrador.getName() + " says " + labrador.bark());
	System.out.println(dog.getName() + " says " + dog.bark());
	
	

    }
}
