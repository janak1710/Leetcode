public class Solution {
    public int myAtoi(String str) {
        if(str == null)
            return 0;
        str = str.trim();
        if(str.length() == 0)
            return 0;
            
        int result = 0;
        int startIdx = 0;
        int sign = 1;
        if(str.charAt(0) == '-'){
            sign = -1;
            startIdx++;
        } else if(str.charAt(0) == '+'){
            startIdx++;
        }
        for(int i = startIdx; i<str.length(); i++){
            int n = str.charAt(i) - '0';
            if(n>9 || n<0)
                break;
            if(result > Integer.MAX_VALUE / 10 || (Integer.MAX_VALUE/10 == result && Integer.MAX_VALUE%10 < n))
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        
            result = result*10 + n;
        }
        return sign*result;
        
    }
}