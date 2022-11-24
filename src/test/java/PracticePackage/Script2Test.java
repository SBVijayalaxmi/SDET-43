package PracticePackage;

import org.testng.annotations.Test;

public class Script2Test {
	
	@Test(groups = "smoke")
	public void test1()
	{
		System.out.println("--test1");
	}
	
	public void test2()
	{
		System.out.println("--test2");
	}

}
