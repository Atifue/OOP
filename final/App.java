public class App{
    public static void main(String args[]){
        App<Integer, String> app = new App<>("5", 2.3);
        app.print();
    }
}

record App<T, G>(T name, G height) {
    
    public void print(){
        System.out.println(name);
    }
}
