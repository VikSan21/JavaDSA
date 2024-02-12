package Array;

public class LargestNumber {

    //to get the largest number from the array
    public static int getLargestNumber(int[] array){
        int largestNumber = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; ++i){

            if( array[i] >= largestNumber)
                largestNumber = array[i];
        }
        return largestNumber;
    }

    //to get the smallest number from array
    public static int getSmallestNumber(int[] array){
        int smallestNumber = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; ++i){

            if( array[i] <= smallestNumber)
                smallestNumber = array[i];
        }
        return smallestNumber;
    }
    
    public static void main(String[] args) {
        int[] array = new int[5];

        //to get the array value from the user
        LinearSearch.getArrayValue(array);

        System.out.println("Largest number : " + getLargestNumber(array));
        System.out.println("Smallest number : " + getSmallestNumber(array));
    }
}
