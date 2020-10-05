import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class denim {
    public static void main(String[] args) {

//        int[] array = {1, 2, 3, 4, 5, 6}; OR ->
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        String[] array2 = new String[]{"hello", "there", "3", "4", "5", "6"};

        reversed(array);
        reversedString(array2);
        swap(array);
    //        callback for object array
    //        reverse(array);
    //=======================Main Method End=======================
    }


    //==================You are outside Main Method now================

    //    works if array is assigned as object
    public static void reverse(Object[] arr) {
        List<Object> list = Arrays.asList(arr);
        Collections.reverse(list);
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static void reversed(int[] arr){
        System.out.println("array before reverse: " + Arrays.toString(arr) );

        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length -i -1];
            arr[arr.length -i -1] = temp;
        }

        System.out.println("array after reverse: " + Arrays.toString(arr) );
    }

    public static void reversedString(String[] arr){
        System.out.println("array before reverse: " + Arrays.toString(arr) );

        for(int i=0; i<arr.length/2; i++){
            String temp = arr[i];
            arr[i] = arr[arr.length -i -1];
            arr[arr.length -i -1] = temp;
        }

        System.out.println("array after reverse: " + Arrays.toString(arr) );
    }

    public static void swap(int[] arr){
        System.out.println("array before swap: " + Arrays.toString(arr) );
            int swap1 = arr[0];
            int swap2 = arr[arr.length -1];
            arr[0] = swap2;
            arr[arr.length -1] = swap1;

        System.out.println("array after swap: " + Arrays.toString(arr) );
    }

    //=======================This is the end=======================
}
