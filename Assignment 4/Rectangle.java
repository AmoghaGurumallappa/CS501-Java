import java.util.Scanner;

public class Rectangle {

	
	public static void main(String[] args) throws Exception    {
		
		 double width = 1.0;
		 double height = 1.0;
		Rectangle r1= new Rectangle();
		Rectangle r2= new Rectangle(4,40);
		Rectangle r3= new Rectangle(3.5,35.9);
		//create a scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("The area of rectangle with width and height " +  r1.width +  " & "   +   r1.height  + " is " + r1.getArea());
		System.out.println("The perimeter of rectangle with width and height " +  r1.width +  " & "   +   r1.height  + " is " + r1.getPerimeter());
		System.out.println("The area of rectangle with width and height " +  r2.width +  " & "   +   r2.height  + " is " + r2.getArea());
		System.out.println("The perimeter of rectangle with width and height " +  r2.width +  " & "   +   r2.height  + " is " + r2.getPerimeter());
		System.out.println("The area of rectangle with width and height " +  r3.width +  " & "   +   r3.height  + " is " + r3.getArea());
		System.out.println("The perimeter of rectangle with width and height " +  r3.width +  " & "   +   r3.height  + " is " + r3.getPerimeter());              System.out.println();
		//prompt the user to enter the width & height
		System.out.println("Enter the width and height of a rectangle: ");
		width = input.nextDouble();
		height = input.nextDouble();
		
        	
		try {
		    if(width < 0)
			Exception(width,"width");
				
			
		} catch (Exception e1) {
			System.out.println(e1.toString());
		}
		try {
			if(height < 0)
				Exception(height,"height");
			
		} catch (Exception e1) {
			System.out.println(e1.toString());
		}
	    
		if(width > 0 && height > 0){
		double Area = A(width,height); 
		System.out.println("Area of rectangle is: " + Area);
		double Perimeter = P(width,height);
		System.out.println("Perimeter of rectangle is: " + Perimeter);
		}
		
		
        	 
        	
	}
        


	public static double P(double width3, double height3) {
		double Perimeter = 2 * (width3 + height3);
		return Perimeter;
	}




	public static void Exception(double b,String widthorheight) throws Exception {
		
		switch (widthorheight){
			case "width":
				if(b < 0)
				{
		Exception myexception = new Exception("Width cannot be negative number");
				throw myexception;}
				break;
			case "height":
				if(b < 0)
				{
		Exception myexception = new Exception(" height cannot be negative number");
				throw myexception;}
				break;
		}
		
		 
	}


	public static double A(double width2, double height2) {
		double Area = width2 * height2;
		return Area;
	}


	double width;
	double height; 
	
	Rectangle(){
		width = 1;
		height = 1;
	}
 Rectangle(double W,double H){
	 width = W;
	 height = H;
 }
 //compute Area
public double getArea(){
	double Area;
	Area = width * height;
	return Area;
}
//compute perimeter 
public double getPerimeter(){
	double perimeter;
	perimeter = 2 * (width + height);
	return perimeter;
}

}

