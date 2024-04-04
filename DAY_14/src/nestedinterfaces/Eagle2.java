package nestedinterfaces;

//implementing the inner interface
public class Eagle2 implements Bird.NonFlyingBird {

	
	//implementing abstract method of inner interface
	@Override
	public void canRun() {
		// TODO Auto-generated method stub
		System.out.println("yes can run");
		
	}
	

}
