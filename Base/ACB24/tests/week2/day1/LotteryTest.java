package week2.day1;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class LotteryTest {

    @Test
    public void generateRandomNumbersSuccessfulTest(){
        int size = 6;
        int min = 1;
        int max = 42;
        int[] result = Lottery.generateRandomNumbers(size, min, max);

        Assert.assertEquals(size, result.length);


        Assert.assertTrue(size == result.length);
    }

    @Ignore ("todo LATER")
    @Test (expected = NegativeArraySizeException.class)
    public void generateRandomNumbersWrongSizeTest(){
        int size = -1;
        int min = 1;
        int max = 42;
        Lottery.generateRandomNumbers(size, min, max);


    }
}
