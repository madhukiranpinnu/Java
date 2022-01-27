import org.testng.annotations.Test;

public class Getter {
    @Test(dataProvider = "cred",dataProviderClass = Provider.class)
    public void login(String mail,String pwd){
        System.out.println(mail);
        System.out.println(pwd);
    }
}
