//package assignment6;

import java.util.Scanner;




public class C10E13MyRectangle2D {

	private double x;
	private double y;
	private double width;
	private double height;
	
	
	public C10E13MyRectangle2D() {
		this(0,0,1,1);
	}
	public C10E13MyRectangle2D(double a, double b, double c, double d){
		
		this.x = a;
		this.y = b;
		this.width = c;
		this.height = d;
	}
	
	public double perimeter(){
		
		return 2 * (this.width + this.height);
	}
	
	public double area(){
		
		return this.width * this.height;
	}
	
	public boolean contains(double x, double y) {
		return Math.abs(x - this.x) <= width / 2
				&& Math.abs(y - this.y) <= height / 2;
	}

	public boolean contains(C10E13MyRectangle2D r) {
		return contains(r.x - r.width / 2, r.y + r.height / 2)
				&& contains(r.x - r.width / 2, r.y - r.height / 2)
				&& contains(r.x + r.width / 2, r.y + r.height / 2)
				&& contains(r.x + r.width / 2, r.y - r.height / 2);
	}
	
	public boolean overlaps(C10E13MyRectangle2D r) {
		return (this.x==r.x) && (this.y==r.y) && (this.width==r.width) && (this.height==r.height);
		//return Math.abs(this.x - r.x) == (this.width + r.width) / 2
			//	&& Math.abs(this.y - r.y) == (this.height + r.height) / 2;
	}


	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
		int ch =1;
		while(ch==1){
			
			System.out.println("Enter the centre of first rectangle: ");
			double x = input.nextDouble();
			double y = input.nextDouble();
			System.out.println("Enter the width of rectangle:");
			double width = input.nextDouble();
			System.out.println("Enter the height of rectangle:");
			double height = input.nextDouble();
			C10E13MyRectangle2D c1 = new C10E13MyRectangle2D(x,y,width,height);
			int loop = -1;
			while(loop!=0){
				int choice;
				System.out.println();
				System.out.println("----->Enter 1 to check whether the point lies inside the rectangle");
				System.out.println("----->Enter 2 to find out if the rectangle is inside the first rectangle ");
				System.out.println("----->Enter 3 to find whether the second rectangle overlap the first rectangle");
				System.out.println("----->Enter 0 to exit");
				choice = input.nextInt();
				
				if(choice == 1)
				{
					System.out.println("enter the coordinates");
					double x1 = input.nextDouble();
					double y1 = input.nextDouble();
					boolean check = c1.contains(x1, y1);
					if(check)
						System.out.println("Point lies inside the rectangle");
					else
						System.out.println("Point lies outside the rectangle");
				}
				
				else if(choice == 2)
				{
				    System.out.println("enter the center of the second rectangle");
				    double x1 = input.nextDouble();
				    double y1 = input.nextDouble();
				    System.out.println("enter the width of the second rectangle");
				    double width1 = input.nextDouble();
					System.out.println("enter the height of the second rectangle");
					double height1 = input.nextDouble();
					C10E13MyRectangle2D c2 = new C10E13MyRectangle2D(x1,y1,width1,height1);
					boolean check = c1.contains(c2);
					if(check)
						System.out.println("Second rectangle is inside the first rectangle");
					else
						System.out.println("Second rectangle is not inside the first rectangle");
				}
				
				else if(choice == 3)
				{
					 System.out.println("enter the center of the second rectangle");
					    double x1 = input.nextDouble();
					    double y1 = input.nextDouble();
					    System.out.println("enter the width of the second rectangle");
					    double width1 = input.nextDouble();
						System.out.println("enter the height of the second rectangle");
						double height1 = input.nextDouble();
						C10E13MyRectangle2D c2 = new C10E13MyRectangle2D(x1,y1,width1,height1);
						boolean check = c1.overlaps(c2);
						if(check)
							System.out.println("Second rectangle overlaps the first rectangle");
						else
							System.out.println("Second rectangle does not overlap the first rectangle");
				}
				else
					loop = 0;
			}
			
			ch = -1;
		}
		
	}

}
	
	

	


	


	
