package Array;

public class LargestNumber {

    public static int getLargestNumber(int[] array){
        int LargestNumber = array[0];
        for(int i = 1; i < array.length; ++i){

            if( array[i] >= LargestNumber)
                LargestNumber = array[i];
        }
        return LargestNumber;
    }
    
    public static void main(String[] args) {
        int[] array = new int[10];

        LinearSearch.getArrayValue(array);

        System.out.println("Largest number : " + getLargestNumber(array));
    }
}
