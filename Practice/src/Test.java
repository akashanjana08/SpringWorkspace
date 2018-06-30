
class Base{
	
	void show()
	{
		System.out.println("Show Base");
	}
	
	void display()
	{
		show();
	}
	
}


public class Test extends Base{

	
	void show()
	{
		System.out.println("Test Show");
	}
	
	public static void main(String[] args) {
		
		new Test().display();
	}
}
