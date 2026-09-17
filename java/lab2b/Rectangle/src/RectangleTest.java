public class RectangleTest {
    public static void main(String[] args){
        System.out.println("Q1: Testing Rectangle Class");

        Rectangle rect1 = new Rectangle();
        System.out.println("Default Rectangle: " + rect1);

        //setting valid values
        rect1.setLength(5);
        rect1.setWidth(10);
        System.out.println("Changed Values: " + rect1);

        //invalid values
        rect1.setLength(50);
        rect1.setWidth(-3);
        System.out.println("After Invalid Outputs:  " + rect1);
        System.out.println("Changed Values: " + rect1);
        System.out.println("Q2: Area and Perimeter");
        Rectangle rect2 = new Rectangle();
        rect2.setLength(7);
        rect2.setWidth(5);
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
        System.out.println("Q3");
        rect2.printRectangle();
        Rectangle rect3 = new Rectangle();
        rect3.setLength(10);
        rect2.setWidth(4);
        rect2.printRectangle();
    }
}