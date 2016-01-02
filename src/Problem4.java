public class Problem4
{

	/**
	 * Generic main method
	 * @param args Command Line Arguments
	 */
	public static void main(String[] args)
	{
		System.out.println(largestPalindrome(3));
	}

	/**
	 * The largesPalindrome method finds the largest palindromic integer for the
	 * product of two integers each with the specified number of digits.
	 * @param myNumberDigits Number of digits in products
	 * @return Largest palindromic number
	 */
	public static int largestPalindrome(int myNumberDigits)
	{
		int min;
		int max = 10;

		// get caps for min and max values
		for (int i = 1; i < myNumberDigits; i++)
		{
			max *= 10;
		}
		min = max / 10;

		// iterate backwards through all possibilities until a palindromic
		// number is found
		int palindrome = -1;
		for(int i = max - 1; i > min; i--)
		{
			for(int j = i; j > min; j--)
			{
				if ((new Integer(i * j).toString())
						.equals(reverseChars(new Integer(i * j).toString())) && i * j > palindrome)
				{
					palindrome = i * j;
				}
			}
		}


		// return -1 if not found
		return palindrome;
	}

	/**
	 * The reverseChar method reverses the characters of the String attached to
	 * the ProcessString object.
	 * @return Characters in reverse order
	 */
	public static String reverseChars(String string)
	{
		String myNewString = "";
		for (int i = string.length() - 1; i >= 0; i--)
		{
			myNewString += string.charAt(i);
		}
		return myNewString;
	}

}
