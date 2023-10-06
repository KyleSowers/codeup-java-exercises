package shapes;

public class ShapesTest {

    public static void main(String[] args) {

//        Variable Rectangle
        Rectangle box1 = new Rectangle(5, 4);
//        Testing getArea()/getPerimeter()
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());
//        Additional Variable
        Rectangle box2 = new Square(5);
//        testing getArea()/getPerimeter()
        System.out.println(box2.getArea());
        System.out.println(box2.getPerimeter());
    }
}
