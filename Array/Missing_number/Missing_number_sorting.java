import java.util.Arrays;

public int missingNumber(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    
    // Check for missing 0 at start
    if (nums[0] != 0) return 0;
    
    // Check for missing number in between
    for (int i = 1; i < n; i++) {
        if (nums[i] != nums[i - 1] + 1) {
            return nums[i - 1] + 1;
        }
    }
    
    // Missing number is n
    return n;
}
