package MyTest1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsONMethod {
    @Test(dependsOnMethods = "test2")
    public void test1()
    {
        System.out.println("My Test 1");
    }
    @Test
    public void test2()
    {
        System.out.println("My Test 2");
    }
}
