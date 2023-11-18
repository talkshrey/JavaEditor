// creating super class and sub class
abstract class Shape {
    public void area() {
        System.out.println("Areas are following:");
    }
    
}
abstract class Rectangle extends Shape {
    public void rect(int l,int b) {
        System.out.println("area of rect:"+l*b);
        
    }
}
abstract class Circle extends Rectangle {
    public void circle(int r) {
        System.out.println("area of circle:"+3.14*r*r);
    }
}
class Triangle extends Circle{
    public void triangle(int b,int h){
        System.out.println("area of triangle"+0.5*b*h);
    }
}
public class Inheritance {
    public static void main(String args[]){
        Triangle t=new Triangle();
        t.area();
        t.triangle(10,20);
        t.circle(10);
        t.rect(10,20);
    }
}

