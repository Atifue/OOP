import java.util.Scanner;
public class problem4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your height in inches: ");
        int height = input.nextInt();
        double heightInCm = height * 2.54;

        System.out.print("Hi " + name + "." + " You are " + heightInCm + " centimeters tall.");

    }
}
