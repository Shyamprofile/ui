package Javapracticesdetqa;

import java.util.Arrays;

public class Sortarrays {

	public static void main(String[] args) {
		int a[]= {-5,0,-7,12,4,6,1,89,1999,85};
//Sort arrays in ascending order		
		Arrays.sort(a);
		for(int k :a) {
		System.out.print(k+",");	
		
		}
		System.out.println();
//Sort arrays in ascending order using start index and end index
		int aty[]= {-89,56,-67,190,4,6,1,44,1999,85};
		Arrays.sort(aty, 3, 7);
		for(int g :aty) {
			System.out.print(g+",");
			}
		System.out.println("---------");
////Sort arrays in descending order(reverse ascending order)
		
			for(int s=a.length-1; s>=0; s--) {
				System.out.print(a[s]+",");
			}
			
		
	}

}
