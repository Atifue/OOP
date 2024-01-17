public class Palindrome {
    private String string;
    Palindrome(String s){
        string = s;
    }

    public boolean checker(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < string.length(); i++){
            sb.append(string.charAt(i));
        }
        String reversed = sb.reverse().toString();
        if(reversed.equals(string)){
            return true;
        }
        return false;
    }

    public static int removeOddDigits(int num){
        

        
        
    }
}
