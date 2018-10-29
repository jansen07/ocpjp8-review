package B;
import  A.*;
public class B extends A{

	public void printName(){
		B b= new B();
		b.name="Test"; // inherited access is acceptable
		
		A a = new B();
		a.name="Test Parent Reference"; // even if it's instance of b, A signature applies and protected access is not accessible via other package
	
	}

}
