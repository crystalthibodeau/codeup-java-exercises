package shapes;

public class Rectangle {
    protected int length;
    protected int width;
//    Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
public Rectangle(int widthNum, int lengthNum) {
    this.width = widthNum;
    this.length = lengthNum;
}
//public Square(){}

public int getArea() {
    return width * length;
}
public int getPerimeter() {
    return 2 * length + 2 * width;
}

}