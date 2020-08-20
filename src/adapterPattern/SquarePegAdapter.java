package adapterPattern;

/**
 * Created by msuganthan on 20/8/20.
 */
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }


    @Override
    public double getRadius() {
        return (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
    }
}

class RoundHole {

    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        return (this.getRadius() >= peg.getRadius());
    }
}


class RoundPeg {
    private double radius;

    public RoundPeg() {}

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        return Math.pow(this.width, 2);
    }
}

class Demo {
    public static void main(String[] args) {

        RoundHole hole = new RoundHole(5);
        RoundPeg  rpeg = new RoundPeg(5);

        if (hole.fits(rpeg))
            System.out.println("Round peg r5 fits round hole r5.");

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.fits(smallSqPegAdapter))
            System.out.println("Square peg w2 fits round hole r5.");

        if (!hole.fits(largeSqPegAdapter))
            System.out.println("Square peg w20 does not fit into round hole r5.");
    }
}