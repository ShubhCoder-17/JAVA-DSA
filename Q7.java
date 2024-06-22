public class Q7 {
    public int numberOfSubArrays(int[] nums, int k ){
        int n = nums.length;
        int [] cnt = new int [n+1];
        cnt [0] = 1;
        int ans = 0, t=0;
        for (int v : nums){
            t += v & 1;
            if (t -k >= 0){
                ans += cnt [t - k];
            }
            cnt [t]++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Q7 solution = new Q7();
        int [] nums = {1, 1, 2, 1, 1};
        int k = 3;
        int result = solution.numberOfSubArrays(nums, k);
        System.out.println(result);

        // Additional test cases
        int[] nums2 = {2, 4, 6};
        k = 1;
        System.out.println(solution.numberOfSubArrays(nums2, k));  // Output should be 0

        int[] nums3 = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
        k = 2;
        System.out.println(solution.numberOfSubArrays(nums3, k));  // Output should be 16
    }
    
}
