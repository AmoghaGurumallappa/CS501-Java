//package assignment6;

import java.util.Scanner;

public class C11E1Triangle {
	private double side1;
	private double side2;
	private double side3;
	
	public C11E1Triangle() {   
		this(1,1,1);
	}
	
	public C11E1Triangle(double a, double b, double c)throws IllegalArgumentException{
		if(a + b >c && b + c>a && a + c > b){
		side1 = a;
		side2 = b;
		side3 = c;
		}
		else
		throw new IllegalArgumentException("sum of two sides has to be greater then third side");
	}
	
	public double getArea(){
		 double s = (side1 + side2 + side3)/2;
		return Math.pow(s * (s-side1) * (s-side2) * (s-side3),0.5);
	}
	 
	public double getPerimeter(){
		return side1+side2+side3;
	}
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;
		}
	
	

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int ch = -1;
		System.out.println("---->enter choice<----");
		System.out.println("press non zero number to find the area of triangle");
		System.out.println("press 0 to exit");
		ch = input.nextInt();
		while(ch!=0){
		
		try{
           System.out.println("enter the sides for the triangle");
           double s1 = input.nextDouble();
           double s2 = input.nextDouble();
           double s3 = input.nextDouble();
		
		
		C11E1Triangle c1 = new C11E1Triangle(s1,s2,s3);
		System.out.println(c1.toString());
		System.out.println("Area of triangle is: "+c1.getArea());
		System.out.println("Perimeter of triangle is: "+c1.getPerimeter());
		}catch(IllegalArgumentException e){
			System.out.println(e);
		}
		System.out.println();
		System.out.println("---->enter choice<----");
		System.out.println("press non zero number to find the area of triangle");
		System.out.println("press 0 to exit");
	}

	}
	
	
}
		
		
	