package JavaBook;

public class Interfacepractice2 implements Interfacepractice1, Interfacepractice4.booleancheck {

	
	public int sum(int i, int j) {
		return i+j;
	}

	public int sum(int i, int j, int k) {
		return i+j+k;
	}
	
	public int multiply(int i, int j, int k) {
		return i*j*k;
	}

	public boolean checknegativeno(int i) {		
		return i<0? true : false;
	}

}
