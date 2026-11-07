public class Car extends RoadVehicle
{
    private int numDoors;

    public Car(String make, double value, int numDoors)
    {
        super(make, value);
        this.numDoors = numDoors;
    }

    @Override
    public double calculateDuty()
    {
        return getValue() * CARTAXRATE;
    }

    @Override
    public String toString()
    {
        return "Car: " + super.toString() + ", " + numDoors + " doors";
    }
}
