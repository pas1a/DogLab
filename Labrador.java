// ****************************************************************
// Labrador.java
//
// A class derived from Dog that holds information about
// a labrador retriever.  Overrides Dog speak method and includes
// information about avg weight for this breed.
//          
// ****************************************************************


public class Labrador extends Dog
{

    private String color; //black, yellow, or chocolate?
    
// it need to super the name like shown in the Yorkshire class given why the constructor was failing.
    public Labrador(String name,String color)
    {
    super(name);
	this.color = color;
    }

    
    public String bark()
    {
	return "Labrador barking";
    }

public String waddle(){
        return name + " is waddling";
}


}
