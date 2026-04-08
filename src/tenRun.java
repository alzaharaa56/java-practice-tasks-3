public class tenRun {
    public static int[] tenRun(int[] nums) {
boolean hasTen = false;
int currentTen = 0;
for(int i = 0; i < nums.length; i++) {
if (nums[i] % 10 == 0) {
hasTen = true;
currentTen = nums[i];
} else if (hasTen) {
nums[i] = currentTen;
}
}
return nums;
    }
}
