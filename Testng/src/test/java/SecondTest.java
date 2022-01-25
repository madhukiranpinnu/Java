import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {
    @Test(priority = 1)
    void add(){
        System.out.println("this is add");
    }
    @Test(priority = 2)
    void search(){
        System.out.println("this is search");
        Assert.assertEquals(1,2);
    }
}
