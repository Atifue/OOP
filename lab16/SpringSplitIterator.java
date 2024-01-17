import java.util.NoSuchElementException;
public class SpringSplitIterator{
    public static void main(String[] args){
        sup s1 = new sup("hello everyone");
        System.out.println(s1.next());
        System.out.println(s1.next());
        s1.reset();
        System.out.println(s1.next());
    }
}