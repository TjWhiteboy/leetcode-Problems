class Solution {
    public int trap(int[] height) {
    int l = 0 ;
	int r = height.length-1;
	int leftmax = 0;
	int rightmax = 0;
	int water = 0;
	while(l<r) {
		if(height[l]<height[r]) {
			leftmax = Math.max(leftmax, height[l]);
			water += leftmax - height[l];
			l++;
		}else {
			rightmax = Math.max(rightmax, height[r]);
			water += rightmax - height[r];
			r--;
		}
	}
	return water;  
    }
}