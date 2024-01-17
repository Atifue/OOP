record App<T, G extends Number>(T name, G height) {
    
    public App(T name, G height){
        if(name == null || height == null){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.height = height;
    }
    public void print(){
        System.out.println(name);
        System.out.println(height);
    }
}


public class test {
  public static void main(String[] args)  {
    App<String, Integer> integer = new App<>("432", 432);
    integer.print();
    System.out.println(integer.toString());
  }
}
