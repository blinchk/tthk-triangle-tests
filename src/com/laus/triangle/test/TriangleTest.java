package com.laus.triangle.test;

import com.laus.triangle.Triangle;
import com.laus.triangle.TriangleType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void assertTriangleIsEquilateral() {
        Triangle triangle = new Triangle(5, 5, 5);
        TriangleType expected = TriangleType.Equilateral;
        TriangleType actual = triangle.getType();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void assertTriangleIsScalene() {
        Triangle triangle = new Triangle(2, 3, 5);
        TriangleType expected = TriangleType.Scalene;
        TriangleType actual = triangle.getType();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void assertTriangleIsIsosceles() {
        Triangle triangle = new Triangle(5, 5, 3);
        TriangleType expected = TriangleType.Isosceles;
        TriangleType actual = triangle.getType();
        Assertions.assertEquals(expected, actual);
    }
}
