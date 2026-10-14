public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void distance(Point otherPoint){
        double result = Math.sqrt((otherPoint.x - x)*(otherPoint.x - x) + (otherPoint.y - y)*(otherPoint.y - y));
        System.out.println("Odleglosc pomiedzy punktami: " + result);
    }
}
