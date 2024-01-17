import java.util.Scanner;

public class problem4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name and I will repeat it back to you. ");
        System.out.println("Type END when you wish to quit.");
        String name;

        while(true){
            System.out.print(">");
            name = input.next();
            
            if(name.equals("END")){
            
                break;
            }
            System.out.println(name);
        }
         System.out.println("I am done");
    }
}
