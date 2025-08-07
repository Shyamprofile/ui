package JavaBook;

//Calling constructor
public class Constructorpractice2 {

	public static void main(String[] args) {
		Constructorpractice1 box1= new Constructorpractice1(1,2,3);
		double Area= box1.area();
		System.out.println(box1.width);
		System.out.println(box1.height);
		
		System.out.println(Area);
		
		Constructorpractice1 box2= new Constructorpractice1(3.0,2.0,3.0);
		System.out.println(box2.volume());
		
		Constructorpractice1 box3= new Constructorpractice1(3.2,2.1,3.5,9);
		System.out.println(box3.average());

	}

}
