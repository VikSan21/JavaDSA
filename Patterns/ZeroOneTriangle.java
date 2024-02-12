package Patterns;


/*     
 
        Zero One Triangle

        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1

*/

public class ZeroOneTriangle {

    public static void printOneZeroTriangle(int rows){
        for(int i = 1; i <= rows; ++i){

            for(int j = 1; j <= i; ++j){
                if((i + j) % 2 == 0){
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 0 ");
                }
                
            }
            System.out.println();
        }
    }

    public static void printZeroOneTriangle(int rows){
        for(int i = 1; i <= rows; ++i){

            for(int j = 1; j <= i; ++j){
                if((i + j) % 2 == 0){
                    System.out.print(" 0 ");
                }else{
                    System.out.print(" 1 ");
                }
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printOneZeroTriangle(5);
        printZeroOneTriangle(5);
    }
    
}
