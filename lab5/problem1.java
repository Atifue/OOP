import java.util.Scanner;

public class problem1 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a numeric score: ");
    int grade = input.nextInt();

    if(grade >= 90){
      System.out.print("A");
    }
    else if(grade >= 80 && grade <= 89){
      System.out.print("B");
    }
    else if(grade >= 70 && grade <= 79){
      System.out.print("C");
    }
    else if(grade >= 60 && grade <= 69){
      System.out.print("D");
    }
    else{
      System.out.print("F");
    }
  }
}
