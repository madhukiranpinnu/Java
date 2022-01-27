package ListenersDemo;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(ListenersDemo.CustomListner.class)
public class Listentest1 {
    @Test
    void Test1(){
        System.out.println("Test-1");
        Assert.assertEquals("a","a");
    }
    @Test
    void Test2(){
        System.out.println("Test-2");
        Assert.assertEquals("a","D");
    }
    @Test
    void Test3(){
        System.out.println("Test-3");
        throw new SkipException("skipping test3");
    }
}
