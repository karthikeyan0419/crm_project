package crm_com_pom;

import org.testng.annotations.Test;

import com_crm_project.BaseClass;
import com_crm_project.PomPage;

public class Test01  extends BaseClass {
	@Test
	public void Test01() {
	PomPage pp = new PomPage();
	pp.org();
	
	}


}
