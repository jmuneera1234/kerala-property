package kptestpkg;

import org.testng.annotations.Test;

import basepkg.baseclass;
import kppagepkg.kregisterpage;


public class kpregistertest extends baseclass {
	
	

@Test
public void regpage() throws InterruptedException
{
kregisterpage ob=new kregisterpage(driver);
ob.createpage();
ob.dropdwon("Property Owner");
ob.register("manu", "manu123456@gmail.com", "merin12345", "merin12345", "9876345627");
ob.create();
}



}
