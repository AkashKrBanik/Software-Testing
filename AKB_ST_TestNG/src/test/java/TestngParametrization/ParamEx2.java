package TestngParametrization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamEx2 {
    @Test
    @Parameters({"UserName","Password"})
    public void sample1(String UserName, String Password) {
        System.out.println("UserName: " + UserName);
        System.out.println("Password: " + Password);
    }
}
