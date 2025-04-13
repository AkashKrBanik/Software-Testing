package DependencyManagement;

import org.testng.annotations.Test;

public class DependencyManagement {
    @Test(enabled = true)
    public void highschool(){
        System.out.println("Highschool");
    }
    @Test(dependsOnMethods = "highschool")
    public void highersecondary(){
        System.out.println("Higher Secondary");
    }
    @Test(dependsOnMethods = "highersecondary")
    public void college(){
        System.out.println("College");
    }
}
