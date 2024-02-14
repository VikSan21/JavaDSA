package Function;

import java.util.Scanner;

public class BinaryDecimalConversion {
    
    public static int decimalToBinary(int number){
        int count = 0, r, binary = 0;

        while(number != 0){

            r = number % 2;
            binary += (r * Math.pow(10,count));
            number /= 2;
            count++;
        }
        return binary;
    }

    public static int binaryToDecimal(int number){
        int count = 0,r, decimal = 0;

        while(number != 0){

            r = number % 10;
            decimal += (r * Math.pow(2, count));
            number /= 10;
            count++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        //To take the input from user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number(Binary/Decimal) : ");
        int number = scan.nextInt();

        int choice;
        loop :
        do{
            System.out.print("\nEnter the choice!\n1.Binary\n2.Decimal\n3.Exit\nChoice : ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    {
                        System.out.println("Output : " +decimalToBinary(number));
                        break;
                    }
                case 2:
                    {
                        System.out.println("Output : " + binaryToDecimal(number));
                        break;
                    } 
                case 3:
                    {
                        scan.close();
                        break loop;
                    }     
                default:
                    {
                        System.out.println("Invalid Input!");
                        break;
                    }
                    
            }
            
        } while(true);
    }
}
