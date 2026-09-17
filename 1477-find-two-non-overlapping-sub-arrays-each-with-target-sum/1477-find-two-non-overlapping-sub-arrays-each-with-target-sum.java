class Solution {
    public int minSumOfLengths(int[] nums, int target) {
        int n = nums.length;
        if (n == 1) {
            return -1;
        }
        int i = 0, j = 0;
        int cur = 0;
        int res = Integer.MAX_VALUE;
        int bestlen = Integer.MAX_VALUE;
        int[] minlen = new int[n];
        while (j < n) {
            cur += nums[j];  
            while (i < j && cur > target) {
                cur -= nums[i];
                i++;        
            }
            if (cur == target) {
                int len = j - i + 1;
                if (i > 0 && minlen[i - 1] != Integer.MAX_VALUE) {
                    res = Math.min(res, len + minlen[i - 1]);
                }
                bestlen = Math.min(bestlen, len);
            }
            minlen[j] = bestlen;
            j++;
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}