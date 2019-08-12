/*
 * Every Shape will have the area and that area will be calculation will differ based on the shape type rectangle,triangle,circle etc.
 * 
 * I.e :- area(); will be different for all shapes 
 * 
 */

package com.companyname.demo1.abstractclass.Introducation;

abstract class Shape {
	public abstract double area();
}




class Rectangle extends Shape {
	private final double width, length; // sides

	public Rectangle() {
		this(1, 1);
	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double area() {
		// A = w * l
		return width * length;
	}
}

class Circle extends Shape {
	private final double radius;
	final double pi = Math.PI;

	public Circle() {
		this(1);
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return pi * Math.pow(radius, 2);
	}
}

class Triangle extends Shape {
	private final double a, b, c; // sides

	public Triangle() {
		this(1, 1, 1);
	}

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double area() {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

}

public class Demo_AbstractClass_Intro_4 {

	public static void main(String[] args) {
		// Rectangle test
		double width = 5, length = 7;
		Shape rectangle = new Rectangle(width, length);
		System.out.println("Rectangle width: " + width + " and length: " + length + "\nResulting area: "
				+ rectangle.area() + "\n");

		// Circle test
		double radius = 5;
		Shape circle = new Circle(radius);
		System.out.println("Circle radius: " + radius + "\nResulting Area: " + circle.area() + "\n");

		// Triangle test
		double a = 5, b = 3, c = 4;
		Shape triangle = new Triangle(a, b, c);
		System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c + "\nResulting Area: " + triangle.area()
				+ "\n");
	}

}
