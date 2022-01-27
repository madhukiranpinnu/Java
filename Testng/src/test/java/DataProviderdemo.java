import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderdemo {
    @DataProvider(name="cred")
    public Object[][] getData(){
        Object[][] data={
                {"madhukiran918@gmail.com","madhu@123"},{"madhu12@gmail.com","satr"}};
        return data;
    }
    @Test(dataProvider = "cred")
    public void login(String mail,String pwd){
    System.out.println(mail);
    System.out.println(pwd);
    }
}
