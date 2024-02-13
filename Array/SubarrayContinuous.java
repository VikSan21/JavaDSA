package Array;

import java.util.ArrayList;

public class SubarrayContinuous {
    
        public static void printSubArrayContinuous(int[] array){
            ArrayList<Integer> integers = new ArrayList<>();
            int minSum = Integer.MAX_VALUE, maxSum = Integer.MIN_VALUE, sum = 0;
            for(int i = 0; i < array.length; i++){

                for(int j = i; j < array.length; j++){

                   for(int k = i; k <= j; k++){

                       integers.add(array[k]);
                       sum += array[k];


                   }
                   System.out.println(integers);
                   integers.clear();
                   if(sum >= maxSum)
                        maxSum = sum;
                   if(sum <= minSum)
                        minSum = sum; 
                   sum = 0;
                }
                System.out.println();
            }

            System.out.println("Max : " + maxSum);
            System.out.println("Min : " + minSum);
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