import A.*;
import B.*;
public class Test{

	public static void main(String[] args){
	
		A a= new B(); // protected access -> fail
		System.out.println("A a: name="+a.name);
		
		B b = new B(); // protected access -> fail
		System.out.println("B b: name="+b.name);



	
	}

}
