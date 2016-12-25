package week3.day2.unit_tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by gorobec on 25.12.16.
 */
@RunWith(JUnit4.class)
public class CodingBatTest {

    @Test
    public void test1(){
        int result = CodingBat.count7(717);
        int expected = 2;
        Assert.assertEquals(expected, result);

    }
    @Test
    public void test2(){
        int result = CodingBat.count7(7);
        Assert.assertEquals(1, result);
    }
    @Test
    public void test3(){
        Assert.assertEquals(0, CodingBat.count7(123));
    }
}
