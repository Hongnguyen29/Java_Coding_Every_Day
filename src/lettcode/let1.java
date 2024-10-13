package lettcode;

public class let1 {
    public int solution2(int[] nums) {
        int max = Integer.MAX_VALUE;
        for (int i : nums) {
            if (Math.abs(i) < Math.abs(max) || i == Math.abs(max)) {
                max = i;
            }
        }
        return max;
    }
}
