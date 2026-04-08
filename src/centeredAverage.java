public class centeredAverage {
    public static int centeredAverage(int[] nums) {
int min = nums[0];
int max = nums[0];
int sum = 0;
for (int n : nums) {
if (n < min) min = n;
if (n > max) max = n;
sum += n;
}

return (sum - min - max) / (nums.length - 2);
    }

}
