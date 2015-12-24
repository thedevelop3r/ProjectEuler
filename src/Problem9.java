
public class Problem9
{
	public static void main(String[] args)
	{
		int[] triplet = pythagoreanTriplet(1000);
		
//		String output = "[";
//		for(int element : triplet)
//		{
//			output += element + ",";
//		}
//		System.out.println(output.substring(0,output.length()-1) + "]");
		
		int product = 1;
		for(int element : triplet)
		{
			product *= element;
		}
		System.out.println(product);
	}
	
	public static int[] pythagoreanTriplet(int mySum)
	{
		for(int a = 1; a < mySum; a++)
		{
			for(int b = 1; b < mySum; b++)
			{
				int c = mySum - a - b;
				if(a*a + b*b == c*c)
				{
					return new int[]{a, b, c};
				}
			}
		}
		return new int[]{};
	}
}
