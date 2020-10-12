public class InstanceInitializer{

	{System.out.println("inside instance initializer");}
	
	public InstanceInitializer(){
	
		System.out.println("inside constructor");
	}


	public static void main(String args[]){
		System.out.println("inside main");
	 InstanceInitializer i = new InstanceInitializer();	
	}
}
