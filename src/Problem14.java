import java.util.HashMap;

public class Problem14
{
	
	private static HashMap<Long, Integer> lengths = new HashMap<Long, Integer>();

	public static void main(String[] args)
	{
		int maxLength = 0;
		int maxIndex = 1;
		for (long i = 1L; i < 1000000; i++)
		{
			if(series(i) >maxLength)
			{
				maxLength = series(i);
				maxIndex = (int) i;
			}
		}
		
		System.out.println(maxIndex + " : " + maxLength);
	}

	public static int series(long n)
	{
		long start = n;
		int count = 0;
		while (n != 1)
		{
			// return already computed value if possible
			if (n < start)
			{
				lengths.put(start, lengths.get(n) + count);

				return lengths.get(n) + count;
			}
			// run series for evens
			else if (n % 2 == 0)
			{
				n /= 2;
			}
			// run series for odds
			else
			{
				n *= 3;
				n++;
			}
			count++;
		}

		lengths.put(start, count);
		return count;
	}

}
