public class TestPerson
{
    public static void main(String[] args)
    {
        // Polymorphic array: Person references holding subclass objects
        Person[] people = new Person[2];
        people[0] = new Employee("Alice Smith", 45000.0);
        people[1] = new Student("John Doe", "Software Development");

        for (Person p : people)
        {
            System.out.println(p.getName() + ": " + p.getDescription());
        }
    }
}
