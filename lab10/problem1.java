import java.util.Scanner;
public class problem1 {
    public static void main(String[] args){
        System.out.print("Enter an integer greater than or equal to 10: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        while(x < 10){
            System.out.print("Invalid input! Try again: ");
            x = input.nextInt();
        }

        int r = (int) (Math.random() * x + 1);

        System.out.print("Random integer between 1 and " + x + " is " + r);
    }



}