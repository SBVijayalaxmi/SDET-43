package PracticePackage;

import org.testng.annotations.Test;

public class Script2Test {

	@Test
	public void simple1()
	{
		System.out.println("-- simple1 --");
	}
	
	@Test(groups = "smoke")
	public void simple2()
	{
		System.out.println("-- simple2 --");
	}
	
	@Test
	public void simple3()
	{
		System.out.println("-- simple3 --");
	}
}
