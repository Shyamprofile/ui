package Javapracticesdetqa;
// Program to find whether numbers in array is odd or even
import java.util.Scanner;

public class Assignment11 {

	public static void main(String[] args) {
		int a[]= {2, 51 , 60,8, 89,9,78,7};
		for(int i=0;i<a.length;i++) {
				if(a[i]%2==0) {
					System.out.println(a[i] +" is even ");
				}else{
					System.out.println(a[i] +" is odd ");
				}
		}					
	}
}
