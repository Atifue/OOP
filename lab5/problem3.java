import java.util.Scanner;

public class problem3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1 + num2 >= 100){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
