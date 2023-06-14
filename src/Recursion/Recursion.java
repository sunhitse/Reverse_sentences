package Recursion;

import java.io.*;
 
public class Recursion {
    public static String reverse_sentence(String str)
    {
        // check if str is empty
        if (str.isEmpty())
            // return the string
            return str;
        else {
           
            // extract the character at 0th index, that is
            // the character at beginning
            char ch = str.charAt(0);
           
            // append character extracted at the end
            // and pass the remaining string to the function
            return reverse_sentence(str.substring(1)) + ch;
        }
    }
 
    public static void main(String[] args)
    {
        // specify the string to reverse
        String str = "Sunil Akuthota";
       
        // call the method to reverse sentence
        String rev_str = reverse_sentence(str);
       
        // print the reversed sentence
        System.out.println(
            "Sentence in reversed form is :  " + rev_str);
 
        // creating another string with numbers
        // and special characters
        String str2 = "Indian";
       
        String rev_str2 = reverse_sentence(str2);
       
        // print the reversed sentence
        System.out.println(
            "Sentence in reversed form is :  " + rev_str2);
    }
}