import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
    @Test
    void StartCar(){
        System.out.println("starting car");
        Assert.fail();
    }
    @Test(dependsOnMethods = {"StartCar"},alwaysRun = true)
    void Driving(){
        System.out.println("Driving the car");
    }
    @Test(dependsOnMethods = {"Driving"})
    void Parkcar(){
        System.out.println("parking car");
    }
    @Test(dependsOnMethods = {"Parkcar","Driving"})
    void Stopcar(){
        System.out.println("stop the car");
    }
}
