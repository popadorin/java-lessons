package practice;

import lesson12.Main;
import org.junit.Assert;
import org.junit.Test;


public class MainTest {
    @Test
    public void test1() {
        int[] result = Main.getOddNumbers(3, 6);
        int[] expectedResult = {3, 5};
        Assert.assertArrayEquals(expectedResult,result);
    }
}
