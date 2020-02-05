package shapes;

public class ShapesTest {


    public static void main(String[] args) {

        Measurable myShape = new Square(5);
        Measurable myShape2 = new Rectangle(4,5 );
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());
//==============================================CODE FOR FIRST ASSIGNMENT===============================================

//        create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
//        verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//        create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
//        verify that the getPerimeter and getArea methods return 20 and 25, respectively

//        Rectangle box1 = new Rectangle(4,5);
//        Rectangle box2 = new Square(5);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

    }
}
