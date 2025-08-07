package JavaBook;

public class Inheritancepractic2 extends Inheritancepractice1 {
	
	Inheritancepractic2(int i, int j) {
		super(i, j);
	}
	void show(){
	    System.out.println("I am great") ; 
	    
	    }
	void show1(){
	    super.show() ; 
	    
	    }
}
