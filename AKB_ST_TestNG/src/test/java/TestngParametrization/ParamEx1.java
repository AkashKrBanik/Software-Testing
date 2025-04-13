package TestngParametrization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamEx1 {
    @Test
    @Parameters("Name")
    public void displayName(String name){
        System.out.println("Name is : "+name);
    }
}
