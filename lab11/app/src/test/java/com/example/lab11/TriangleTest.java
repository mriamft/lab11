package com.example.lab11;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {


    @Test
    public void is_Equilateral() {
        int a=3 , b=6, c=4;
        boolean expectedOutput = false;
        Triangle t = new Triangle();
        boolean res = t.Is_Equilateral(a,b,c);
        assertEquals(expectedOutput, res);
    }

    @Test
    public void is_Isosceles() {
        int a=3 , b=6, c=4;
        boolean expectedOutput = false;
        Triangle t = new Triangle();
        boolean res = t.Is_Isosceles(a,b,c);
        assertEquals(expectedOutput, res);
    }

    @Test
    public void is_Scalene() {
        int a=3 , b=6, c=4;
        boolean expectedOutput = true;
        Triangle t = new Triangle();
        boolean res = t.Is_Scalene(a,b,c);
        assertEquals(expectedOutput, res);
    }
}