import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person human) {
        people = Arrays.copyOf(people, people.length + 1);
        people[people.length - 1] = human;
        return people;
    }
//=====================================================Question 1=======================================================

    //    1.Array Basics
//
//    Create a class inside of src named ArraysExercises. Create a main method for this class to do your work.
    public static void main(String[] args) {
//===================================================FUNCTION CALLS=====================================================
//What happens when you run the following code? Why is Arrays.toString necessary?
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers)); //references memory location instead of printing values
// Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

//    String[] Persons = {"John", "Paul", "Ringo"};
//    for (int i = 0; i < Persons.length; i += 1) {
//        System.out.println(Persons[i]);
//    }
        Person[] people = new Person[3];
//    Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
        people[0] = new Person("Crystal");
        people[1] = new Person("Jane");
        people[2] = new Person("Thomas");
        Person rick = new Person("Rick");
        people = addPerson(people, rick);
        for (int i = 0; i < people.length; i += 1) {
            System.out.println(people[i].getName());
        }
//=====================================================Question 2=======================================================
//    2.See ServerNameGenerator
//=====================================================Question 3=======================================================
//    3.Movie List
//    See MovieApplication, Movie, MoviesArray, and Input
//=====================================================BONUS============================================================
//    Add functionality to allow a user to add a new movie to the list.
    }
}