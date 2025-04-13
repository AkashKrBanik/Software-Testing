package TestngAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionEx1 {
    String name = "VIT";
    @Test
    public void checkEqual(){
        if (name.equals("VIT"))
            System.out.println("Name is Equal");
        else 
        	System.out.println("Name is not Equal");
        Assert.assertEquals(name, "VIT");
    }

}
