package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;
    protected int side;

    public Quadrilateral(double widthNum, double lengthNum) {
        this.width = widthNum;
        this.length = lengthNum;
    }
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    public abstract double setWidth();
    public abstract double setLength();

}
