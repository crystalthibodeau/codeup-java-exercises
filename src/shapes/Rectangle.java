package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double widthNum, double lengthNum) {
        super(widthNum, lengthNum);
    }

    @Override
    public double setWidth() {
        return width;
    }

    @Override
    public double setLength() {
        return length;
    }
}
//==============================================CODE FOR FIRST ASSIGNMENT===============================================
//public class Rectangle {
//    protected int length;
//    protected int width;
//    protected int side;
//        Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//public Rectangle(int widthNum, int lengthNum) {
//    this.width = widthNum;
//    this.length = lengthNum;
//}
//public int getArea() {
//    return width * length;
//}
//public int getPerimeter() {
//    return (2 * length) + (2 * width);
//}

//}
