import java.util.Scanner;
public class problem3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the item's original price? ");
        int price = input.nextInt();
        if(price <= 100){
            System.out.print("This item qualifies for a 20% discount. The item's discounted price is $" + (int)(price * 0.8) + ".");
        }
        else{
        System.out.print("This item qualifies for a 40% discount. The price is $" + (int) (price*.6) + ".");
        }

    }
}

