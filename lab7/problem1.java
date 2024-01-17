import java.util.Scanner;
public class problem1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int x = input.nextInt();

    while(x < 0){
      System.out.print("Bad input! Try again: " );
      x = input.nextInt();
    }

    while(x != 0){
      int digit = x % 10;
      if(digit == 5){
        System.out.println("The number contains a 5.");
        break;
      }
      else{
        x = x / 10;
        continue;
      }


    }
    if(x == 0){
      System.out.println("The number does not contain a 5.");
    }
  }
}
