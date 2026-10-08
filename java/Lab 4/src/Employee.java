//Represents an employee - can be staff or manager
public class Employee {

    //Instance fields (each employee has their own copy)

    private int employeeNo;           //Unique ID, assigned automatically on creation
    private String name;              //Employee's full name
    private Address address;          //Home address (Address is a separate class)
    private String type;              //Either "Staff" or "Manager"
    private String companyCar;        //Car details - only used for Managers, null for Staff
    private Office assignedOffice;    //Office the employee works in, null if the office was full

    //Static fields (shared by every Employee object)

    //Next ID to hand out. Starts at 1000 and goes up by one for each new employee
    private static int nextEmployeeNo = 1000;

    //Running count of how many Employee objects have been created
    private static int totalEmployees = 0;

    //Constructors

    //Private shared constructor
    //Only the two public constructors below can call this, so "type" is always
    //set correctly ("Staff" or "Manager") and can't be passed in wrongly from outside
    private Employee(String name, Address address, Office office, String type, String companyCar) {
        //Assign the next free ID, then increment so the next employee gets a different one
        this.employeeNo = nextEmployeeNo++;

        //Store the details passed in
        this.name = name;
        this.address = address;
        this.type = type;
        this.companyCar = companyCar;

        //Update the shared counter of employees created
        totalEmployees++;

        //Try to add this employee to the office - addEmployee returns false if the office has no space
        if (!office.addEmployee(this)) {
            //Office is full: tell the user, and leave assignedOffice as null
            System.out.println("Office is full - could not assign " + name);
        } else {
            //Office accepted the employee, so record which office they belong to
            this.assignedOffice = office;
        }
    }

    //Public constructor for staff - no company car needed
    //Calls the private constructor with type "Staff" and null for the car
    public Employee(String name, Address address, Office office) {
        this(name, address, office, "Staff", null);
    }

    //Public constructor for managers - takes a company car
    //Calls the private constructor with type "Manager" and the car details
    public Employee(String name, Address address, Office office, String companyCar) {
        this(name, address, office, "Manager", companyCar);
    }

    //Methods

    //Static method - belongs to the class, not an object, so call it with
    //Employee.getTotalEmployees(). Returns how many employees have been created in total
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    //Getter - returns this employee's name
    public String getName() {
        return name;
    }

    //Builds a readable summary of the employee, used when printing the object
    //e.g. System.out.println(employee);
    @Override
    public String toString() {
        //Basic details that every employee has
        String details = "Employee #" + employeeNo + " | Name: " + name + " | Type: " + type
                + "\n Address: " + address;

        //Only managers have a company car, so only show it for them
        if (type.equals("Manager")) {
            details += "\n Company Car: " + companyCar;
        }

        //Only show the office if one was successfully assigned (it's null if the office was full)
        if (assignedOffice != null) {
            details += "\n Assigned to Office: " + assignedOffice;
        }

        return details;
    }
}