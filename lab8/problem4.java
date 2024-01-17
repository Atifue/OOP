import java.util.Scanner;
public class problem4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("type a larger integer n: ");
        int n = input.nextInt();

        for(int i = 1; i <= 4; i++){
            System.out.print("Type a smaller value of n: ");
            int lessn = input.nextInt();

            if(lessn >= n){
                System.out.print("Goodbye");
                break;
            }
            else{
                n = lessn;
            }

        }
    }
}
