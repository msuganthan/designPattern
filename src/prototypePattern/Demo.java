package prototypePattern;

public class Demo {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.x      = 10;
        circle.y      = 20;
        circle.radius = 15;
        circle.color  = "red";

        Circle clonedCircle = (Circle) circle.clone();

        System.out.println("Is circles identical ==>"+circle.equals(clonedCircle));
        System.out.println("Is circles equals ==>"+(circle == clonedCircle));


        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";

        Rectangle clonedRectangle = (Rectangle) rectangle.clone();
        System.out.println("Is rectangles identical ==>"+rectangle.equals(clonedRectangle));
        System.out.println("Is rectangles equals ==>"+(rectangle == clonedRectangle));

    }
}
