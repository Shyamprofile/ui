package JavaBook;

public class Classpractice2Objectcreation {

	public static void main(String[] args) {
//calling from Classpractice1 and creating object
		
		Classpractice1 box =new Classpractice1();
		box.width=3;
		box.height=4;
		box.depth=6;
		
		System.out.println(box.volume());

	}

}
