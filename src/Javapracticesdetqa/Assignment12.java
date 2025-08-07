package Javapracticesdetqa;
//Program to find greatest and smallest no in array
public class Assignment12 {

	public static void main(String[] args) {
		int Greatestno=0;
		
		int a[]= {2, 51 , 60,8, 89,9,78,7,-5};
		int Smallestno=a[0];
		for(int x:a) {
		if(x>Greatestno) {
		Greatestno=x;
		}
		if(x<Smallestno) {
		Smallestno=x;
		}
		}
		System.out.println("Greatest no is " + Greatestno);
		System.out.println("Smallest no is " + Smallestno);
	}
}