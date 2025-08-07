package JavaBook;

public class Inheritancepractice1 {
	
	int i=10;
	int j=20;
	Inheritancepractice1(int i, int j){
//this.i and this.j refer to class variables of Inheritancepractice1 declared at top		
//		i=this.i;
//		j=this.j;
		 System.out.println("Printing value using constructor i :" +i) ; 
		 System.out.println("Printing value using constructor j  :" +j);
	}
    void show(){
    System.out.println("Value of i :" +i) ; 
    System.out.println("Value of j :" +j) ; 
    }
	}	

