public class problem4 {
    public static void main(String[] args){
        int count = 0;
        for(int i = 28; i <= 387; i++){
            System.out.print(i + " ");
            count++;
            if(count == 10){
                System.out.println();
                count = 0;
            }
        }
    }
}
