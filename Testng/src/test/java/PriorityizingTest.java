import org.testng.annotations.Test;

public class PriorityizingTest {
    @Test(priority = 1)
    void Testone(){
        System.out.println("Test-1");
    }
    @Test(priority = 2)
    void Testtwo(){
        System.out.println("Test-2");
    }
    @Test(priority = 3)
    void Testthree(){
        System.out.println("Test-3");
    }
    @Test(priority = 4)
    void Testfour(){
        System.out.println("Test-4");
    }
}
