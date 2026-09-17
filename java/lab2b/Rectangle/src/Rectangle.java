public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        setLength(1.0);
        setWidth(1.0);
    }

    public void setLength(double len) {
        if (len > 0.0 && len <= 40.0) {
            length = len;
        } else {
            width = 1.0;    //default invalid
            System.out.println("Invalid Width");
        }
    }

    public void setWidth(double wid) {
        if (wid > 0.0 && wid <= 40.0) {
            width = wid;
        } else {
            width = 1.0;    //default invalid
            System.out.println("Invalid Width");
        }
    }

    /*get methods*/
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String toString() {
        return "Length = " + length + ", Width" + width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void printRectangle() {   /* w = width, h = height*/
        int w = (int) Math.round(width);
        int h = (int) Math.round(length);

        for (int i = 0; i < w; i++) System.out.print("*");
        System.out.println(" ");
        for (int row = 1; row < h - 1; row++) {
            System.out.print("*");
            for (int col = 1; col < w - 1; col++) System.out.print(" ");
            System.out.println("*");
        }
    if (h > 1){
        for (int i = 0; i < w; i++) System.out.print("*");
        System.out.println(" ");
    }
    }
}