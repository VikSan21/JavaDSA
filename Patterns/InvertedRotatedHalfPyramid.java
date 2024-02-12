package Patterns;

public class InvertedRotatedHalfPyramid {

    //this is the first method
    public static void printInvertedRotatedHalfPyramid_1(int rows){
        for( int i = 1; i <= rows; ++i){

            for(int j = 1; j <= rows; ++j){
                if(j <= rows - i)
                    System.out.print("   ");
                else
                    System.out.print(" * ");
            }

            System.out.println();
        }
    }

    //this is the second method
    public static void printInvertedRotatedHalfPyramid_2(int rows){
        for( int i = 1; i <= rows; ++i){

            for(int space = 1; space <= rows - i; ++space)
                System.out.print("   ");

            for(int stars = 1; stars <= i; ++stars)
                System.out.print(" * ");

            System.out.println();
        }
    }

    public static void printInvertedHalfPyramid_numbers(int rows){
        for( int i = 1; i <= rows; ++i){

            for(int j = 1; j <= rows -i + 1; ++j)
                System.out.print(j);

            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        printInvertedRotatedHalfPyramid_1(5);
        printInvertedHalfPyramid_numbers(5);
    }

    /* 
            Inverted Rotated Half Pyramid

                         * 
                      *  *
                   *  *  *
                *  *  *  *
             *  *  *  *  *
             


            Inverted Half Pyramid
            12345
            1234
            123
            12
            1


     */
    
}