import java.util.Scanner;

public class problem3 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number greater than 100: ");
    int x = input.nextInt();

    while(x <= 100){
      System.out.println("Invalid input!");
      System.out.print("Enter a number greater than 100: ");
      x = input.nextInt();
    }
    for(int i = 1; i * i < x; i++){
      System.out.println(i + "\t" + i * i);
    }

  }
}
