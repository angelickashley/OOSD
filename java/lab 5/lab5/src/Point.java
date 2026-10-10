// Purpose : Describes a point in 2D space
public class Point
{
    protected int x;
    protected int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public String toString()
    {
        return "[" + x + ", " + y + "]";
    }
}