package week2.day2;

import org.junit.*;

/**
 * Created by gorobec on 16.10.16.
 */
public class MyArrayListTest {

    private MyArrayList myArrayList;

    @Before
    public void init(){
        myArrayList = new MyArrayList();
        System.out.println("Before");

    }
    @After
    public void tearDown(){
        myArrayList = null;
        System.out.println("After");

    }

    @Test
    public void testMyArrayListAdd(){
        System.out.println("Test1");

        boolean actual = myArrayList.add("1");

        Assert.assertTrue(actual);
    }

    @Test
    public void testMyArrayListAddTwoElements(){
        System.out.println("Test2");


        myArrayList.add("1");
        myArrayList.add("2");

        Assert.assertEquals(2, myArrayList.size());
        Assert.assertEquals("1", myArrayList.get(0));
        Assert.assertEquals("2", myArrayList.get(1));
    }
    @Test
    public void testMyArrayListSizeAfterAdd(){

        System.out.println("Test3");


        myArrayList.add("1");


        Assert.assertEquals("Some description",1, myArrayList.size());

    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testMyArrayListSizeAfterAddMoreThenCapacity(){

        System.out.println("Test4");


        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");



    }


}
