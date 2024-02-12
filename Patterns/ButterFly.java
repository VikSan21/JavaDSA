package Patterns;


/* 
        ButterFly Pattern

        *                    * 
        *  *              *  * 
        *  *  *        *  *  * 
        *  *  *  *  *  *  *  * 
        *  *  *  *  *  *  *  * 
        *  *  *        *  *  * 
        *  *              *  *
        *                    *
 */

public class ButterFly {

    public static void printButterFlyPattern(int rows) {

        //first half
        for(int i = 1;  i <= rows; ++i){
            
                for(int star = 1; star <= i; ++star)
                    System.out.print(" * ");

                for(int space = 1; space <= 2 * (rows - i); ++space)
                    System.out.print("   ");

                for(int star = 1; star <= i; ++star)
                    System.out.print(" * ");
            
                
                System.out.println();    
        }

        //second half
        for(int i = rows;  i >= 1; --i){
            
            for(int star = 1; star <= i; ++star)
                System.out.print(" * ");

            for(int space = 1; space <= 2 * (rows - i); ++space)
                System.out.print("   ");

            for(int star = 1; star <= i; ++star)
                System.out.print(" * ");
        
            
            System.out.println();    
    }
    }

    public static void main(String[] args) {
        printButterFlyPattern(10);
    }
    
}
