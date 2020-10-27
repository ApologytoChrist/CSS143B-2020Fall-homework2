public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:
    We want to place all the 0's if front of the 1's and we do this by designating a variable for the "front" or where
    the 0's should go. We do the same for the 2's but they go at the end and get their own variable at the "end".
    As we go along, we want to crunch the ranges of the front and end until there's nothing left.
     */

    private static int front, middle, end;

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        if (nums != null) {
            front = 0;
            middle = 0;
            end = nums.length - 1;
            int tempNumber;

            int i = 0;
            int j = end;

            /* https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
            I used the ideas from the link for the sorting bit, I got stuck trying to figure out the way to only do it
             with one pass */
            while (i <= j && middle <= end) {
                int number = nums[i];

                if (number == 0) {
                    tempNumber = nums[front];
                    nums[front] = number;
                    nums[i] = tempNumber;
                    i++;
                    front++;
                    middle++;
                } else if (number == 1) {
                    middle++;
                    i++;
                } else if (number == 2) {
                    tempNumber = nums[end];
                    nums[end] = number;
                    nums[i] = tempNumber;
                    j--;
                    i++;
                    end--;
                }
            }
        }
    }
}
