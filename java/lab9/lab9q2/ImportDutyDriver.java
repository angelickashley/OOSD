public class ImportDutyDriver
{
    public static void main(String[] args)
    {
        RoadVehicle[] vehicles = new RoadVehicle[3];
        vehicles[0] = new Car("Toyota Corolla", 20000.00, 5);
        vehicles[1] = new Car("BMW 3 Series", 35000.00, 4);
        vehicles[2] = new HGV("Volvo FH", 90000.00, 18.0);

        System.out.println("Car tax rate: " + ImportDuty.CARTAXRATE);
        System.out.println("HGV tax rate: " + ImportDuty.HGVTAXRATE + "\n");

        for (RoadVehicle v : vehicles)
        {
            System.out.println(v);
            // Polymorphic call: each subclass applies its own rate
            System.out.printf("  Import duty: EUR %.2f%n", v.calculateDuty());
        }
    }
}
