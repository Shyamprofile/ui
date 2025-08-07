package JavaBook;

import java.util.Arrays;

public class generalpractice {

	public static void main(String[] args) {
		
// byte typecasting
		int i= 257;
		double d =324.57;
		byte b=(byte)i;
		byte c=(byte)d;
		System.out.println(b);
		System.out.println(c);
/*Arrays print		
		0
		1 2
		3 4 5
		6 7 8 9
*/		
		int te[][] = new int[4][4];
		int z=0;
		for(int r=0;r<4; r++) {
			for(int l=0;l<=r; l++) {
				te[r][l]= z;
				z++;
			}			
		}
			for(int s=0;s<=3; s++) {
				for(int l=0;l<=s; l++) {
					System.out.print(te[s][l]+" ");
				}
				System.out.println();
		}
//ternary ? operator
			int it = -10 ;
			int ky = 7 ;
			
			int yz=ky>0? ky:-ky;
			System.out.println("Absolute value of ky is " + yz );
			int yu=it<0? -it:it;
			System.out.println("Absolute value of it is " + yu );  
	}

}
