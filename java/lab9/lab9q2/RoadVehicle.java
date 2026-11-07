public abstract class RoadVehicle implements ImportDuty
{
    private String make;
    private double value;   // declared value of the vehicle in EUR

    public RoadVehicle(String make, double value)
    {
        this.make = make;
        this.value = value;
    }

    public String getMake()
    {
        return make;
    }

    public double getValue()
    {
        return value;
    }

    // calculateDuty() is left abstract: Car and HGV each use their own tax rate
    @Override
    public String toString()
    {
        return make + ", value EUR " + String.format("%.2f", value);
    }
}
