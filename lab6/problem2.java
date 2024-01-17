import java.util.Scanner;

public class problem2 {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  System.out.print("Enter a positive integer: ");
  int x = input.nextInt();

  while(x < 0){
    System.out.print("Invalid input! Try again: " );
    x = input.nextInt();
  }
  System.out.print("Your number in binary in reverse order is: ");
  while(x > 0){
    System.out.print(x % 2 + " ");
    x = x / 2;
  }
  System.out.println();
  }
}
