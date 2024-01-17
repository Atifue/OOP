import java.util.Scanner;
public class testclass{
    public static void main(String[] args){
        System.out.println("enter palindrome");
        
        Palindrome p1 = new Palindrome(args[0]);
        System.out.println(p1.checker());


    }
}