package bootcamp;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};  //

        int[] arr2 = new int[5];

        arr2[2] = 300;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("---------------------------------------------------");

        int[] arr3 = new int[10]; // {0, 0, 0 0, 0, 0, 0, 0, 0, 0}

        for(int i = 0, j =2; i < arr3.length; i++, j+=2){
            arr3[i] = j;
        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("---------------------------------------------------");

        for(int each : arr3){
            System.out.println(each);
        }





    }

}
