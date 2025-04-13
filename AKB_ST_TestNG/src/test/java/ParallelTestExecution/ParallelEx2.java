package ParallelTestExecution;

import org.testng.annotations.Test;

public class ParallelEx2 {
    @Test
    public void ParentLogin(){
        System.out.println("Parent Login");

    }
    @Test
    public void ParentDetails(){
        System.out.println("Parent Details");
    }
}
