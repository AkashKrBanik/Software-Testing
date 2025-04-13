package DataProvidersParametrization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx2 {
    @Test(dataProvider = "mydata")  // dataProvider with name "mydata"
    public void Login(String user, String password){
        System.out.println("Login Credentials");
        System.out.println("User: " + user);
        System.out.println("Password: " + password);
    }
    @DataProvider(name = "mydata")
    public Object[][] getData(){
        Object[][] data = new Object[3][2];
        data[0][0] = "UserONE";
        data[0][1] = "VIT1@";
        data[1][0] = "UserTWO";
        data[1][1] = "VIT12#";
        data[2][0] = "UserTHREE";
        data[2][1] = "VIT123#t$";
        return data;
    }

}
