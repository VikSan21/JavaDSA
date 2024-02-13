package Array;

public class MinSubArraySumBruteForce {

    public static void printMinSubArraySum(int[] array){

        int minSum = Integer.MAX_VALUE, sum = 0;

        for(int i = 0; i < array.length; i++){

            for(int j = i; j < array.length; j++){

               for(int k = i; k <= j; k++){
                   sum += array[k];
               }
              
               if(sum <= minSum)
                    minSum = sum;
               sum = 0;
            }
        }

        System.out.println("Max : " + minSum);
    }


    public static void main(String[] args) {
    
        int[] array = new int[]{21, 85, 45, 69, 78, 365, 45, 215, 85, 452};

        printMinSubArraySum(array);

    }
    
}
