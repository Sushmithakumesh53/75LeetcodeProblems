import java.util.*;
class Solution {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int Product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int Product2 = nums[0] * nums[1] * nums[n - 1];
        
        return Math.max(Product1, Product2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[sc.nextInt()];
        for(int i = 0 ; i <= nums.length - 1; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(maximumProduct(nums));
    }
}