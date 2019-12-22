package mak;

public class Circle {

    public double radius;
    public Circle(double r)
    {
        radius = r;
    }

    public double get_area()
    {
        return (radius * radius) * Math.PI;
    }

    public double get_diameter()
    {
        return (radius * 2);
    }

    public double get_circumference()
    {
        return (2 *Math.PI * radius);
    }
}
