package mak;

public class Vector {
    private double length;
    private double angle;

    Vector(double a, double b)
    {
        this.length = a;
        this.angle = b;
    }

    void print_vector()
    {
        System.out.println(this.length);
        System.out.println(this.angle);
    }
}
