import org.testng.annotations.DataProvider;

public class Provider {
    @DataProvider(name="cred")
    public Object[][] getData(){
        Object[][] data={
                {"madhukiran918@gmail.com","madhu@123"},{"madhu12@gmail.com","satr"}};
        return data;
    }
}
