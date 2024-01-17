public class Circle {
    private static final double PI = 3.14159;
    private static int count = 0;
    private int radius;

    public Circle(int radius){
        setRadius(radius);
        count++;
    }

    public Circle(Circle c){
        this(c.radius);
    }

    public Circle(){
        this(1);
    }

    public static int getCount(){
        return count;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        if(radius < 1){
            throw new IllegalArgumentException();
        }
        this.radius = radius;
    }

    public double area(){
        return PI*radius*radius;
    }
    
    public double perimeter(){
        return 2*PI*radius;
    }

    public void draw(char ch){
        for(int r = radius; r >= -radius; r-- ){
            for(int c = -radius; c <= radius; c++){
                if(r*r + c*c <= radius*radius){
                    System.out.print(ch);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
