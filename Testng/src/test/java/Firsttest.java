import org.testng.annotations.Test;

public class Firsttest {
    @Test(priority = 1)
    void setup(){
        System.out.println("this is test setup");
    }
    @Test(priority = 2)
    void login(){
        System.out.println("this is login method");
    }
    @Test(priority = 3)
    void teardown(){
        System.out.println("closing the browser");
    }
}
