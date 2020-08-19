package prototypePattern;

public class Rectangle extends Shape {

    int width;
    int height;

    Rectangle() {}

    Rectangle(Rectangle target) {
        if (target != null) {
            this.width  = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object other) {
        if (! (other instanceof Rectangle))
            return false;

        Rectangle rectangle = (Rectangle) other;
        return this.width == rectangle.width && this.height == rectangle.height;
    }
}
