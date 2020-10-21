package skirkyn;

import java.util.ArrayList;
import java.util.List;

/*
*The runtime complexity of the algorithm is O(log(n))
*1. First we measure the height of the tree by taking the log with base 2 of the label
*2. Then we repeat height - 1 iterations, and for each iteration we calculate the position of the parent element
*    based on the current value starting from the original label
*3. We are using a different approach for the actual number calculation depending on if the row is odd or even numbered.
*4. Then assigning the resulting number to the the 'rest' variable and add it to the resulting list.
*
* The number of the operations in each iteration is a constant, since we iterate log(n) times, we  are getting O(log(n)) complexity
*/
public class Solution {

    private static final int TWO = 2;

    public List<Integer> pathInZigZagTree(int label) {
        int level = (int) (Math.log(label) / Math.log(TWO));
        List<Integer> result = new ArrayList<>(level + 1);
        result.add(label);
        int counter = level;
        int rest = label;
        while (counter > 0) {
            int currentLevel = (int) Math.pow(TWO, counter);
            int current = rest - currentLevel;
            int parentIndex = current / TWO;
            if (counter % TWO != 0) {
                rest = currentLevel - 1 - parentIndex;
            } else {
                int previousLevel = (int) Math.pow(TWO, counter - 1);
                rest = TWO * previousLevel - 1 - parentIndex;
            }
            result.add(0, rest);
            counter--;

        }

        return result;

    }
}
