package PracticePackage;

import org.testng.annotations.Test;

public class Script1Test {

	@Test
	public void create()
	{
		System.out.println("-- created --");
	}
	
	@Test(groups = "smoke")
	public void update()
	{
		System.out.println("-- updated --");
	}
	
	@Test
	
	public void delete()
	{
		System.out.println("-- deleted --");
	}
	
	
}
