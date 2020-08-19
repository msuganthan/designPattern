package prototypePattern;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    Shape() {}

    Shape(Shape target) {
        if (target != null) {
            this.x     = target.x;
            this.y     = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Shape)) return false;
        Shape shape = (Shape) other;
        return this.x == shape.x &&
                this.y == shape.y &&
                Objects.equals(this.color, shape.color);
    }
}
