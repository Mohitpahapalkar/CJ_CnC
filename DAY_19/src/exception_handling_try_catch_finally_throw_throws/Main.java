package exception_handling_try_catch_finally_throw_throws;

public class Main {
	public static void main(String args[]) {

		// multiple catch block for multiple throw exception
		try {
			method1("dummy");
		} catch (ClassNotFoundException exceptionObj) {

		} catch (InterruptedException exceptionobj) {

		}
		// catch block can only handle those exception which can be thrown by try block
	}

	public static void method1(String name) throws ClassNotFoundException, InterruptedException {
		if (name.equals("dummy")) {
			throw new ClassNotFoundException();
		} else {
			throw new InterruptedException();
		}

	}
}

//catch all exceptions

class Main1 {
	public static void main(String args[]) {

		// catch block for multiple throw exception
		try {
			method1("dummy");
		}
		// handling all exceptions
		catch (Exception exp) {

		}
	}

	public static void method1(String name) throws ClassNotFoundException, InterruptedException {
		if (name.equals("dummy")) {
			throw new ClassNotFoundException();
		} else {
			throw new InterruptedException();
		}

	}
}

//using finally

class Main2 {
	public static void main(String args[]) {

		// catch block for multiple throw exception
		try {
			method1("dummy");
		}
		// handling all exceptions
		catch (Exception exp) {

		}
		finally {
			//will always be executed
		}
	}

	public static void method1(String name) throws ClassNotFoundException, InterruptedException {
		if (name.equals("dummy")) {
			throw new ClassNotFoundException();
		} else {
			throw new InterruptedException();
		}

	}
}

class Main3{
	public static void main(String args[])throws ClassNotFoundException, InterruptedException{

		// catch block for multiple throw exception
		try {
			method1("dummy");
		}
		
		finally {
			//will always be executed
		}
	}

	public static void method1(String name) throws ClassNotFoundException, InterruptedException {
		if (name.equals("dummy")) {
			throw new ClassNotFoundException();
		} else {
			throw new InterruptedException();
		}

	}
}


