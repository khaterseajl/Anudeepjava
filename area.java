package calculate.area;
// below program  is to calculate area of rectangle,sqaure,circle
public class area implements Shape {
 //overriding methods
	 
	@Override //method overridden to display rectanglearea
	public void rectangleArea() {
		int area=length*breadth ;
		 System.out.println("area of rectangle is:"+area);
	}

	@Override //method overridden to display squarearea
	public void squreArea() {
		int area=side*side;
		System.out.println("area of square is:" +area);
		
	}

	@Override //method overridden to display circlearea
	public void circleArea() {
		double area=3.14*radius/2;
		System.out.println("area of circle is:"+area);
	}

}