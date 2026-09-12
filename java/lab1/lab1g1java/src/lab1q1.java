public class lab1q1 {
    public static void main (String[] args){
        ThermTest.main();
        Thermometer thermB = new Thermometer(10.0);
        double tempB = thermB.getCelsius();
        System.out.println("Temp. of Thermometer B is " + tempB);
    }
}