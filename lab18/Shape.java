public abstract class Shape {
    private Color color;

    public Shape(){}

    public Shape(Color color){
        setColor(color);
    }

    public Color getColor(){
        return color;
    }

    public Shape setColor(Color color){
        this.color = color;
        return this;
    }

    public abstract double area();
    public abstract void draw(char ch);

    
}
