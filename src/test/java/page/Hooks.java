package page;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	
	@Before
	public void init(){
		System.out.println("--------------- Before Scenario ---------------");
	}

	@After
	public void tearDown(){
		System.out.println("--------------- After Scenario ---------------\n\n\n");
	}
	
}
