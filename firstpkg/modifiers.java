package firstpkg;



public class modifiers {
	
	private void room2()
	{
		System.out.println("from room2");
	}


	public static void main(String[] args) {
		
		First house=new First();
		house.room1();
		
		modifiers some= new modifiers();
		some.room2();
		

	}

}
