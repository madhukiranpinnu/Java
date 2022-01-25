package Anotation;

import org.testng.annotations.*;

public class TC2 {
    @Test
    void Test3(){
        System.out.println("test3");
    }
    @Test
    void Test4(){
        System.out.println("test4");
    }
    @BeforeMethod
    void Before(){
        System.out.println("before method");
    }
    @AfterMethod
    void After(){
        System.out.println("after method");
    }
    @BeforeClass
    void Beforeclass(){
        System.out.println("Before Class");
    }
    @AfterClass
    void Afterclass(){
        System.out.println("After class");
    }
}
