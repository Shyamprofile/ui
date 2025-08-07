package Javapracticesdetqa;
//find greatest of 3 no
import java.util.Scanner;
public class Assignment5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no");
		Integer I1=sc.nextInt();
		System.out.println("Enter second no");
		Integer I2=sc.nextInt();
		System.out.println("Enter third no");
		Integer I3=sc.nextInt();
		if(I1>I2&I2>I3) {
			System.out.print("I1 value " +I1 +"is greatest");
		}
		if(I2>I3&I2>I1) {
			System.out.print("I2 value " +I2 +"is greatest");
		}
		else {
			 System.out.print("I3 value " +I3 +" is greatest");
		}

	}

}
