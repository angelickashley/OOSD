//Represents the office room - holds up to 2 employees
public class Office {
    private int roomNumber;           //Unique room number, assigned automatically
    private Employee[] occupants;     //Employees assigned to this office (max 2)
    private int occupantCount;        //How many are currently assigned

    //Auto-assign room number - starts from 100
    private static int nextRoomNo = 100;

    //Constructor - gives the office the next room number and an empty occupants array
    public Office() {
        this.roomNumber = nextRoomNo++;
        occupants = new Employee[2];    //capacity = 2
        occupantCount = 0;
    }

    //Returns this office's room number
    public int getRoomNumber() {
        return roomNumber;
    }

    //Returns true if there is still room for another employee
    public boolean hasSpace() {
        return occupantCount < occupants.length;
    }

    //Assign employee - if there is space
    public boolean addEmployee(Employee emp) {
        if (!hasSpace()) {
            return false;           //full - cannot add
        }
        occupants[occupantCount] = emp;
        occupantCount++;
        return true;
    }

    //Return how many people are in this office
    public int getEmployeeCount() {
        return occupantCount;
    }

    //Return one assigned employee by index, or null if the index is invalid
    public Employee getEmployee(int index) {
        if (index >= 0 && index < occupantCount) {
            return occupants[index];
        }
        return null;
    }

    //Builds a readable summary of the office and the names of its occupants
    @Override
    public String toString() {
        String desc = "Office " + roomNumber + " | Occupants: " + occupantCount + "/2";
        if (occupantCount > 0) {
            desc += "\n Assigned: ";
            for (int i = 0; i < occupantCount; i++) {
                desc += "\n - " + occupants[i].getName();
            }
        }
        return desc;
    }
}