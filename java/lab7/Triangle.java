public class Triangle extends Shape
{
	private double base;
	private double height;

	public Triangle(String name, String colour, double base, double height)
	{
		super(name, colour);
		this.base = base;
		this.height = height;
	}

	// Right angled triangle: 0.5 * base * height
	public double area()
	{
		return 0.5 * base * height;
	}

	public String toString()
	{
		return super.toString() + "\nBase = " + base + "\nHeight = " + height;
	}
}
