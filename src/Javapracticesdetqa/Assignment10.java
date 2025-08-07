package Javapracticesdetqa;
//Program to search specific string in an array
import java.util.Scanner;

public class Assignment10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String String1=sc.next();
		String a[]= {"Atul", "Shyam", "Appy","Shiv"};
		for(int i=0;i<a.length;i++) {
				if(a[i].equalsIgnoreCase(String1)) {
					System.out.println(String1 +" is present at "+ "a["+i+"]");
					break;
					}					
				}
			}
		}
