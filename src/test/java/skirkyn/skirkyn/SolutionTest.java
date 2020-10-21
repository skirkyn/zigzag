package skirkyn.skirkyn;

import org.junit.Assert;
import org.junit.Test;
import skirkyn.Solution;

import java.util.Arrays;

public class SolutionTest {

    @Test
    public void shouldCalculateRight() {
        Solution s = new Solution();
        Assert.assertTrue(Arrays.deepEquals(new Integer[]{1, 3, 4, 14}, s.pathInZigZagTree(14).toArray()));
        Assert.assertTrue(Arrays.deepEquals(new Integer[]{1, 2, 6, 10, 26}, s.pathInZigZagTree(26).toArray()));
        Assert.assertTrue(Arrays.deepEquals(new Integer[]{1, 3, 5, 13, 21, 52, 87, 208, 351, 833, 1405, 3333}, s.pathInZigZagTree(3333).toArray()));

    }
}
