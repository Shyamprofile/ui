package Javapracticesdetqa;
// Exception Practice
public class Assignment20 {

	public static void main(String[] args) {
		try{
			int int1= 50/0;
		}catch (ArithmeticException ae) {
			System.out.println("Arithmtic Exception");
		}
		try{
			String k= "Atul";
			int l= Integer.parseInt(k);
		}catch (ArithmeticException e) {
		System.out.println("Arithmetic Exception");
	    }catch (NumberFormatException e) {
		System.out.println("NumberFormat Exception");
		}
		finally {
		System.out.println("Print ");	
		}
	}

}
