// Purpose : A circle is a Point (its centre) with a radius
public class Circle extends Point
{
    protected double radius;

    public Circle(int x, int y, double radius)
    {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public String toString()
    {
        return "Centre = " + super.toString() + "; Radius = " + radius;
    }
}