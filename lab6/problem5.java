import java.util.Scanner;
public class problem5 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a positive integer: ");
    int x = input.nextInt();

    while(x < 0){
      System.out.print("Invalid input! Try again: " );
      x = input.nextInt();
    }
    int sum = 0;
    while(x != 0){
      int digit = x % 10;
      if(digit % 2 == 1){
        sum += digit;
      }
      x = x / 10;
    }
    System.out.println("The sum of the odd digits in the number is " + sum + ".");


  }

}