package custom_exeption;

public class Main {
	public static void main(String[]args) {
		
		try {
			method1();
		}
		catch(Exception e){
			
		}
	}

	public static void method1()throws CustomeException {
		// TODO Auto-generated method stub
		throw new CustomeException("This is custom Exception");
	}

}
