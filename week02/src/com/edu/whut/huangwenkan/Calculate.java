package com.edu.whut.huangwenkan;


class Circle {
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double area() {
        return Math.pow(r, 2) * 3.1416;
    }
}

class Trapezoid {
    private double up_x;
    private double down_y;
    private double height;

    public Trapezoid(double up_x, double down_y, double height) {
        this.up_x = up_x;
        this.down_y = down_y;
        this.height = height;
    }

    public double getUp_x() {
        return up_x;
    }

    public void setUp_x(double up_x) {
        this.up_x = up_x;
    }

    public double getDown_y() {
        return down_y;
    }

    public void setDown_y(double down_y) {
        this.down_y = down_y;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return (up_x + down_y) * height / 2;
    }

}

public class Calculate {
    public static void main(String[] args) {
        Circle c = new Circle(1, 1, 4);
        Trapezoid t = new Trapezoid(2, 3, 4);
        System.out.println("the circle's area is " + c.area());
        System.out.println("the trapezoid's area is " + t.area());

    }

}
