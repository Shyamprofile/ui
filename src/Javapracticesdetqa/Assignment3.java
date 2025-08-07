package Javapracticesdetqa;
//Swap two nos
import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no");
		Integer I1=sc.nextInt();
		System.out.println("Enter second no");
		Integer I2=sc.nextInt();
		Integer b= I1;
		I1=I2;
		I2=b;	
		System.out.println("I1="+I1);
		System.out.println("I2="+I2);
	}

}
