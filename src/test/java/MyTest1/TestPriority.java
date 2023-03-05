package MyTest1;

import org.testng.annotations.Test;

public class TestPriority {
    @Test(priority = 1)
    public void test1()
    {
        System.out.println("My Test 1");
    }
    @Test(priority = 0)
    public void test2()
    {
        System.out.println("My Test 2");
    }
}
