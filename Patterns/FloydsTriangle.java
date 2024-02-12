package Patterns;

/*  
  
        Floyd's Triangle
        
        1
        2 3
        4 5 6
        7 8 9 10

  */

public class FloydsTriangle {


    public static void printFloydsTriangle(int rows){
        int count = 1;
        for(int i = 1; i <= rows; ++i){

            for(int j = 1; j <= i; ++j){

                System.out.print(count++);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printFloydsTriangle(5);
    }
    
}
