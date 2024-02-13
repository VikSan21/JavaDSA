package Array;

public class MinSubArraySumPrefix {
    

    public static void printMinSubArraySum(int[] array){

        int minSum = Integer.MAX_VALUE;
        int[] prefixArray = new int[array.length];
        prefixArray[0] = array[0];

        for(int i = 1; i < prefixArray.length; i++)
            prefixArray[i] = prefixArray[i - 1] + array[i];



        for(int i = 0; i < array.length; i++){

            for(int j = i; j < array.length; j++){

               int sum = (i == 0) ? prefixArray[j] : prefixArray[j] - prefixArray[i - 1];
              
               if(sum <= minSum)
                    minSum = sum;
            }
        }

        System.out.println("Max : " + minSum);
    }

    public static void main(String[] args) {

        int[] array = new int[]{21, 85, 45, 9, 78, 365, 45, 215, 85, 452};

        printMinSubArraySum(array);
        
    }
}
