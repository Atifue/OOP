import java.util.Scanner;
public class problem3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of die rolls: ");
        int x = input.nextInt();

        if(x < 1){
            System.out.print("Not playing games.");
            System.exit(0);
        }
        
        int count = 0;
        for(int i = 1; i <= x; i++){
            int r = (int) (Math.random() * 6 + 1);
            System.out.println("Rolls " + i + ": " + r);
            if(r == 1){
                count++;
            }
        }
        System.out.println("Total numbers of ones rolled: " + count);
    }
}
