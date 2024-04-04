package nestedinterfaces;

public interface Bird //outer Interface 
{
	public void canFly();//abstract method

	//Nested interface
	//It can only be public 
	//because in interface everything is public
	public interface NonFlyingBird {
		public void canRun();//abstract method

	}

}
