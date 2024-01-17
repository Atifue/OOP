import java.util.Scanner;
public class problem4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the integer I'm picked from the range 1 to 100: ");
        int guess = input.nextInt();

        int num = (int) (Math.random() * 100 + 1);
        int count = 1;
        while(num != guess){
            if(num < guess){
                System.out.println("Too big.");
                guess = input.nextInt();
                count++;
            }
            if(num > guess){
                System.out.println("Too small.");
                guess = input.nextInt();
                count++;
            }
        }
        System.out.println("Congratulations! You took " + count + " guesses.");
    }
}
