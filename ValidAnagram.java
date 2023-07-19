
/* Example 1 : Your input : s = "rat" , t = "cat"
 * Output : false
 * 
 *
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * 
 * 
 * An Anagram is a word or phrase formed by rearranging the letters
 * of a different word or phrase, typically using all the original letters exactly once. */

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int [] counts = new int[26];

        for(int i=0 ; i < s.length() ; i++) {
            counts[s.charAt(i)-'a']++;
            counts[t.charAt(i)-'a']--;
        }

        for(int i : counts){
            if( i != 0 ){
                return false; /* We increment each letter we see in the s string once.
                We decrease it in the t string once. That's why, 'i' must be 0. */
            }
        }
        return true;
           
    }

}
