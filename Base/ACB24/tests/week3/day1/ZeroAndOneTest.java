package week3.day1;

import com.sun.org.apache.xpath.internal.functions.WrongNumberArgsException;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class ZeroAndOneTest {


    @Test
    public void findLongestZeroLineTest() throws WrongNumberArgsException {
        String line = "10001101001";
        int[] array = ZeroAndOne.findLongestZeroLine(line);

        Assert.assertTrue(array.length == 2);
        Assert.assertEquals(array[0], 2);
        Assert.assertEquals(array[1], 4);

    }
    @Test
    public void findLongestZeroLineTest2() throws WrongNumberArgsException {
        String line = "1000110100001";
        int[] array = ZeroAndOne.findLongestZeroLine(line);

        Assert.assertTrue(array.length == 2);
        Assert.assertEquals(array[0], 9);
        Assert.assertEquals(array[1], 12);

    }

    @Test
    public void findLongestOneLineTest() throws WrongNumberArgsException {
        String line = "10001101001";
        int[] array = ZeroAndOne.findLongestOneLine(line);

        Assert.assertTrue(array.length == 2);
        Assert.assertEquals(array[0], 5);
        Assert.assertEquals(array[1], 6);

    }

    @Test (expected = WrongNumberArgsException.class)
    public void findLongestZeroLineNullArgumentTest() throws WrongNumberArgsException {
        ZeroAndOne.findLongestZeroLine(null);

    }

    @Test
    public void findLongestZeroLineEmptyArgumentTest() throws WrongNumberArgsException {
        String line = "";
        int[] array = ZeroAndOne.findLongestZeroLine(line);

        Assert.assertTrue(array.length == 2);
        Assert.assertEquals(array[0], 0);
        Assert.assertEquals(array[1], 0);

    }

    @Test
    public void findLongestOneLineEmptyArgumentTest() throws WrongNumberArgsException {
        String line = "";
        int[] array = ZeroAndOne.findLongestOneLine(line);

        Assert.assertTrue(array.length == 2);
        Assert.assertEquals(array[0], 0);
        Assert.assertEquals(array[1], 0);

    }
}
