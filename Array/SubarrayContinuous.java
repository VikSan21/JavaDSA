package Array;

import java.util.ArrayList;

public class SubarrayContinuous {
    
        public static void printSubArrayContinuous(int[] array){
            ArrayList<Integer> integers = new ArrayList<>();
            for(int i = 0; i < array.length; i++){

                for(int j = i; j < array.length; j++){

                   for(int k = i; k <= j; k++){

                       integers.add(array[k]);
                   }
                   System.out.println(integers);
                   integers.clear();
                }
                System.out.println();
            }
            int totalSubArray = array.length*(array.length + 1) / 2;
            System.out.println("Total SubArrays : " + totalSubArray);
        }

        public static void main(String[] args) {
            int[] array = {2, 8, 11, 19, 21, 27};
            printSubArrayContinuous(array);
        }

}

//task : find sum of subarrays and find max and min 
// task 1