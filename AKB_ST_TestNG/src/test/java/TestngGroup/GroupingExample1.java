package TestngGroup;
import org.testng.annotations.Test;
public class GroupingExample1 {
    @Test(groups = {"Apple"})
    public void apple1() {
        System.out.println("Testing Apple Phone one");
    }
    @Test(groups = {"Apple"})
    public void apple2() {
        System.out.println("Testing Apple Phone two");
    }
    @Test(groups = {"Vivo"})
    public void vivo1(){
        System.out.println("Testing Vivo Phone one");
    }
    @Test(groups = {"Vivo"})
    public void vivo2(){
        System.out.println("Testing Vivo Phone two");
    }
    @Test(groups = {"Moto"})
    public void moto1(){
        System.out.println("Testing Moto Phone one");
    }
    @Test(groups = {"Moto"})
    public void moto2(){
        System.out.println("Testing Moto Phone two");
    }
    @Test(groups = {"Lenovo"})
    public void lenovo1(){
        System.out.println("Testing Lenovo Phone one");
    }
    @Test(groups = {"Lenovo"})
    public void lenovo2(){
        System.out.println("Testing Lenovo Phone two");
    }
}
