package TestngListeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class MyTest {
	 @Test
    public void passingTest() {
        System.out.println("Running passingTest...");
        Assert.assertTrue(true);
    }

    @Test
    public void failingTest() {
        System.out.println("Running failingTest...");
        Assert.assertTrue(false, "Intentionally failing the test");
    }

    @Test
    public void skippingTest() {
        System.out.println("Running skippingTest...");
        throw new SkipException("Skipping this test based on a condition");
    }
}
