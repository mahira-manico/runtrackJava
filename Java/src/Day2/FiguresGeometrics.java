package Day2;

public class FiguresGeometrics {
    public static void main(String[] args){
        Rectangle rect=new Rectangle(10.2,5.2,4.3,1.1);
        rect.display();
        Circle circ=new Circle(1.2,2.3,4.5);
        circ.display();
        RectangleColor rectColor=new RectangleColor(1.3, 21.1,561545,4.5,4.5);
        rectColor.display();


    }
}

class Figure{
    protected double x;
    protected double y;

    public Figure(double x, double y){ //Constructor
        this.x=x;
        this.y=y;
    }

    public void display(){ //General display
        System.out.println("The center is at: "+x+","+y);
    }

    public void SetCenter(double x, double y){ //Get the center of all Figures who will inherit
        this.x=x;
        this.y=y;


    }
}

class Rectangle extends Figure{ //Inherit of Figure
    protected double width;
    protected double height;

    public Rectangle(double x, double y, double width,double height){ //Get the x and y of Figure
        super(x, y); //Nourish the parent class
        this.width=width;
        this.height=height;
    }

    public double getHeight() { //Getters and Setters
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

    public double surface(){ //Surface calcul
        return width*height;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Rectangle of width "+width+" and of height "+height); //Override to have the display method of Figure

    }
}

class Circle extends Figure { //Inherit of Figure
    protected double radius; //Encapsulation

    public Circle(double x, double y, double radius) { //Get the x and y of Figure to send it back
        super(x, y);
        this.radius = radius;
    }

    public double getX() { //Getters and Setters
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

    public double surface() {
        return Math.PI * radius * radius; //use pi*radius** to get the surface
    }

    public boolean isInside(double px, double py) {
        double distance = Math.sqrt(Math.pow(px - x, 2) + Math.pow(py - y, 2)); //Check the distance between point px to py
        return distance <= radius; //return True if radius is superior or equals to distance

    }

    @Override //Override to get the display method from Figure
    public void display() {
        super.display();
        System.out.println("Circle of radius " + radius);
    }
}

class RectangleColor extends Rectangle{ //Inherit Rectangle
        int color;

        public RectangleColor(double x, double y, int color, double width, double height) { //Constructor done
            super(x, y, width, height);
            this.color=color;
        }

        @Override
        public void display(){
            super.display();
            System.out.println("My color is: "+color);
        }
    }



