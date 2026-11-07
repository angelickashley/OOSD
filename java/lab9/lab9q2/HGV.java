public class HGV extends RoadVehicle
{
    private double maxLoadTonnes;

    public HGV(String make, double value, double maxLoadTonnes)
    {
        super(make, value);
        this.maxLoadTonnes = maxLoadTonnes;
    }

    @Override
    public double calculateDuty()
    {
        return getValue() * HGVTAXRATE;
    }

    @Override
    public String toString()
    {
        return "HGV: " + super.toString() + ", max load " + maxLoadTonnes + " tonnes";
    }
}
