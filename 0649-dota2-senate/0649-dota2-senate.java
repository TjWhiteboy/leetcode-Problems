class Solution {
    public String predictPartyVictory(String senate) {
        	int n = senate.length();
	// create 2 queues 
	Queue<Integer> radiant = new LinkedList<>();
	Queue<Integer> dire = new LinkedList<>();
	//put all index of R to radiant and vice versa
	for(int i=0;i<senate.length();i++) {
		if(senate.charAt(i)=='R') {
			radiant.offer(i);
		}else {
			dire.offer(i);
		}
	}
	while(!radiant.isEmpty() && !dire.isEmpty()) {
		int r = radiant.poll();
		int d = dire.poll();
		if(r<d) {
			radiant.offer(r + n);
		}else {
			dire.offer(d + n);
		}	
	}
	return radiant.isEmpty()?"Dire":"Radiant";
    }
}