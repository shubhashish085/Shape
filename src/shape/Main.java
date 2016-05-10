package shape;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Shape object = null;
        object = new Triangle(5,7);
        doSomething(object);            
        
        
    }
    public static void doSomething(Shape obj){
        System.out.println("The object is " + obj.getName());
        obj.area();
    }
}
