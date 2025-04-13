package TestngGroup;

import org.testng.annotations.Test;

public class GroupEx3 {
    @Test(groups={"login"})
    public void StudentLogin() {
        System.out.println("Student Login");
    }
    @Test
    public void StudentDetails(){
        System.out.println("Student Details");
    }
}
