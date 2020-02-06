package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Object> Students = new HashMap<>();
        Students.put("Ryan", new Student("Student-test", 90));
//        Students.put("Zach", "zgulde");
//        Students.put("Fernando", "fmendozaro");
//        Students.put("Justin", "jreich5");


        System.out.println(Students.get(Students.keySet()));

    }
}
