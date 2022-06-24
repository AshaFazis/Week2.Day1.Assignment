package week2.day1.assignments;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		String str = "malayalam"; 
	    String reverse = "";                      //Declare another String rev value as ""
	    int length = str.length();                //Declare another String rev value as ""
	    for (int i=length-1;i>= 0; i--)           //Iterate over the String in reverse order
	    {
			char charAt = str.charAt(i);
			System.out.print(charAt);
			reverse=reverse+str.charAt(i);        //Add the char into rev
	    }
	    
	    System.out.println("");
		System.out.println("Original string:"+str);
		System.out.println("Reverse string:"+reverse);
		if(str.equals(reverse))                   //Compare the original String with the reversed String, if it is same then print palinDrome 
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
   }


}







