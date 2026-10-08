import java.util.Scanner;

//Main program for the HR system - lets the user list offices, create employees and list employees
public class MyHR {
    /*Make these STATIC so ALL methods can access them*/
    private static Scanner scanner = new Scanner(System.in);    //Reads user input from the keyboard
    private static Office[] offices = new Office[3];            //The 3 offices in the company
    private static Employee[] employees = new Employee[5];      //Stores up to 5 employees
    private static int employeeCount = 0;                       //How many employees have been created so far

    public static void main(String[] args) {
        /*Initialize offices*/
        //Each array slot starts as null, so an Office object must be created for each one
        for (int i = 0; i < 3; i++) {
            offices[i] = new Office();
        }

        int choice;

        //Keep showing the menu until the user chooses 0 to exit
        do {
            System.out.println("\n MY HR SYSTEM");
            System.out.println("1. List all offices");
            System.out.println("2. Create new employee");
            System.out.println("3. List all employees");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            //nextInt() leaves the Enter key in the buffer, so this clears it
            //Without it, the next nextLine() would read an empty string
            scanner.nextLine();

            //Run the method that matches the user's choice
            switch (choice) {
                case 1:
                    listOffices();
                    break;
                case 2:
                    createEmployee();
                    break;
                case 3:
                    listEmployees();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();    //Release the keyboard input resource
                    break;
                default:
                    //Any number that isn't 0-3
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    /*All helper methods are STATIC now*/

    //Prints details of every office (uses Office's toString method)
    private static void listOffices() {
        System.out.println("\nAll Offices");

        //Enhanced for loop - goes through each office in the array
        for (Office off : offices) {
            System.out.println(off);
        }
    }

    //Asks the user for employee details, then creates and stores the employee
    private static void createEmployee() {
        //The employees array only has room for 5, so stop before going out of bounds
        if (employeeCount >= 5) {
            System.out.println(" Max 5 employees reached");
            return;
        }

        System.out.println("\n New Employee");

        //Get the employee's name
        System.out.print("Name: ");
        String name = scanner.nextLine();

        //Get the address parts and combine them into an Address object
        System.out.print("Street: ");
        String street = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("County: ");
        String county = scanner.nextLine();
        Address addr = new Address(street, city, county);

        //Find out if this is a Staff member or a Manager
        System.out.print("Type (Staff/Manager): ");
        String type = scanner.nextLine();

        //Only managers get a company car, so it stays null for staff
        String car = null;
        if (type.equalsIgnoreCase("Manager")) {
            System.out.print("Company Car: ");
            car = scanner.nextLine();
        }

        /*Show available offices*/
        //Only list offices that still have space, so the user can't pick a full one
        System.out.println("\n Available offices:");
        for (int i = 0; i < offices.length; i++) {
            if (offices[i].hasSpace()) {
                System.out.println(" " + i + " -> Room " + (100 + i));
            }
        }

        //The user picks an office by its index (0, 1 or 2)
        System.out.print("Assign to office index: ");
        int pick = scanner.nextInt();
        scanner.nextLine();    //Clear the leftover Enter key again

        //Check the index is within the array and the chosen office isn't full
        if (pick < 0 || pick >= 3 || !offices[pick].hasSpace()) {
            System.out.println("Invalid or full office");
            return;
        }

        //Call the Employee constructor that matches the type
        //The manager version takes a car, the staff version doesn't
        Employee emp;
        if (type.equalsIgnoreCase("Manager")) {
            emp = new Employee(name, addr, offices[pick], car);
        } else {
            emp = new Employee(name, addr, offices[pick]);
        }

        //Store the new employee in the next free slot, then move the counter along
        employees[employeeCount] = emp;
        employeeCount++;
        System.out.println(" Employee added!");
    }

    //Prints every employee that has been created so far
    private static void listEmployees() {
        System.out.println("\nAll Employees");

        //Nothing to show if no employees have been created yet
        if (employeeCount == 0) {
            System.out.println("No employees yet");
            return;
        }

        //Loop to employeeCount (not the array length) because unused slots are still null
        for (int i = 0; i < employeeCount; i++) {
            System.out.println(employees[i]);
        }
    }
}