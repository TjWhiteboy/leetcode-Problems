class Solution {
    public int equalPairs(int[][] grid) {
    int n = grid.length;
    HashMap<String, Integer> map  = new HashMap<>();
    //rows
    for(int i=0;i<n;i++) {
    	StringBuilder row = new StringBuilder();//mt
    	for(int j=0;j<n;j++) {
    		row.append(grid[i][j]).append(",");
    	}
    	String key = row.toString();
    	map.put(key, map.getOrDefault(key,0)+1);
    }
    //cols
    int count = 0;
    for(int j=0;j<n;j++) {
    	StringBuilder col = new StringBuilder();//mt
    	for(int i=0;i<n;i++) {
    		col.append(grid[i][j]).append(",");
    	}

    	if(map.containsKey(col.toString())) {
    		count += map.get(col.toString());
    	}
    }
    return count;      
    }
}