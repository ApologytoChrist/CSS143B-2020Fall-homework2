import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem2Test {
    @Test
    public void testRemoveDuplicates() {
        int[][] inputs = {
                // DO NOT REMOVE OR CHANGE THE GIVEN TEST CASES!
                {0, 0, 1, 1, 1, 2, 2, 4, 4, 6},
                // add more test cases
                {0, 0, 0, 0, 0, 0},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 1, 1, 1, 1, 2, 4, 5, 8, 8, 8, 8, 8, 8, 9, 9, 9},
                {-2, -2, -1, -1, -1 ,3, 6, 6, 6, 6, 6, 9, 9, 12, 100, 100,100,100,100,100,100,100,100,100,154,154,154,154,154},
                {7, 7, 7, 7, 14, 14, 41, 41, 41,41, 99, 99}
        };

        int[][] expects = {
                {0, 1, 2, 4, 6},
                // add more test cases
                {0},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {0, 1, 2, 4, 5, 8, 9},
                {-2, -1, 3, 6, 9, 12, 100,154},
                {7, 14, 41, 99}
        };

        assertEquals(expects.length, inputs.length);

        for (int i = 0; i < inputs.length; i++) {
            int actualLength = Problem2.remove(inputs[i]);
            String caseId = "case " + i;
            assertEquals(caseId + " output length FAILED", expects[i].length, actualLength);
            for (int j = 0; j < actualLength; j++) {
                assertEquals(caseId + " element comparison FAILED", expects[i][j], inputs[i][j]);
            }
        }
    }
}
