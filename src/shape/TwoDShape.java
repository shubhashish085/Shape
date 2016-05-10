package shape;

public abstract class TwoDShape extends Shape {

    public TwoDShape(String str) {
        setName(str);
    }
    private int radius;
    private int length;
    private int width;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}

class Triangle extends TwoDShape {

    public Triangle(int len, int wid) {
        super("Triangle");
        setLength(len);
        setWidth(wid);

    }


    public void area() {
        float ar = (float) (0.5 * getLength() * getWidth());
        System.out.println("The area is " + ar);
    }

}

class Circle extends TwoDShape {

    public Circle(int x) {
        super("Circle");
        setRadius(x);

    }
    

    public void area() {
        float ar = (float) (3.1416 * getRadius() * getRadius());
        System.out.println("The area is " + ar);
    }
}
