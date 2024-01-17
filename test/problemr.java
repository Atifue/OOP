public class problemr {
    public static void main(String[] args) {
        String s1 = "trying this out";
        String s[] = s1.split(" ");
        Bag b1 = new Bag(s);
        System.out.println(b1.next());
        System.out.println(b1.previous());
        System.out.println(b1.next());
        
    }
}