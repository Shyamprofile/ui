package Javapracticesdetqa;
//Create a class Calculator with three integer variable
//Create a constructor for assign values into variable
//Create another methods sum to calculate its sum
//Now create object and call constructor by passing 3 integer values and then call sum method

public class Assignment16Calculator {
	Integer int1,int2,int3;
	
	Assignment16Calculator(Integer int1,Integer int2,Integer int3) {
		this.int1=int1;
		this.int2=int2;
		this.int3=int3;
		System.out.println("Integer1 value is : " +int1);
		System.out.println("Integer2 value is : " +int2);
		System.out.println("Integer3 value is : " +int3);
	}
	Assignment16Calculator(Integer int1,Integer int2) {
		this.int1=int1;
		this.int2=int2;
		System.out.println("Integer1 value is : " +int1);
		System.out.println("Integer2 value is : " +int2);		
	}
	void sum() {
		System.out.println((int1+int2+int3));
	}
}
