import java.util.Scanner;
public class problem5 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number between 10 and 20: ");
    int x = input.nextInt();

    if(x > 10 && x < 20){
      for(int i = 1; i <= x; i++){
        if(i % 2 == 0){
          System.out.print("*");
        }
        else{
          System.out.print("^");
        }
      }
    }
    System.out.println();
  }
}