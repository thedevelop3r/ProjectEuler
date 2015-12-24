
public class Problem12
{
	/**
	 * Generic Main Method
	 * @param args Command Line Arguments
	 */
	public static void main(String[] args)
	{
		int n = 1;
		int i = 2;
		int divisors = 0;
		while (divisors < 501)
		{
			n = n + i;

			divisors = 0;
			for (int k = 1; k < Math.sqrt(n); k++)
			{
				if (n % k == 0)
				{
					divisors += 2;
				}
			}
			i++;
		}
		System.out.println(n);
	}
}
