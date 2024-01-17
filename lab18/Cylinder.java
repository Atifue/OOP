import java.util.Objects;

public class Cylinder extends Shape3D {
    private int radius;
    private int height;

    public Cylinder(){
        radius = 1;
        height = 1;
        super.setColor(Color.RED);
    }

    public Cylinder(int radius, int height){
        super.setColor(Color.RED);
        setRadius(radius);
        setHeight(height);

    }

    public Cylinder setColor(Color color){
        super.setColor(color);
        return this;
    }
     public Cylinder setRadius(int radius){
        if(radius <= 0)
            throw new IllegalArgumentException();
        this.radius = radius;
        return this;
    }
    public Cylinder setHeight(int height){
        if(height <= 0)
            throw new IllegalArgumentException();
        this.height = height;
        return this;
    }

    public int getRadius(){
        return radius;
    }

    public int getHeight(){
        return height;
    }
    @Override
    public double volume() {
        return Math.PI*radius*radius*height;
    }
    @Override
    public double area() {
       return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }
    @Override
    public void draw(char ch) {
        for (int r = radius; r >= 0; r--) {
            for (int c = -radius; c <= radius; c++) {
                if (r * r + c * c <= radius * radius) {
                    System.out.print(ch);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    
        for (int i = 0 ; i < 2*height; i++) {
            for (int j = -1; j < 2*radius; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    
        for (int r = 0; r <= radius; r++) {
            for (int c = -radius; c <= radius; c++) {
                if (r * r + c * c <= radius * radius) {
                    System.out.print(ch);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    

    @Override
    public String toString(){
        return "Cylinder height: " + height + " color " + super.getColor() + " radius " + radius;
    }
    public boolean equals(Object o){
        if(o == this)
            return true;
        if(o == null || o.getClass() != getClass())
            return false;
        Cylinder t = (Cylinder) o;
        return this.radius == t.radius && this.height == t.height;
    }
    @Override
    public int hashCode(){
        return Objects.hash(radius+height);
    }

    
}
