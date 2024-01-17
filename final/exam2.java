public class exam2 {
    public static void main(String args[]){

        int arr[] computeRowSums(int arr1[][]){
            int arr[] = new int[arr1.length];
            int sum = 0;
            for(int i = 0; i < arr1.length; i++){
                for(int j = 0; i < arr1[i].length; i++){
                    sum += arr[i][j];
                }
                arr[i] = sum;
                sum = 0;
            }
        }
    }
}
