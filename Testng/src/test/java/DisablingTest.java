import org.testng.annotations.Test;

public class DisablingTest {
    @Test(priority = 1)
    void Testone(){
        System.out.println("Test-1");
    }
    @Test(priority = 2)
    void Testtwo(){
        System.out.println("Test-2");
    }
    @Test(priority = 3,enabled = false)
    void Testthree(){
        System.out.println("Test-3");
    }
    @Test(priority = 4)
    void Testfour(){
        System.out.println("Test-4");
    }
}
