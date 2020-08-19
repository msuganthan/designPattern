package prototypePattern;

public class Circle extends Shape {

    public int radius;

    Circle() {}

    Circle(Circle target) {
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Circle)) return false;
        Circle circle = (Circle) other;
        return radius == circle.radius;
    }
}
