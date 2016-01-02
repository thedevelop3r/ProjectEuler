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
		
		// find fibonacci number under the maximum value
		for(int value = m + n; value < maxValue; value = m + n)
		{
			n = m;
			m = value;
			// if it's even add it to the sum
			if(value % 2 == 0)
			{
				sum += value;
			}
		}
		return sum;
	}
}
