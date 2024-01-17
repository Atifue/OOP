import java.util.Scanner;
public class problem3 {
    public static void main(String[] args){
        System.out.print("Enter a positive integer: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        while(x < 0){
            System.out.println("Invalid input!");
            System.out.print("Enter a positive integer: ");
            x = input.nextInt();

        }

        System.out.println("Now enter " + x + " more integers:");
        int count = 0;
        for(int i = 1; i <= x; i++){
            int y = input.nextInt();
            if(y % 2 == 1){
                count++;
            }
        }
        System.out.print(count + " were odd.");
    }
}
