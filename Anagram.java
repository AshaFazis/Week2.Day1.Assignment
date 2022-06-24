package week2.day1.assignments;

import java.util.Arrays;

public class Anagram 
{
   public static void main(String[] args) 
	{
	   String text1 = "stops"; //Declare a String 
	   String text2 = "potss"; //Declare another String
	   int length = text1.length(); //Finding the length of the string 1
	   int length2 = text2.length(); //Finding the length of the string 2
	   if(length==length2) // Check length of the strings are same then using if condition
	   {
		   System.out.println("length is same");
	   }
	   else
	   {
		   System.out.println("length is different");
	   }
       char[] charArray = text1.toCharArray(); //Convert String 1 in to characters
       char[] charArray2 = text2.toCharArray(); //Convert String 2 in to characters
       Arrays.sort(charArray); //Sort Both array 1
       System.out.println(charArray);
       Arrays.sort(charArray2);
       System.out.println(charArray2); //Sort Both array 2
       if(Arrays.equals(charArray, charArray2)) ////Sort Both array 1
       {
    	  System.out.println("It is Anagram");
       }
       else
       {
    	   System.out.println("It is Not Anagram");
       }
	}

}
