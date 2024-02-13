package Array;

public class PairsArray {

    public static void getPairsArray(int[] array){
        int tp = 0;// total pairs
        for(int i = 0; i < array.length; i++){

            for(int j = i + 1; j < array.length; j++){
                String result = String.format("(%d, %d), ", array[i],array[j]);
                tp++;
                System.out.print(result);
            }
            System.out.println();

        }
        System.out.println("Total pairs : " + tp); // n(n - 1) / 2

    }

    public static void main(String[] args) {
        
        int[] array = {2, 8, 11, 19, 21, 27};
        getPairsArray(array);
    }
}
