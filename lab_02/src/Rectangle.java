public class Rectangle {
    double width;
    double height;

    public Rectangle() {
        this(0, 0);
    }

    public Rectangle(double side) {
        this(side, side);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle other){
        this.width = other.width;
        this.height = other.height;
    }

    public double area(){
        return width*height;
    }
    public double perimeter(){
        return 2*width+2*height;
    }
    public void scale(double factor){
            width*=factor;
            height*=factor;
    }
}
