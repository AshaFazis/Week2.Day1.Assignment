package week2.day1.assignments;

public class ReverseEvenWords 
{

	public static void main(String[] args) 
	{
		String test = "I am a software tester"; //Declare the string
		String[] string = test.split(" "); //split the words and have it in an array
		for (int i = 0; i < string.length; i++) //Traverse through each word (using loop)
	     {
			if(i%2==1) //find the odd index within the loop (use mod operator)
			{
				char[] charArray = string[i].toCharArray(); //converting to char array to store each character
			    int length = charArray.length; //finding the length of the array
			    for (int j=length-1; j>=0; j--) //print the even position words in reverse order using another loop 
				{
					System.out.print(charArray[j]);
			
		        }
			    System.out.print(" ");
			}
		else
		{
			System.out.print(string[i] + " "); //Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		}
	 }
	     
  }
		
}
