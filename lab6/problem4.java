import java.util.Scanner;
public class problem4 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the price of an item: ");
    int x = input.nextInt();
    int total = 0;
    while(x != 0){
      total += x;
      System.out.print("Enter the price of an item: ");
      x = input.nextInt();
    }
    System.out.print("Your checkout total is $" + total + ".");
    if(total > 100){
      System.out.println(" That's expensive!");
    }
  }
}
