package TestngListeners;

import org.testng.annotations.Test;

public class SampleTestCase2 {
    @Test
    public void test2() throws Exception {
        int n = 3;
        if(n==3){
            System.out.println("Going to success!!");
            throw new Exception("I like big numbers!");
        }
        else{
            System.out.println("Thanks buddy!");
        }
    }
}
