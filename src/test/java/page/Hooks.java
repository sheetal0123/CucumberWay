package page;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 *  @Before is same as @BeforeMethod in TestNG i.e. Run with every scenario
 * @author Sheetal_Singh
 *
 */
public class Hooks {
	
	@Before(order = 1)
	public void beforeorderA(){
		System.out.println("-------- Before 1 -------");
	}

	@Before(order = 2)
	public void beforeorderB(){
		System.out.println("-------- Before 2 -------");
	}
	
	@Before
	public void init(){
		System.out.println("*************** Before Scenario Basic *****************");
	}
	


	//@Before("@h1")
	public void before2(){
		System.out.println("-------- Before h1 only -------");
	}

	
	
//	@After
//	public void tearDown(){
//		System.out.println("--------------- After Scenario ---------------\n\n\n");
//	}
//	
//	
//	@After(order = 2)
//	public void tearDownB(){
//		System.out.println("--------------- After Scenario 2 ---------------\n\n\n");
//	}
//	
//	@After(order = 1)
//	public void tearDownA(){
//		System.out.println("--------------- After Scenario 1---------------\n\n\n");
//	}
	
	
}
