import java.util.*;
class Solution {
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for(int i = 1 ; i <= nums.length - 1;i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        for(int i = 0; i <= nums.length - 1; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(maxSubArray(nums));
    }
}