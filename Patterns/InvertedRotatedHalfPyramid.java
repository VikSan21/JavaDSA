package Patterns;

public class InvertedRotatedHalfPyramid {

    public static void invertedRotatedHalfPyramid(int rowcols){
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
    
    public static void main(String[] args) {
        invertedRotatedHalfPyramid(5);
    }
    
}