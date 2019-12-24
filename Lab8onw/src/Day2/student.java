package Day2;

/**
 * Student class created from Person class By Mubariz Khan
 */
public class student extends Person {
    /**
     * a private field age  of a student
     */

    private int age;
    /**
     * Constructor for the class
     * will take in name and age
     */

    public student(String name, int age)
    {
        super(name);
        this.age = age;
    }


}
