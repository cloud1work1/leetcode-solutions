public class Leetcode205 {

   public boolean isIsomorphic(String s, String t) {
        if(s.length()==0 || t.length()==0) {
          return false;
        }
        if(s.length()!=t.length()) {
          return false;
        }
        
        Map<Character, Character> charMap = new LinkedHashMap<>();
        Map<Character, Character> revCharMap = new LinkedHashMap<>();
        
        for(int i=0; i<s.length();i++) {
          char s1= s.charAt(i);
          char t1=t.charAt(i);
          
          if(!charMap.containsKey(s1) && !revCharMap.containsKey(t1)) {
            charMap.put(s1,t1);
            revCharMap.put(t1,s1);
          } else {
            if(charMap.containsKey(s1) && charMap.get(s1) !=t1) {
              return false;
            }
            if(revCharMap.containsKey(t1) && revCharMap.get(t1)!=s1) {
              return false;
            }
          }
        }
        return true;
    }

}
