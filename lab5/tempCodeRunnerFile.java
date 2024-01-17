import java.util.Scanner;

public class problem2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter an angle in degrees: ");
        int num1 = input.nextInt();

        System.out.print("Enter an angle in degrees: ");
        int num2 = input.nextInt();

        System.out.print("Enter an angle in degrees: ");
        int num3 = input.nextInt();

        if(num1 + num2 + num3 == 180){
            System.out.println("Can form a triangle from these angles.");
            if(num1 == 90 || num2 == 90 || num3 == 90){
                System.out.println("The triangle is a right triangle.");
            }
            else if(num1 == 60 && num2 == 60 && num3 == 60){
                System.out.println("The triangle is an equilateral triangle.");
            }
            else{
                System.out.println("The triangle is neither equilateral nor right.");
            }
        }
        else{
            System.out.println("Cannot form a triangle from these angles.");
        }

    }
}