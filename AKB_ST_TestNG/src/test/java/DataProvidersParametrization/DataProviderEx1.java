package DataProvidersParametrization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx1 {
    @Test(dataProvider = "getData")
    public void Login(String user, String pass) {
        System.out.println("Login Credentials");
        System.out.println("User: " + user);
        System.out.println("Password: " + pass);
    }
    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[3][2];
        data[0][0] = "UserOne";
        data[0][1] = "Password";
        data[1][0] = "UserTWO";
        data[1][1] = "VIT12#";
        data[2][0] = "UserTHREE";
        data[2][1] = "Vit123#$";
        return data;

    }
}
