package Patterns;

/* 
        Solid Rhombus

                   *  *  *  *  * 
               *  *  *  *  * 
            *  *  *  *  * 
      *  *  *  *  * 
 */

public class Rhombus {

    public static void printSolidRhombus(int rowcols){

        for(int i = 1; i <= rowcols; ++i){

            for(int spaces = 1; spaces <= rowcols - i; ++spaces)
                System.out.print("   ");

            for(int stars = 1; stars <= rowcols; ++stars)
                System.out.print(" * ");

            System.out.println();    
        }
    }

    public static void printHollowRhombus(int rowcols){

        for(int i = 1; i <= rowcols; ++i){

            for(int spaces = 1; spaces <= rowcols - i; ++spaces)
                System.out.print("   ");

            for(int stars = 1; stars <= rowcols; ++stars)
                if (stars == 1 || stars == 5 || i == 1 || i == rowcols) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }

            System.out.println();    
        }
    }

    public static void main(String[] args) {
        printSolidRhombus(5);
    }
    
}
