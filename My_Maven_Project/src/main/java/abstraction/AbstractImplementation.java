package abstraction;

public class AbstractImplementation extends Student {
	public  void process()
	{
		System.out.println("Implementation details");
	}

	public static void main(String[] args) {
		
		AbstractImplementation ai=new AbstractImplementation();
		ai.process();
		ai.setUp();
		ai.tearDown();
	}

}
