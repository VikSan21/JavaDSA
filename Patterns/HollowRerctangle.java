package Patterns;

public class HollowRerctangle{

    public static void printHollowRerctangle(int rows, int cols){
        for(int i = 1; i <= rows; ++i){
            for(int j = 1; j <= cols; ++j){
                if(i == 1 || i == rows || j == 1 || j ==cols)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void printHollowSquare(int rowcols){
        printHollowRerctangle(rowcols, rowcols);
    }

    public static void main(String[] args) {
        printHollowRerctangle(10, 5);
        printHollowSquare(5);
    }

    /* 
            Hollow Rectangle 10*5
     

                *  *  *  *  * 
                *           * 
                *           * 
                *           * 
                *           * 
                *           *
                *           *
                *           *
                *           * 
                *  *  *  *  *
     

     */
}