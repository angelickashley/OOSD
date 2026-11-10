public class TestPerson
{
	public static void main(String[] args)
	{
		Person[] people = new Person[2];
		people[0] = new Employee("Alice Murphy", 45000.0);
		people[1] = new Student("Brian Walsh", "Computing");

		for (int i = 0; i < people.length; i++)
		{
			System.out.println("Name: " + people[i].getName());
			System.out.println("Description: " + people[i].getDescription());
			System.out.println();
		}
	}
}
