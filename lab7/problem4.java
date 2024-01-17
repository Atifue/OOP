import java.util.Scanner;

public class problem4 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a numeric grade: ");
    int x = input.nextInt();
    int total = 0, count = 0;
    while(x > 0){
      total += x;
      System.out.print("Enter a numeric grade: ");
      x = input.nextInt();
      count++;
    }
    System.out.println("The average grade is 89" + (double) total / count);

  }
}