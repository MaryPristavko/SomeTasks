package tasks;

import exception.NaturalException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task2Tests {

    private Task2 task2;

    @Before
    public void init() {
        task2 = new Task2();
    }

    @Test
    public void testSolving() {
        Assert.assertEquals(2, task2.solve(1, 2));
        Assert.assertEquals(18, task2.solve(6, 9));
        Assert.assertEquals(1600, task2.solve(25, 64));
        Assert.assertEquals(1600, task2.solve(-25, 64));
        Assert.assertEquals(1600, task2.solve(64, 25));
        Assert.assertEquals(1169618312452375L, task2.solve(2115517, -552875875));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testException() {
        task2.solve(0, 0);
    }
}
