package com.company;
import palindromePackage.Palindrome;

import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Palindrome pali = new Palindrome();
        Scanner obj = new Scanner(System.in);
        char[] palindrome = obj.nextLine().toCharArray();

        System.out.println(pali.isPalindrome(palindrome));

    }

}
