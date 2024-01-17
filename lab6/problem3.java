import java.util.Scanner;
public class problem3 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a positive integer: ");
    int x = input.nextInt();

    while(x < 0){
      System.out.print("Invalid input! Try again: " );
      x = input.nextInt();
    }
    System.out.print("The factors of " + x + " are: ");
    for(int i = 1; i <= x; i++){
      if(x % i == 0){
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
}
