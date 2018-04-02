package com.company;

import com.company.Triangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TriangleTest {

    @Test
    public void testCorrectTriangleCreation(){
        Triangle triangle = new Triangle(3, 4, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNonExistentTriangleCreation(){
        Triangle incorrectTriangle = new Triangle(2, 2, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNotCorrectTriangleCreation(){
        Triangle incorrectTriangle = new Triangle(-2, 10, 100);
    }

    @Test
    public void testCopyConstructor(){
        Triangle triangle1 = new Triangle(3, 4, 5);
        Triangle triangle2 = new Triangle(triangle1);
        assertEquals(triangle1.getA(), triangle2.getA());
        assertEquals(triangle1.getB(), triangle2.getB());
        assertEquals(triangle1.getC(), triangle2.getC());
    }

    @Test
    public void testIsRightTriangle(){
        Triangle rightTriangle = new Triangle(3, 4, 5);
        assertTrue(rightTriangle.isTriangleRight());
        Triangle triangle = new Triangle(3, 3, 4);
        assertFalse(triangle.isTriangleRight());
    }

}
