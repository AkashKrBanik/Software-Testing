package TestngListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenersEx1 implements ITestListener {
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart: Test Case Execution is going to Start");
    }
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Case Execution is going to Success");
    }
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Case Execution is going to Failure");
    }
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Case Execution is going to Skipped");
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test Case Execution is going to Failure");
    }
    public void onStart(ITestContext context) {
        System.out.println("\nonStart: Test Case Execution is going to Start");
    }
    public void onFinish(ITestContext context) {
        System.out.println("Test Case Execution is going to Finish");
    }
}
