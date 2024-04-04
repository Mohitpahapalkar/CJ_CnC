package compiletimeexception.using_try_catch_block;

public class Main {

	public static void main(String[] args)//here caller function doesnt need to handle the exception 
	{
		method1();

	}
	public static void method1(){
		try {
			throw new ClassNotFoundException();
		}
		catch(ClassNotFoundException exceptionObject){
			exceptionObject.printStackTrace();
		}
	}
	

}

//Or you can also try this


 class Main1{

	 public static void main(String[]args) 
	{
		 try {
			 method1();
		 }
		 catch(ClassNotFoundException exceptionObj) {
			 //handle it
		 }
	}

	public static void method1() throws ClassNotFoundException {
	throw new ClassNotFoundException();
		
	}
	
}
