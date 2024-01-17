import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for x: ");
        x = input.nextInt();
        System.out.print("Enter a value for y: ");
        y = input.nextInt();

        System.out.println("The sum of " + x + " and " + y + " is " + (x + y));
        System.out.println(y + " subtracted from " + x + " is " + (x - y));
        System.out.println("The product of " + x + " and " + y + " is " + (x * y));
        System.out.println("The average of " + x + " and " + y + " is " + (x + y) / 2.0);
        System.out.println("The remainder when " + x + " is divided by " + y + " is " + (x % y));
    }
}
