public class problem5 {
    public static void main(String[] args){
        int heads = 0, tails = 0;
        for(int i = 1; i <= 10; i++){
            int roll = (int) (Math.random() * 2);
            if(roll == 0){
                heads++;
            }
            else{
                tails++;
            }
        }
        System.out.println("Probability of heads given 10 tosses = " + (double) heads / 10);
        System.out.println("Probability of tails given 10 tosses = " + (double) tails / 10);

        heads = 0; tails = 0;
         for(int i = 1; i <= 100; i++){
            int roll = (int) (Math.random() * 2);
            if(roll == 0){
                heads++;
            }
            else{
                tails++;
            }
        }

        System.out.println("Probability of heads given 100 tosses = " + (double) heads / 100);
        System.out.println("Probability of tails given 100 tosses = " + (double) tails / 100);

        heads = 0; tails = 0;
         for(int i = 1; i <= 1000; i++){
            int roll = (int) (Math.random() * 2);
            if(roll == 0){
                heads++;
            }
            else{
                tails++;
            }
        }

        System.out.println("Probability of heads given 1000 tosses = " + (double) heads / 1000);
        System.out.println("Probability of tails given 1000 tosses = " + (double) tails / 1000);

        heads = 0; tails = 0;
         for(int i = 1; i <= 10000; i++){
            int roll = (int) (Math.random() * 2);
            if(roll == 0){
                heads++;
            }
            else{
                tails++;
            }
        }

        System.out.println("Probability of heads given 10000 tosses = " + (double) heads / 10000);
        System.out.println("Probability of tails given 10000 tosses = " + (double) tails / 10000);


    }
}
