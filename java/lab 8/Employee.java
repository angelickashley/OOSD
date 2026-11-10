public class Employee extends Person
{
	private double annualSalary;

	public Employee(String name, double annualSalary)
	{
		super(name);
		this.annualSalary = annualSalary;
	}

	public String getDescription()
	{
		return "An employee with a salary of " + annualSalary;
	}
}
