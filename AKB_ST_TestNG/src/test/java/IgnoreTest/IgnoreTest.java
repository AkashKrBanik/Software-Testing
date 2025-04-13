package IgnoreTest;
import org.testng.annotations.Test;
public class IgnoreTest {
    @Test(priority =  0)
    public void startTheCar(){
        System.out.println("Starting the car");
    }
    @Test(priority =  1)
    public void swiftFirstGear(){
        System.out.println("First gear");
    }
    @Test(priority =  2)
    public void swiftSecondGear(){
        System.out.println("Second gear");
    }
    @Test(priority =  3)
    public void swiftThirdGear(){
        System.out.println("Third gear");
    }
    @Test(priority =  4)
    public void swiftFourthGear(){
        System.out.println("Fourth gear");
    }
    @Test(priority =  5,enabled = false)
    public void turnMusicOn(){
        System.out.println("Music ON");
    }
}
