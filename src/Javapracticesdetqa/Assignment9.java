package Javapracticesdetqa;
//Program to search specific no in an array
import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer no");
		int int1=sc.nextInt();
		int a[][]= {{2, 51}, {60,8}, {89,9},{78,7}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<=a[0].length-1;j++) {
				if(a[i][j]==int1) {
					System.out.println(int1 +" is present at "+ "a["+i+"]["+j+"]");
					break;
					}					
				}
			}
		}
	}

