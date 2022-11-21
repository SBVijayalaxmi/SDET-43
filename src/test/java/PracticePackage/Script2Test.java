package PracticePackage;

import org.testng.annotations.Test;

public class Script2Test {

	@Test(groups = "regression")
	public void simple1()
	{
		System.out.println("-- simple1 --");
	}
	
	@Test(groups = {"smoke", "regression"})
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
