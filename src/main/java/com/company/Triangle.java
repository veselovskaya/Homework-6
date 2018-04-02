package com.company;

public class Triangle {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c){
        if (!(a+b>c && a+c>b && b+c>a))
            throw new IllegalArgumentException("Треугольник не существует");
        if ((a > 0)&&(b > 0)&&(c > 0)){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        else throw new IllegalArgumentException("Длины сторон не могут быть меньше 1");
    }

    public Triangle(Triangle triangle){
        this.a = triangle.a;
        this.b = triangle.b;
        this.c = triangle.c;
    }

    public boolean isTriangleRight(){
        return (((a * a + b * b) == (c * c)) || ((b * b + c * c) == (a * a)) || ((a * a + c * c) == (b * b)));
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
