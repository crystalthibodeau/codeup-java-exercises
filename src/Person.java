
public class Person {
    //===================================================BONUS'S============================================================
//    Bonus's
//
//    Allow all of your methods for getting input to accept an optional String parameter named prompt. If passed, the method should show the given prompt to the user before parsing the input.
//
//    After a circle is created, use the yesNo method of your Input class and ask the user if they would like to make another. Continue creating circles and displaying information about them until the user says they do not want to continue.
//
//    Before exiting, the program should output the total number of circles created. Use a private static property, along with a public static method to keep track of and display the total number of circles created.

//=========================================Question #1==================================================================
// 1.Object basics
//    Create Person class inside of src that has a private name property that is a string, and the following methods:
//    // returns the person's name
//    public String getName();
//    // changes the name property to the passed value
//    public void setName(String name);
//    // prints a message to the console using the person's name
//    public void sayHello();

//    The class should have a constructor that accepts a String value and sets the person's name to the passed string.
//    Create a main method on the class that creates a new Person object and tests the above methods.
private String name;


    public Person(){

    }
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("\nHello, %s\n", name);
    }
//
//==================================================Question #2=========================================================

//    2.Understanding references
//    The following code blocks make use of the Person class from the previous exercise. For each code block, think about what the code will output, then copy the code into IntelliJ and run it to see if it matches your expectations.

//        paste the following code into the main function to execute!....
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//
//        System.out.println(person1.getName().equals(person2.getName())); //true
//        System.out.println(person1 == person2); //false (not referencing same origin point?)

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //always true! same initial memory reference

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());//remember the friend reference. if two people know john and john becomes jane they both have to re-learn jane's name...

//==================================================Question #3=========================================================
//    3.Continue to input.java and inputTest.java
//==================================================Question #4=========================================================
//   4.Continue to circle.java from shapes
//==================================================Start of Main=======================================================

    public static void main(String[] args) {

//===================================================FUNCTION CALLS=====================================================

        Person rick = new Person("rick");
        rick.sayHello();
        Person Crystal = new Person();
        Crystal.setName("Crystal");
        System.out.println(Crystal.getName());
        Crystal.sayHello();

 }
};