package Day2;

/**
 * Created by Mubariz Khan
 * Person class uses for storing person information
 */

public class Person{
    /**
     * name of a person
     */
    private String name;



    /** This is a constructor to initialize the names of the person class object
     */

    public Person(String name) {
        this.name = name;
    }



    /**
     * This a public method used to set the name of the object
     * @param  name
     */

    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Returns the name of the object
     * @return name
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * function that prints The name of the object
     *
     */

    public void sayName()
    {
        System.out.println("Hi my name is " + this.name);
    }
}
