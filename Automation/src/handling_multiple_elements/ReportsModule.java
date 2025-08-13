package handling_multiple_elements;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ReportsModule extends BaseClass{
	@Test
	public void createReport() {
	Reporter.log("createReport",true);
	}
	@Test
	public void modifyReport() {
	Reporter.log("modifyReport",true);
	}
	@Test
	public void deleteReport() {
	Reporter.log("deleteReport",true);	
	}
}
