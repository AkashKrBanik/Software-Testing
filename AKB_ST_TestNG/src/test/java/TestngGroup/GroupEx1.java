package TestngGroup;

import org.testng.annotations.Test;

public class GroupEx1 {
    @Test(groups = {"login"})
    public void FacultyLogin(){
        System.out.println("Faculty Login");
    }
    
    @Test
    public void FacultyDetails(){
        System.out.println("Faculty Details");
    }

}
