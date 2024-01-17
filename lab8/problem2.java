import java.util.Scanner;
public class problem2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int x = input.nextInt();

        while(x < 0){
            System.out.println("Invalid input! ");
            System.out.print("Enter a positive integer: ");
            x = input.nextInt();
        }

        for(int i = 1; i <= x; i++){
            if(i % 2 == 0){
                System.out.print(-i + " ");
            }
            else{
                System.out.print(i + " ");
            }
        }
    }
}
