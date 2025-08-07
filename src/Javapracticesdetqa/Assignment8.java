package Javapracticesdetqa;
//Calculate sum value of an array
public class Assignment8 {

	public static void main(String[] args) {
		int sum =0;
		int a[][]= {{2, 51}, {60,8}, {89,9},{78,7}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<=a[0].length-1;j++) {
				sum= sum + a[i][j];
			}
		}
		System.out.println(sum);
	}
}
