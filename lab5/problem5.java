import java.util.Scanner;
public class problem5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number and I will tell you if it is even or odd. ");
        System.out.println("Enter a negative number to stop");
        System.out.print("> ");
        int x = input.nextInt();

        while(true){
            if(x >= 0){
                if(x % 2 == 0){
                    System.out.println("Even");
                    System.out.print("> ");
                    x = input.nextInt();
                }
                else{
                    System.out.println("Odd");
                    System.out.print("> ");
                    x = input.nextInt();
                }
            
         }
         else{
            System.out.print("Goodbye");
            break;
         }
        }
        
       
        
    }
}
