package MyTest1;

import org.testng.annotations.Test;

public class TestParameter {
    @Test(priority = 1)
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
