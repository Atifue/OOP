public class Library {
    public static int str2Int(String str){
        int num = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            num = 10 * (num + c - '0');
        }
        num /= 10;
        return num;
    }

    public static String thousandSeparator(int num){
        String str = Integer.toString(num);
        int length = str.length();
        int count = 0;
        StringBuilder newstring = new StringBuilder();
        for(int i = length-1; i >= 0; i--){
            newstring.append(str.charAt(i));
            if(Character.isDigit(str.charAt(i))){
                count++;
            }
            if(count == 3 && i != 0){
                newstring.append(".");
                count = 0;
            }
        }
        return newstring.reverse().toString();
    }

    public static boolean detectCapitalUse(String word){
        char first = word.charAt(0);
        if(Character.isUpperCase(first)){
            char second = word.charAt(1);
            if(Character.isUpperCase(second)){
                for(char c : word.toCharArray()){
                    if(!Character.isUpperCase(c)){
                    return false;
                }
            }
        }
            else{
                for(int i = 2; i < word.length(); i++){
                    if(Character.isUpperCase(word.charAt(i))){
                        return false;
                    }
                }
            }
        }
        else{
            for(char c : word.toCharArray()){
                if(Character.isUpperCase(c)){
                    return false;
                }
            }     
        }
        return true;
    }

    public static String makeFancyString(String s){
        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0));
        str.append(s.charAt(1));
        for(int i = 2; i < s.length(); i++){    
            if(s.charAt(i) != s.charAt(i-1) || s.charAt(i) != s.charAt(i-2)){
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }

    public static String capitalizeTitle(String title){
       String str[] = title.toLowerCase().split(" ");
       StringBuilder newstr = new StringBuilder();
       
       for(int i = 0; i < str.length; i++){
        char newChar = Character.toUpperCase(str[i].charAt(0));
        String newWord = String.valueOf(newChar) + str[i].substring(1);
        newstr.append(newWord).append(" ");
       }
       return newstr.toString().trim();
        
        
    }
}
