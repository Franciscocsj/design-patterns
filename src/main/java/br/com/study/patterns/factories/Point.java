package br.com.study.patterns.factories;

public class Point {
    private double x, y;

    /**
     * @param a
     * @param b
     * @param cs
     */
    public Point(double a, double b, CoordinateSystem cs) {
        switch (cs) {
            case CARTESIAN:
                this.x = a;
                this.y = b;
                break;
            case POLAR:
                x = a * Math.cos(b);
                y = a * Math.sin(b);
                break;
        }
    }
}
