package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    @Override
    public double getPerimeter() {
        return length * width;
    }

    @Override
    public double getArea() {
        return (2 * length) + (2 * width);
    }

    @Override
    public void setLength(int length) {

    }

    @Override
    public void setWidth(int width) {

    }


    ////    Properties
//    protected int length;
//    protected int width;
//
//    Constructor
    public Rectangle(int length, int width) {
        super(length, width);
    }
//
//    public int getArea() {
//        return length * width;
//    }
//
//    public int getPerimeter() {
//        return (2 * length) + (2 * width);
//    }
}
