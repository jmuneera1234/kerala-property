package kptestpkg;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepkg.baseclass;
import kppagepkg.kploginpage;




public class kplogintest extends baseclass
	
	{
	@Test

	public void lp()

	{

		kploginpage ob=new kploginpage(driver);

		ob.log();

		ob.reg("sara12345@gmail.com", "Sara12345");

		ob.login();

		



	}




}
