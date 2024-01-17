
public class MyScanner {
    private String str;

    public MyScanner(String str){
        this.str = str;
    }

    private boolean isSpace(char c){
        return c == ' ' || c == '\t' || c == '\n';
    }
    public String next(){
        int i;
        for(i = 0; i < str.length(); i++){
            if(isSpace(str.charAt(i))){
                break;
            }
        }
        String token = str.substring(0, i);
        str = str.substring(i);

        return token;
    }

    public int nextInt(){
        int i;
        for(i = 0; i < str.length(); i++){
            if(isSpace(str.charAt(i))){
                break;
            }
        } 
        String token = str.substring(0, i);
        str = str.substring(i);
        return Integer.parseInt(token);
    }

    public double nextDouble(){
        int i;
        for(i = 0; i < str.length(); i++){
            if(isSpace(str.charAt(i))){
                break;
            }
        }
        double token = Double.parseDouble(str.substring(0, i));
        str = str.substring(i);
        return token;
    }

    public boolean nextBoolean(){
        int i;
        for(i = 0; i < str.length(); i++){
            if(isSpace(str.charAt(i))){
                break;
            }
        }
        boolean token = Boolean.parseBoolean(str.substring(0, i));
        str = str.substring(i);
        return token;
    }

    public String nextLine(){
        int i;
        for(i = 0; i < str.length(); i++){
            if(str.charAt(i) == '\n'){
                break;
            }
        }
        String token = str.substring(0, i);
        str = str.substring(i+1); // +1 to skip \n
        return token;
    }
}
