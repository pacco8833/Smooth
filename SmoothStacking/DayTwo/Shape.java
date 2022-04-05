package SmoothStack.DayTwo;
/*----------------------------------------------------------------------------
                            Program Useage:                               
*----------------------------------------------------------------------------*
1) Create Shape interface
2) Create Triangle subclass 
3) Create Rectangle subclass

Author: Carl Clarke @ Smoothstack
----------------------------------------------------------------------------*/

public interface Shape {

    abstract void calcArea();

    abstract void calcPerimeter();

    abstract double getPerimeter();

    abstract double getArea();

}

class Triangle implements Shape {

    double length, width, height, area, perimeter;

    Triangle(double length, double width, double height) {

        this.length = length;
        this.width = width;
        this.height = height;

    }

    public void calcArea() {

        area = (length * width) / 2;
    }

    public double getArea() {

        return area;

    }

    public double getPerimeter() {
        return perimeter;

    }

    public void calcPerimeter() {

        perimeter = length + width + height;

    }

}

class Rectangle implements Shape {

    double length, width, area, perimeter;

    Rectangle(double length, double width) {

        this.length = length;
        this.width = width;

    }

    public void calcArea() {

        area = (length * width);
    }

    public double getArea() {

        return area;

    }

    public double getPerimeter() {
        return perimeter;
    }

    public void calcPerimeter() {

        perimeter = (width * 2) + (length * 2);

    }

}