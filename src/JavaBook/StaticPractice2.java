package JavaBook;

public class StaticPractice2 {

	public static void main(String[] args) {
		int a=5;
	
		Staticpractice1.printno(4);
//Staticpractice1.printn(0)cant be executed. It throws error as printn is not static and hence in not intialized at start. Will have to create child.
		Staticpractice1 stp= new Staticpractice1();
		stp.printn(10);
	}

}
