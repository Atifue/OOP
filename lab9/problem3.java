import java.util.Scanner;
public class problem3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 20: ");
        int x = input.nextInt();
        int count = 0;

        while(x > 20 || x < 1){
            count++;
            System.out.print("Out of range. Enter an integer between 1 and 20: ");
            x = input.nextInt();
            if(count == 10){
                x = 10;
                break;
            }
        }

        System.out.print("The cube of your integer is " + x*x*x + ".");



    }
}
