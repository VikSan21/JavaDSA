package Array;

import java.util.Arrays;

public class ReverseArray {
    
    public static void reverseArray(int[] array){

        for(int i = 0; i < array.length / 2; i++ ){
            int temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }

    }


    public static void main(String[] args) {
        int[] array = new int[]{21, 85, 45, 69, 78, 365, 45, 215, 85, 452};

        reverseArray(array);

        System.out.println(Arrays.toString(array));
    }
}
