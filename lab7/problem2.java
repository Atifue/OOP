import java.util.Scanner;

public class problem2 {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a number between 1 and 100: ");
  int x = input.nextInt();

  while(x > 100 || x < 1){
    System.out.println("Invalid input! Try again: " );
    System.out.print("Enter a number between 1 and 100: ");
    x = input.nextInt();
  }
  System.out.print("The first 20 multiplies of " + x + " are ");
  for(int i = 1; i < 20; i++){
    System.out.print(x * i + " ");
  }
  System.out.println(x * 20 + ".");
  }
}