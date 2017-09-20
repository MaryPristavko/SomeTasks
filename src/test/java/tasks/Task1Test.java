package tasks;

import exception.NaturalException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task1Test {

    private Task1 task1;
    @Before
    public void init(){
        task1 = new Task1();
    }

    @Test
    public void test() throws Exception {
        Assert.assertTrue(task1.solve(1));
        Assert.assertFalse(task1.solve(99));
        Assert.assertFalse(task1.solve(123456789));
        Assert.assertFalse(task1.solve(902473649778L));
        Assert.assertTrue(task1.solve(27));

    }

    @Test(expected = NaturalException.class)
    public void testException()throws Exception {
        task1.solve(0);
    }
}
