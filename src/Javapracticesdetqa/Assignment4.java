package Javapracticesdetqa;
//Print whether no is positive or negative
import java.util.Scanner;
public class Assignment4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no");
		Integer I1=sc.nextInt();
		if(I1<0) {
			System.out.println("negative");
		}else {
			System.out.println("positive");
		}
	}
}
