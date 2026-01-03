import java.util.*;
class Solution {
    public int maxProduct(int[] nums) {
        int  maxHere = nums[0];
        int minHere = nums[0];
        int maxProduct = nums[0];

        for(int i = 1; i <= nums.length - 1; i++){

            if(nums[i] < 0) {
                //swap
                int temp = maxHere;
                maxHere = minHere;
                minHere = temp;
            }
            maxHere = Math.max(nums[i], maxHere * nums[i]);
            minHere = Math.min(nums[i], minHere * nums[i]);

            maxProduct = Math.max(maxHere, maxProduct);
        }
        return maxProduct;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        for(int i = 0; i <= nums.length-1; i++) {
            nums[i] = sc.nextInt();
        }

        Solution s = new Solution();
        System.out.println(s.maxProduct(nums));
    }
}