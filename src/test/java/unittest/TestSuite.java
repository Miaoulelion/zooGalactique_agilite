package unittest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import testsfonctionnels.RunCucumberTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   PlaneteTest.class,
   VilleTest.class,
   ZooTest.class,
   RunCucumberTest.class
})

public class TestSuite {   
	
}  	