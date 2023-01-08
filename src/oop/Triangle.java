package oop;

import java.util.Scanner;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {

    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    private boolean isValid(double s1, double s2, double s3){
        return s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1;
    }

    private double areaTriangle (){
        if(isValid(side1, side2, side3)) {
            double halfPer = (side1 + side2 + side3)/2;
            return Math.sqrt(halfPer * (halfPer - side1) * (halfPer - side2) * (halfPer - side3));
        }else{
            System.out.println("Triangle is not valid");
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter side 1");
        double side1 = sc.nextDouble();
        System.out.println("Please enter side 2");
        double side2 = sc.nextDouble();
        System.out.println("Please enter side 3");
        double side3 = sc.nextDouble();


        Triangle triangle1 = new Triangle();
        triangle1.setSide1(side1);
        triangle1.setSide2(side2);
        triangle1.setSide3(side3);

        System.out.println(triangle1.areaTriangle());


    }

}
