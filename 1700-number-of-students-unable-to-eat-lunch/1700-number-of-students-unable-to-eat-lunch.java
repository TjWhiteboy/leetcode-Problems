class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int freq[]=new int[2];
        for(int s:students){
            freq[s]++;
        }
        for(int s:sandwiches){
            if(freq[s]==0){
                break;
            }
            freq[s]--;
        }return freq[0]+freq[1];


    }
}