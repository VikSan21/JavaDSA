package Array;

import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] array, int key){

        for(int i = 0; i < array.length; ++i){

            if(array[i] == key)
                return i;
        }
        return -1;
    }

    public static void getArrayValue(int[] array){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the values in Array!");

        for(int i = 0; i < array.length; ++i){
            System.out.print("Array[ " + i + " ] : ");
            array[i] = scan.nextInt();
        }
        scan.close();
    }
    

    public static void main(String[] args) {
        int[] array = new int[10];
        getArrayValue(array);

        System.out.println("\n");

        System.out.print(linearSearch(array, 10));

    }
}
