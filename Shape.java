package calculate.area;
//created interface of shape which shows info in child class
public interface Shape {
	//declared data members
	int length=5;
	int breadth=4;
	int side=7;
	int radius=3;
	
	//declared abstract methods 
   void rectangleArea();
   void squreArea();
   void circleArea();
  
}
