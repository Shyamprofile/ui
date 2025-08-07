package Javapracticesdetqa;
//Create class Calculator with following methods
//int sum(int x , int y) takes 2 integer and returns sum
//int sum(int x , int y, int z) takes 3 integer and returns sum
//double sum(int x , int y) takes 2 double and returns sum
//double sum(int x , int y, int z) takes 3 double and returns sum
//Now create object class and call different methods
public class Assignment17Calculatoroverload {
	
	int sum(int x, int y) {
		int sum =x+y;
		System.out.println(sum);
		System.out.println("--------------------------");
		return sum;
		}
	int sum(int x, int y, int z) {
		int sum =x+y+z;
		System.out.println(sum);
		System.out.println("--------------------------");
		return sum;
		}
	double sum(double x, double y, double z) {
		double sum =x+y+z;
		System.out.println(sum);
		System.out.println("--------------------------");
		return sum;
		}
	double sum(double x, double y) {
		double sum =x+y;
		System.out.println(sum);
		System.out.println("--------------------------");
		return sum;
		}
}
