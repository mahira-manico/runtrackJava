package Day2;

public class FiguresGeometrics {
    public static void main(String[] args){

    }
}

class Rectangle{
    protected double width;
    protected double height;

    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double surface(){
        return width*height;
    }
}

class Circle{
    protected double x;
    protected double y;
    protected double radius;

    public Circle(double x,double y, double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    public void display(){
        System.out.println("x is: "+x);
        System.out.println("y is: "+y);
        System.out.println("radius is: "+radius);
        System.out.println("Circle of center "+x+","+y+" and of radius: "+radius); //Display all
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCenter(double newX, double newY){
        this.x=newX;
        this.y=newY;

    }

    public double surface(){
        return Math.PI*radius*radius; //use pi*radius** to get the surface
    }

    public boolean isInside(double px, double py){
        double distance=Math.sqrt(Math.pow(px-x, 2)+Math.pow(py-y, 2)); //Check the distance between point px to py
        return distance<=radius; //return True if radius is superior or equals to distance

    }

}


