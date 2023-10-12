package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when040to250then1019() {
        double expected = 10.19;
        Point a = new Point(0, 40);
        Point b = new Point(2, 50);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when300to21then2801() {
        double expected = 28.01;
        Point a = new Point(30,0);
        Point b = new Point(2,1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to220then2009() {
        double expected = 20.09;
        Point a = new Point(0,0);
        Point b = new Point(2,20);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}