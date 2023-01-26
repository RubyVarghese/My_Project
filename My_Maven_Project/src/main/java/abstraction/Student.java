package abstraction;

public abstract class Student {
	public abstract void process();
	public void setUp()
	{
		System.out.println("Printing setup ");
	}
	public void tearDown()
	{
		System.out.println("Printing teardown");
	}

}
