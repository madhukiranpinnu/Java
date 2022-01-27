import org.testng.annotations.Test;

public class GroupingTests {
    @Test(groups = {"smoke"})
    void Testone(){
        System.out.println("Test-1");
    }
    @Test(groups = {"sanity"})
    void Testtwo(){
        System.out.println("Test-2");
    }
    @Test(groups = {"regression"})
    void Testthree(){
        System.out.println("Test-3");
    }
    @Test(groups = {"sanity","smoke"})
    void Testfour(){
        System.out.println("Test-4");
    }
    @Test(groups = {"smoke","regression"})
    void Testfive(){
        System.out.println("Test-5");
    }
}
