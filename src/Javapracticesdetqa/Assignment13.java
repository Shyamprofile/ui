package Javapracticesdetqa;
//Program to add two matrices
public class Assignment13 {

	public static void main(String[] args) {
		int a[][]= {{4,5},{7,90},{10,65}};
		int b[][]= {{34,13},{17,9},{11,50}};
		for(int i=0; i< a.length;i++) {
			for(int j=0; j< a[0].length;j++) {
			int k =a[i][j]+b[i][j];
			System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
