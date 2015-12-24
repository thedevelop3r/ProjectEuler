/**
 * Sum of even fibonacci numbers under 4,000,000.
 * @author robbie
 *
 */
public class Problem2
{
	public static void main(String[] args)
	{
		System.out.println(sumEvenFibonacciNumbers(4000000));
	}
	
	public static int sumEvenFibonacciNumbers(int maxValue)
	{
		int n = 0;
		int m = 1;
		
		int sum = 0;
		for(int value = m + n; value < maxValue; value = m + n)
		{
			n = m;
			m = value;
			if(value % 2 == 0)
			{
				sum += value;
			}
		}
		return sum;
	}
}
