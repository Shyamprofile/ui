package Javapracticesdetqa;
//Create Student class with following variables and methods
//Variable Sid,Sub1,Sub2,Sub3,Sname
//Methods:
//	getstudata -takes Sid Sname as parameter and assign them to variables
//	getstumarks -takes student marks as parameter and assign them to Sub1,Sub2,Sub3
//	gettotalmarks -calculate total marks
//Now create object stu1, stu2 and call methods

public class Assignment15Studentclass {
	Integer Sid,Sub1,Sub2,Sub3;
	String Sname;
	
	void getstudata(Integer id,String name){
	Sid=id;	
	Sname= name;
	System.out.println("Name is " +name);
	System.out.println("Id is " +id);
	}
	void getstumarks(Integer s1, Integer s2,Integer s3){
		Sub1=s1;	
		Sub2= s2;
		Sub3= s3;
		System.out.println("Subject1 is " +s1);
		System.out.println("Subject2 is " +s2);
		System.out.println("Subject3 is " +s3);
		}
	void gettotalmarks(){
		System.out.println("Total marks is " +(Sub1+Sub2+Sub3));
		System.out.println("---------------------------------");
		}
}
