package Anotation;

import org.testng.annotations.*;

public class Tc1 {
    @Test
    void Test1(){
        System.out.println("test1");
    }
    @Test
    void Test2(){
        System.out.println("test2");
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
    @BeforeTest
    void Beforetest(){
        System.out.println("Before Test");
    }
    @AfterTest
    void AfterTest(){
        System.out.println("After test");
    }
    @BeforeSuite
    void BeforeSuite(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    void AfterSuite(){
        System.out.println("After Suite");
    }
}
