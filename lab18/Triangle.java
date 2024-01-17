import java.util.Objects;

public class Triangle extends Shape2D {
    private int width;
    Triangle(){
        width = 1;
        super.setColor(Color.RED);
    }
    public Triangle(int width){
        setWidth(width);
        super.setColor(Color.RED);
    }

    public int getWidth(){
        return width;
    }

    public Triangle setWidth(int width){
        if(width <= 0)
            throw new IllegalArgumentException("Invalid Width: " + width);
        this.width = width;
        return this;
    }
    public Triangle setColor(Color color){
        super.setColor(color);
        return this;
    }
    @Override
    public double area(){
        return (width*width / 2.0);
    }
    @Override
    public void draw(char ch){
        for(int i = 1; i <= width; i++){
            for(int j = 1; j <= i; j++ ){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    @Override
    public double perimeter(){
        double hypotenuse = Math.sqrt(2.0 * width * width);
        return hypotenuse + width + width;
    }

    @Override
    public String toString(){
        return "Triangle width: " + getWidth() + " color " + super.getColor();
    }

    @Override 
    public boolean equals(Object o){
        if(o == this)
            return true;
        if(o == null || o.getClass() != getClass())
            return false;
        Triangle t = (Triangle) o;
        if(this.width == t.width){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(width);
    }
}
