package TestCasePriority;

import org.testng.annotations.Test;

public class PriorityExample {

	@Test(priority=-6)
	public void sample() {
		System.out.println("Test with Negative priority");
	}
	
	@Test(priority=20)
	public void sample1() {
		System.out.println("Test with Same priority 20 A");
	}
	
	@Test(priority=20)
	public void sample3() {
		System.out.println("Test with Same priority 20 B");
	}
	
	@Test
	public void sample5() {
		System.out.println("Test with default priority 0");
	}
	
	@Test(priority=50)
	public void sample4() {
		System.out.println("Test with priority 50");
	}
}
