//importing libraries
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//test runner class
public class TestRunner {
	
	//main methd	
	public static void main(String[] args) {

		//making object of Result class	
		Result resultA = JUnitCore.runClasses(greedyTest.class);

		//if fails
		for (Failure failureA : resultA.getFailures()) {
			System.out.println(failureA.toString());
		}

		//if passes
		System.out.println("Greedy Algorithm Test: "+resultA.wasSuccessful());

		//making object of Result class	
		Result resultB = JUnitCore.runClasses(dynamicTest.class);

		//if fails
		for (Failure failureB : resultB.getFailures()) {
			System.out.println(failureB.toString());
		}

		//if passes
		System.out.println("Dynamic Algorithm Test: "+resultB.wasSuccessful());

	}
}  	