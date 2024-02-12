package Patterns;

public class InvertedRotatedHalfPyramid {

    //this is the first method
    public static void invertedRotatedHalfPyramid_1(int rowcols){
        for( int i = 1; i <= rowcols; ++i){

            for(int j = 1; j <= rowcols; ++j){
                if(j <= rowcols - i)
                    System.out.print("   ");
                else
                    System.out.print(" * ");
            }

            System.out.println();
        }
    }

    //this is the second method
    public static void invertedRotatedHalfPyramid_2(int rowcols){
        for( int i = 1; i <= rowcols; ++i){

            for(int space = 1; space <= rowcols - i; ++space)
                System.out.print("   ");

            for(int stars = 1; stars <= i; ++stars)
                System.out.print(" * ");

            System.out.println();
        }
    }

    public static void invertedHalfPyramid_numbers(int rowcols){
        for( int i = 1; i <= rowcols; ++i){

            for(int j = 1; j <= rowcols -i + 1; ++j)
                System.out.print(j);

            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        invertedRotatedHalfPyramid_1(5);
        invertedHalfPyramid_numbers(5);
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