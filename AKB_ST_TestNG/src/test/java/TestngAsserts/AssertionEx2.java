package TestngAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionEx2 {
    @Test
    public void test1(){
        Assert.assertEquals("MIT","VIT");
    }
    @Test
    public void test2(){
        Assert.assertEquals("MIT","VIT","Test to check title");
    }
    @Test
    public void test3(){
        Assert.assertEquals(true,true);
    }
    
    @Test
    public void test12(){
        Assert.assertEquals(false,false);
    }
    
    @Test
    public void test4(){
        Assert.assertEquals(true,false, "Test to check login credentials");
    }

    @Test
    public void test6() {
    	Assert.assertTrue(true);
    }
    
    @Test
    public void test7() {
    	Assert.assertTrue(false);
    }
    
    @Test
    public void test8() {
    	Assert.assertTrue(false,"Test to check login credentials");
    }
    
    @Test
    public void test9() {
    	Assert.assertFalse(false);
    }
    
    @Test
    public void test10() {
    	Assert.assertFalse(true,"Test to check login");
    }
    


}
