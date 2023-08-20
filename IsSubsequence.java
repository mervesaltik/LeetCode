/* Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * 
 * Example 1 : Input : s = "abc", t = "ahbgdc"
 * Output : true
 * 
 * Example 2 : Input : s = "axc", t = "ahbgdc"
 * Output : false*/

class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int i = 0 , j = 0 ;
        for(i = 0; i < t.length(); i++){
            if(s.charAt(j) == t.charAt(i)){
                j++;
            }
            if(j == s.length()) return true;

        }
        return false;
    }

}
