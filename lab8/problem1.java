import java.util.Scanner;
public class problem1 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 2 and 5: ");
        int x = input.nextInt();

        while(x > 5 || x < 2){
            System.out.print("Enter a number between 2 and 5: ");
            x = input.nextInt();
        }

        for(int i = 1; i <= 10; i++){
            double num = Math.pow(x,i);
            System.out.print((int) num + " ");
        }
    }
}
