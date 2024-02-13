package Array;

public class MaxSubArraySumPrefix{

    public static void printMaxSubArraySum(int[] array){

        int maxSum = Integer.MIN_VALUE;
        int[] prefixArray = new int[array.length];
        prefixArray[0] = array[0];

        for(int i = 1; i < prefixArray.length; i++)
            prefixArray[i] = prefixArray[i - 1] + array[i];



        for(int i = 0; i < array.length; i++){

            for(int j = i; j < array.length; j++){

               int sum = (i == 0) ? prefixArray[j] : prefixArray[j] - prefixArray[i - 1];
              
               if(sum >= maxSum)
                    maxSum = sum;
            }
        }

        System.out.println("Max : " + maxSum);
    }

    public static void main(String[] args) {

        int[] array = new int[]{21, 85, 45, 69, 78, 365, 45, 215, 85, 452};

        printMaxSubArraySum(array);
        
    }
}