public class Triangle {
    public int width;

    public Triangle(){
        this(1);
    }

    public Triangle(int width){
        this.width = width;
    }

    public Triangle(Triangle t){
        this(t.width);
    }

    double area(){
        return (width*width / 2.0);
    }

    double perimeter(){
        double hypotenuse = Math.sqrt(2.0 * width * width);
        return hypotenuse + width + width;
    }

    void draw(char c){
        for(int i = 1; i <= width; i++){
            for(int j = 1; j <= i; j++ ){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
