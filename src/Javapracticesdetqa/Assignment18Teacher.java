package Javapracticesdetqa;
// Create class teacher which contains variables and methods 
//Designation ="Teacher"
//college name="Beginners Book"
//does()- teaching
//Create another class Computer teacher and which extends teacher then create object and call method
public class Assignment18Teacher {
	static String CollegeName="Beginners book";
	String Designation="Teacher";
	
	void doesteaching() {
		System.out.println(CollegeName);
		System.out.println("does " +Designation+ "teaching");
	}
}
