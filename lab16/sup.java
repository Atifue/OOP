import java.util.NoSuchElementException;

public class sup {
    private int index;
    private String s[];

    public sup(String s1){
        if(s1 == null || s1.length() == 0){
            throw new IllegalArgumentException();
        }
        
        s = s1.split(" ");
    }

    public boolean hasNext(){
        return index < s.length;
    }

    public String next(){
        if(hasNext()){
            
            return s[index++];
        }

        else{
            throw new NoSuchElementException();
        }
    }

    public void reset(){
        index = 0;
    }

}
