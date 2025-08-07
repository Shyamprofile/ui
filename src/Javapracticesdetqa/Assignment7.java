package Javapracticesdetqa;
//Count no of digits in a number
import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no");
		Integer I1= sc.nextInt();
		Integer numberofdigits= 0;
		while(I1>0) {
		I1=I1/10;
		numberofdigits=numberofdigits+1;
		}
		System.out.println(numberofdigits);	
	}
}
