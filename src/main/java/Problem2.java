public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        int number;
        int prevNumber;
        int difNumIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            number = nums[i];
            prevNumber = nums[i-1];

            if (number != prevNumber) {
                nums[difNumIndex] = number;
                difNumIndex++;
            }
        }
        for (int i = difNumIndex; i < nums.length; i++) {
            nums[i] = 0;
        }

        return difNumIndex; // place holder
    }
}
