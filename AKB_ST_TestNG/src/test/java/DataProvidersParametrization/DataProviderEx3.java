package DataProvidersParametrization;

import org.testng.annotations.Test;

public class DataProviderEx3 {
    @Test(dataProvider = "mydata",dataProviderClass = DataProviderEx2.class)
    public void Login(String user, String pass){
        System.out.println("Login");
        System.out.println("User: " + user);
        System.out.println("Password: " + pass);
    }
}
