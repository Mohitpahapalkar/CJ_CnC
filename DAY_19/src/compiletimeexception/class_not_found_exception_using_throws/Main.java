package compiletimeexception.class_not_found_exception_using_throws;

public class Main {
public static void main(String[]args) throws ClassNotFoundException {
	method1();
}

public static void method1() throws ClassNotFoundException {
	throw new ClassNotFoundException();
//it must be caught otherwise it can't be compiled 
//add throws in function declaration 
//"throws" tells that this method MIGHT throw this exception ,so pls caller you handle it properly
//therefore caller like main here must also handle it properly thats why it needs to throws
	
}
}


//Lets try to handle above exception using try and catch block


