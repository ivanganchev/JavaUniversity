package palindromePackage;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    private List<Character> tempStr = new ArrayList<Character>();
    private List<Character> trimmedStr = new ArrayList<Character>();

    public boolean isPalindrome(char[] palindrome){

        for(int i  = 0; i < palindrome.length; i++){
            if(palindrome[i] != ' '){
                trimmedStr.add(palindrome[i]);
            }
        }

        for(int i = 0; i <  trimmedStr.size(); i++) {
            tempStr.add(trimmedStr.get(trimmedStr.size()-i-1));
        }

        return tempStr.equals(trimmedStr);
    }
}
