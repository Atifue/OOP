import java.util.Objects;

public class Sphere extends Shape3D {

    private int radius;

    
    public Sphere(int radius){
        setRadius(radius);
        super.setColor(Color.RED);
    }

    public int getRadius(){
        return radius;
    }

    
    public Sphere setRadius(int radius){
        if(radius <= 0)
            throw new IllegalArgumentException();
        this.radius = radius;
        return this;
    }

    public Sphere setColor(Color color){
        super.setColor(color);
        return this;
    }

    public double area(){
        return 4*Math.PI*radius*radius;
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

    @Override
    public String toString(){
        return "Sphere radius: " + radius + " color " + super.getColor();
    }
    @Override

    public boolean equals(Object o){
        if(o == this)
            return true;
        if(o == null || o.getClass() != getClass())
            return false;
        Sphere t = (Sphere) o;
        return this.radius == t.radius;
    }
    @Override
    public int hashCode(){
        return Objects.hash(radius);
    }

    @Override
    public double volume() {
        return (4 / 3) * Math.PI * (radius*radius*radius);
    }
    
    
}
