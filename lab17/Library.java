public class Library {

    public static double avgOfNumbersAboveAndEqualAvg (int [] nums) {
        double total = 0;
        for(var i : nums){
            total += i;
        }
        double avg = total / nums.length;
        int count = 0;
        total = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > avg){
                total += nums[i];
                count++;
            }
        }
        return total / count;
    }

    public static void moveZeros(int [] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                for(int j = i+1; j < nums.length; j++){
                    if(nums[j] != 0){
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                        break;
                    }
                }
            }
        }
    }

    public static int [] maxRowValues(int [][] matrix){
        int size = matrix.length;
        int newArray[] = new int[size];
        for (int i = 0; i < size; i++) {
            int max = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            newArray[i] = max;
            continue;
        }
        return newArray;
    }

    public static void printVerticalChart(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        for (int i = max; i > 0; i--) {   
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
