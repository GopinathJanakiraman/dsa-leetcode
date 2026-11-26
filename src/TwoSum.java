import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {


            Integer needed = target - nums[i];
            if (m.containsKey(needed)) {
                return new int[]{m.get(needed), i};
            }
            m.put(nums[i], i);

        }
        return new int[]{};
    }

    public static int[] solutionTwoPointerIfSortedArray(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (target == sum) {
                return new int[]{left, right};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(TwoSum.solutionTwoPointerIfSortedArray(new int[]{2, 7, 11, 15}, 18)));

        System.out.println(Arrays.toString(TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
