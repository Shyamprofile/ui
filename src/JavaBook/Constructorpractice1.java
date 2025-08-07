package JavaBook;
// creating class and making parameterized constructor for the same
public class Constructorpractice1 {
	double width,height,depth,length;
	
	Constructorpractice1(int w, int h, int d){	
		width=w;
		height=h;
		depth=d;
	}

	Constructorpractice1(double w, double h, double d){	
		width=w;
		height=h;
		depth=d;
	}
	Constructorpractice1(double width, double height, double depth,double length){	
		this.width=width;
		this.height=height;
		this.depth=depth;
		this.length=length;
	}
	
	 double area() {
		 return width*height;
	 }	
	 double volume() {
		 return width*height*depth;
	 }	
	 double average() {
		 return(width+height+depth+length)/4;
	 }

}
