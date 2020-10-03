import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class denim {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6};

        String[] array2 = new String[]{"1", "2", "3", "4", "5", "6"};

        System.out.println("array before reverse: " + Arrays.toString(array) );
        for(int i=0; i<array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp;
        }
        System.out.println("array after reverse: " + Arrays.toString(array) );


//        callback for object array
//        reverse(array);
        //=======================Main Method End=======================
    }
    //==================You are outside Main Method now================

//    works if array is assigned as object
//    public static void reverse(Object[] arr) {
//        List<Object> list = Arrays.asList(arr);
//        Collections.reverse(list);
//        System.out.println(Arrays.toString(list.toArray()));
//    }
//=======================This is the end=======================
}
