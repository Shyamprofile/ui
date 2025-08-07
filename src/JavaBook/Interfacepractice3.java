package JavaBook;

public class Interfacepractice3 {

	public static void main(String[] args) {
		Interfacepractice1 ifu = new Interfacepractice2();
		System.out.println(ifu.sum(5, 8));
		System.out.println(ifu.sum(5, 8,10));
		Interfacepractice2 ifa = new Interfacepractice2();
		System.out.println(ifa.multiply(3, 5, 4));
		if(ifa.checknegativeno(9)==false) {
			System.out.println("no is positive");
		}
	}

}
