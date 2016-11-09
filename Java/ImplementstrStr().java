public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null)    
            return 0;
 
        if(needle.length() == 0)
            return 0;
        
        for(int i = 0; i<haystack.length(); i++){
            if(i + needle.length() > haystack.length())
                return -1;
            if(matchString(haystack, needle, i))
                return i;
        }
        return -1;
        
    }
    
    private boolean matchString(String haystack, String needle, int idx){
        for(int j = 0; j<needle.length(); j++){
            if(needle.charAt(j) == haystack.charAt(idx))
                idx++;
            else
                return false;
        }    
        return true;
    }
}