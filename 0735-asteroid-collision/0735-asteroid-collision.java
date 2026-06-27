class Solution {
    public int[] asteroidCollision(int[] asteroids) {
     Stack<Integer> s = new Stack<>();
    for(int i=0;i<asteroids.length;i++) {
    	if(s.isEmpty() || asteroids[i]>0) {
    		s.push(asteroids[i]);
    	}else { 
    		while(true) {
    		if(s.peek() < 0) {
    			s.push(asteroids[i]);
    			break;
    		}else if(s.peek() == -asteroids[i]) {
    			s.pop();
    			break;
    		}else if(s.peek() > -asteroids[i]) {
    			break;
    		}else {
    			s.pop();
    			if(s.isEmpty()) {
    				s.push(asteroids[i]);
    				break;
    			}
    		}
    	}
    }     
    }
    int res[] = new int[s.size()];
    for(int i=res.length-1;i>=0;i--){
        res[i] = s.pop();
    }
    return res;
}
}