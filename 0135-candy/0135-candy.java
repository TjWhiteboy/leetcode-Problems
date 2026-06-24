class Solution {
    public int candy(int[] arr) {
    int n = arr.length;
    int i = 1;
	int sum = 1;
	while(i<n) {
		//same rating
		if(arr[i] == arr[i-1]) {
			sum += 1;
			i++;
			continue;//skip
		}
		//up slope
		int up = 1;
		while(i<n && arr[i]>arr[i-1]) {
			up += 1;
			sum += up;
			i++;
		}
		//down slope
		int down = 1;
		while(i<n && arr[i]<arr[i-1]) {
			sum += down;
			i++;
			down++;
		}
		//peak confusion
		if(down > up) {
			sum += down - up;
		}
	}
	return sum;
	}  
    }