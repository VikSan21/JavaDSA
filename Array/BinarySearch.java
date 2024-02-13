package Array;

public class BinarySearch{

    public static int binarySearch(int[] array, int key){
        int start = 0, end = array.length - 1;

        while(start <= end){

            int mid = (start + end) / 2;

            if(array[mid] == key)
                return mid;

            if(array[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;    
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {10, 50, 98, 155, 285, 321, 475, 541, 698, 699, 754, 785, 821, 865, 891, 985, 1025, 1145};

        int index = binarySearch(array, 891);

        if (index != -1) 
            System.out.println("Key is found in array : " + index);
        else
            System.out.println("Not found");
    }
}