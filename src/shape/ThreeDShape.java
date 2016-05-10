package shape;

public abstract class ThreeDShape extends Shape {

    public ThreeDShape(String str) {
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

class Sphere extends ThreeDShape {

    public Sphere(String str, int x) {
        super(str);
        setRadius(x);
    }
    

    public void area() {
        float ar = (float) (3.1416 * getRadius() * getRadius() * getRadius());
        System.out.println("The area is " + ar);
    }
}

class Cube extends ThreeDShape {

    public Cube(String str, int x) {
        super(str);
        setLength(x);
    }
    

    public void area() {
        float ar = (float) (3.1416 * getLength() * getLength() * getLength());
        System.out.println("The area is " + ar);
    }

}
