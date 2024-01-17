import java.util.Scanner;

public class problem4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if(num1 < num2 && num2 < num3){
            System.out.print("Increasing");
        }
        else if(num3 < num2 && num2 < num1){
            System.out.print("Decreasing");
        }
        else{
            System.out.print("Neither");
        }
    }
}
