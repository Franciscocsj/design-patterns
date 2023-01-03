package br.com.study.patterns.adapter;

public class SquarePeg {

    private double widht;

    public SquarePeg(double widht) {
        this.widht = widht;
    }

    public double getWidht() {
        return widht;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.widht, 2);
        return result;
    }
}
