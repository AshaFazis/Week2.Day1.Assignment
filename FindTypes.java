package week2.day1.assignments;

public class FindTypes 
{

	public static void main(String[] args) 
	{
		
		String test = "$$ Welcome to 2nd Class of Automation $$ "; // Here is the input
		int  letter = 0, space = 0, num = 0, specialChar = 0; // Here is what the count you need to find
		char[] array = test.toCharArray(); //Convert the String to character array
		for (int i= 0; i < array.length; i++) //Traverse through each character (using loop)
		{
		
			if(Character.isLetter(array[i])) //Find if the given character is what type using if, else if statements
			{
				 
				letter++; //incrementing to find all letters present in string
					
		    }
		    else if(Character.isDigit(array[i]))
			{
			 
			    num++; //incrementing to find all numbers present in string
				
	        }
		    else if(Character.isSpaceChar(array[i]))
		    {
		    	space++; //incrementing to find all spaces present in string
		    }
		    else 
		    {
		    	specialChar++; //incrementing to find all special characters present in string
		    }
			
		}
		System.out.println("letter: " + letter);
		System.out.println("number: " + num);
		System.out.println("space: " + space);
		System.out.println("specialCharcter: " + specialChar);
	}
	
}		
	


