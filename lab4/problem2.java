import java.util.Scanner;

public class problem2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the original price? ");
        int price = input.nextInt();
        if(price >= 125){
            System.out.print("The reduced price is $" + (int)(price * 0.9) + ".");
        }
        else{
        System.out.print("That does not qualify for a discount. The price is $" + price + ".");
        }

    }
    
}
