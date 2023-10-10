package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected int length;
    protected int width;

    //    Constructor
    public qudrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getlength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

}
