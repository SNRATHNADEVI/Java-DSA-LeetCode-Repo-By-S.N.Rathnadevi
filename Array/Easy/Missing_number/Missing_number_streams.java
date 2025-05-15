import java.util.stream.IntStream;

public int missingNumber(int[] nums) {
    int n = nums.length;
    int expected = n * (n + 1) / 2;
    int actual = IntStream.of(nums).sum();
    return expected - actual;
}
