package shapes;

public class Square extends Quadrilateral{
    @Override
    public double getPerimeter() {
        return length * length;
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

//    Constructor
    public Square(int side) {
        super(side, side);
    }
//
//    public int getArea() {;
//        return length * length;
//    }
//
//    public int getPerimeter() {
//        return 4 * length;
//    }
}
