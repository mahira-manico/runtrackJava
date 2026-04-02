package Day3;

class ToStringEq
{
    public static void main(String[] args)  //Test script
    {
        System.out.println("Test 1: ");
        Rectangle rect=new Rectangle(12.5,4.0);
        System.out.println(rect);
        System.out.println();

        System.out.println("Test 2: ");
        RectangleColor rect1=new RectangleColor(12.5,4.0,"red");
        System.out.println(rect1);
        System.out.println();

        System.out.println("Test 3: ");
        Rectangle rect2=new RectangleColor(25.0/2,8.0/2, new String("red"));
        System.out.println(rect2);

        System.out.println(rect1.equals(rect2));
        System.out.println(rect2.equals(rect1));
        System.out.println(rect1.equals(null));
        System.out.println(rect.equals(rect1));
        System.out.println(rect1.equals(rect));


    }

}

class Rectangle {
    double width;
    double height;

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public String toString() { //method toString to display text
        System.out.println("Rectangle: ");
        System.out.println("height = " + height);
        System.out.println("width = " + width);
        return "";
    }

    public boolean equals(Rectangle rect) {  //check if rectangle is null, check with getClass if they're in the same class
        if (rect==null) return false;
        if (this.getClass() != rect.getClass()) {
            return false;
        }else return this.width == rect.width && this.height == rect.height; //Check if they're in the same width and length
    }
}
class RectangleColor extends Rectangle{ //Inherit Rectangle
    String color;

    public RectangleColor(double w, double h, String color){
        super(w, h);
        this.color=color;
    }

    @Override
    public String toString(){ //use the method of Rectangle and add a color text
        super.toString();
        System.out.println("color = "+color);
        return "";
    }

    @Override
    public boolean equals(Object obj){ //Use the method of rectangle and check if the colors are the same
        if(!super.equals(obj)){
            return false;
        }
        RectangleColor other=(RectangleColor)obj;
        return this.color==other.color;
        }

    }
