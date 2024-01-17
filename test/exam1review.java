import java.util.Scanner;
public class exam1review{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of an item: ");
        int x = input.nextInt();

        while(x <= 0){
            System.out.print("Enter the price of an item: ");
            x = input.nextInt();
            
        }
        int sum = 0;
        while(x != 0){
            int lastDigit = x % 10;
            if(lastDigit % 2 == 1){
                sum += lastDigit;
            }
            x /= 10;
        }
        System.out.print("The sum of the odd digits in the number is " + sum + ".");

        
    }
}