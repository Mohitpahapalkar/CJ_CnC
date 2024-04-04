package nestedinterfaces;

//Implementing both outer and inner class
public class Eagle3 implements Bird,Bird.NonFlyingBird {

//if implementing both inner and outer class we need to override the methods of both the classes
	@Override
	public void canRun() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void canFly() {
		
		
	}
	

}
