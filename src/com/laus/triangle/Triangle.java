package com.laus.triangle;

public class Triangle {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isValid() {
        return (a < b + c) && (b < a + c) && (c < a + b);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getHalfPerimeter() {
        return getPerimeter() / 2;
    }

    public double getSurface() {
        double halfPerimeter = getHalfPerimeter();
        return Math.sqrt(halfPerimeter *
                (halfPerimeter - a) *
                (halfPerimeter - b) *
                (halfPerimeter - c));
    }

    public double getHeight() {
        double halfPerimeter = getHalfPerimeter();
        return 2 * getSurface() / a;
    }

    public TriangleType getType() {
        if (a == b && b == c && a == c) {
            return TriangleType.Equilateral;
        } else if (a == b || b == c || a == c) {
            return TriangleType.Isosceles;
        }
        return TriangleType.Scalene;
    }
}
