import java.lang.reflect.Array;
import java.util.*;

public class denim {
    public static void main(String[] args) {

//        int[] array = {1, 2, 3, 4, 5, 6}; OR ->
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        String[] array2 = new String[]{"hello", "there", "3", "4", "5", "6"};
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);


        reversed(array);
        reversedString(array2);
        swap(array);
        swapList(intList);
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

    public static void swapList(ArrayList<Integer> arr){
        System.out.println("array before swap list: " + arr );
        int swap1 = arr.get(0);
        int swap2 = arr.get(arr.size() -1);
        arr.set(0, swap2);
        arr.set(arr.size() -1, swap1);
        System.out.println("array after swap list: " + arr);
    }
    //=======================This is the end=======================
}
