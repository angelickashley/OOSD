public class lab1q1 {
    public static void main (String[] args){
        ThermTest.main();   //go to main method and run therm test
        Thermometer thermB = new Thermometer(10.0);     //create new obj from Thermometer class
                                                            //use second constructor - put 10.0 as default
        double tempB = thermB.getCelsius();
        System.out.println("Temp. of Thermometer B is " + tempB);
    }
}