package Javapracticesdetqa;

public class Assignment15Studentobject {

	public static void main(String[] args) {
		Assignment15Studentclass student1= new Assignment15Studentclass();
		student1.getstudata(1, "Shyam");
		student1.getstumarks(85, 70, 70);
		student1.gettotalmarks();
		Assignment15Studentclass student2= new Assignment15Studentclass();
		student1.getstudata(2, "Atul");
		student1.getstumarks(90, 60, 80);
		student1.gettotalmarks();
	}
}
