package Patterns;

/* 
                Diamond Pattern


                          * 
                      *  *  *
                   *  *  *  *  *
                   *  *  *  *  *
                      *  *  *
                         *
 */

public class Diamond {

    public static void printDiamond(int row) {
        row = row / 2;

        //first half 
        for(int i = 1; i <= row; ++i){

            for(int spaces = 1; spaces <= row - i; ++spaces)
                System.out.print("   ");

            for(int stars = 1; stars <= (2 * i - 1); ++stars)
                System.out.print(" * ");
                
            System.out.println();    
        }

        //second half
        for(int i = row; i >= 1; --i){

            for(int spaces = 1; spaces <= row - i; ++spaces)
                System.out.print("   ");

            for(int stars = 1; stars <= (2 * i - 1); ++stars)
                System.out.print(" * ");
                
            System.out.println();    
        }
        
    }

    public static void printHollowDiamond(int row){
        row = row / 2;

        //first half 
        for(int i = 1; i <= row; ++i){

            for(int spaces = 1; spaces <= row - i; ++spaces)
                System.out.print("   ");

            for(int stars = 1; stars <= (2 * i - 1); ++stars)
                if(stars == 1 || stars == (2 * i - 1))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
                
            System.out.println();    
        }

        //second half
        for(int i = row; i >= 1; --i){

            for(int spaces = 1; spaces <= row - i; ++spaces)
                System.out.print("   ");

            for(int stars = 1; stars <= (2 * i - 1); ++stars)
                if(stars == 1 || stars == (2 * i - 1))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
                
            System.out.println();    
        }
    }

    public static void main(String[] args) {
        printHollowDiamond(6);
    }
    
}
