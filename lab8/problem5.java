import java.util.Scanner;
public class problem5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for n: ");
        int x = input.nextInt();

        while(x % 2 == 0 || x < 0){
            System.out.print("Enter value for n: ");
            x = input.nextInt();
        }

        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= x; j++){
                if(i == j){
                    System.out.print("X");
                }
                else if(i == 1 || i == x){
                    System.out.print("O");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
