class Solution 
{
    public boolean checkInclusion(String s1, String s2)
    {
        s1=sort(s1);
        for(int i=0;i<=s2.length()-s1.length();i++)
        {
            String sub=s2.substring(i,i+s1.length());
            if( sort(sub).equals(s1))
            {
                return true;
            }
        }
        return false;
    }
    public static String sort(String s){
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}