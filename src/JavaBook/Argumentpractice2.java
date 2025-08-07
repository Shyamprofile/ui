package JavaBook;

public class Argumentpractice2 {

	public static void main(String[] args) {
		Argumentpractice1 pra= new Argumentpractice1();
		int a=35, b=40;
		pra.meth(a, b);
//will print a and b value as 35 and 40 respectively.As it uses call by reference so prints and b respectively.
		System.out.println(a +" and "+b);
//to overcome it use return method and pass parameters directly. one limit is we can have only 1 return statement		
		System.out.println(pra.meth(5, 10));
	}

}
