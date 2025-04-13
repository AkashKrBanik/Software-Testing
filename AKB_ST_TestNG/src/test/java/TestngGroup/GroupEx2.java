package TestngGroup;

import org.testng.annotations.Test;

public class GroupEx2 {
    @Test(groups = {"login"})
    public void ParentLogin(){
        System.out.println("Parent Login");
    }
    @Test
    public void ParentDetails(){
        System.out.println("Parent Details");
    }
}
