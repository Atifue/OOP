public class Triangle {

    private int width;
    private boolean isRotated;

    public Triangle(){
        this(1);
    }

    public Triangle(int width){
        setWidth(width);
    }

    public Triangle(Triangle t){
        this(t.width);
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int width){
        if(width < 1){
            throw new IllegalArgumentException();
        }
        this.width = width;
    }

    public boolean isRotated(){
        return isRotated;
    }

    public void rotate(){
        isRotated = !(isRotated);
    }

    double perimeter(){
        double hypotenuse = Math.sqrt(2.0 * width * width);
        return hypotenuse + width + width;
    }

    double area(){
        return width*width / 2.0;
    }

    void draw(char c){
        if(isRotated == false){
            for(int i = 1; i <= width; i++){
                for(int j = 1; j <= i; j++ ){
                    System.out.print(c);
                }
                System.out.println();
            }
        }
        else{
            for(int i = width; i >= 1; i--){
                for(int j = 1; j <= width; j++){
                    if(j < i){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print(c);
                    }
                    
                }
                System.out.println();
            }
            // rotated triangle
        }
    }
}



