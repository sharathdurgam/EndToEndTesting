package com.sparknetworks.Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import process.SearchProcess;

public class SearchTest extends DriverClass {

	
	SearchProcess sp ;

	
	@Test(priority=1)
	public void searchForSparkNetworks() throws IOException, InterruptedException {
		sp = new SearchProcess(driver);
		sp.SearchResult();
		AssertJUnit.assertEquals(sp.textvalue, "Spark Networks SE | A global leading dating company");

	} 
	
	@Test(priority=2)
	public void searchForFunnyCatMemes() throws IOException  {
		sp = new SearchProcess(driver);
		sp.SearchResultWithScreenShot();
		

	} 
	
	
}
