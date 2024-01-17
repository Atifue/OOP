import java.util.Scanner;

public class problem5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month: ");
        int month = input.nextInt();

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ){
            System.out.print("31 days");
        }
        else if(month == 2){
            System.out.print("29 days");
        }
        else{
            System.out.print("30 days");
        }

    }
}
