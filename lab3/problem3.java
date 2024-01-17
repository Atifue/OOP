import java.util.Scanner;

public class problem3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a four digit number: ");
        int number = input.nextInt();
        int firstDigit = number / 1000;
        int secondDigit = (number / 100) % 10;
        int thirdDigit = (number / 10) % 10;
        int fourthDigit = number % 10;
        System.out.print("Your number in reverse is " + fourthDigit + thirdDigit + secondDigit + firstDigit);
    }
}
