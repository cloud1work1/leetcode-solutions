#9. Palindrome Number
public class Leetcode9 {
public boolean isPalindrome(int x) {
        String number= Integer.toString(x);
        String reverse=new StringBuilder(number).reverse().toString();
        return number.equals(reverse)?true:false;
    }
}
