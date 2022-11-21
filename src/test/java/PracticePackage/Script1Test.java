package PracticePackage;

import org.testng.annotations.Test;

public class Script1Test {

	@Test(groups = "smoke")
	public void create()
	{
		System.out.println("-- created --");
	}
	
	@Test
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
