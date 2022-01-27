package ListenersDemo;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListner implements ITestListener {
    public void onStart(ITestContext arg){
       System.out.println("start test execution"+arg.getName());
    }
    public void onFinish(ITestContext arg) {
        System.out.println("On Finish exeecution of tests"+arg.getName());
    }
    public void onTestSuccess(ITestResult arg){
        System.out.println("on test success"+arg.getName());
    }
    public void onTestSkipped(ITestResult arg) {
        System.out.println("on test skipped"+arg.getName());
    }
    public void onTestFailure(ITestResult arg) {
        System.out.println("on test failure"+arg.getName());
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg) {
        System.out.println("on test failure with percentage"+arg.getName());
    }
}
