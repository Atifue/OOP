import java.util.Scanner;
public class problem5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many 3-pointers? ");
        int threepoint = input.nextInt();
        System.out.print("How many 2-pointers? ");
        int twopoint = input.nextInt();
        System.out.print("Total points scored: " + (twopoint * 2 + threepoint * 3));
    }
}
