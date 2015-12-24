
public class Problem6
{
	public static void main(String[] args)
	{
		System.out.println(squared(100));
	}

	public static int squared(int n)
	 {
		 int sumOfSquares = 0;
	        for(int i = 1; i <= n; i++)
	        {
	            sumOfSquares += i * i;
	        }
	        
	        int squareOfSum = 0;
	        for(int i = 1; i <= n; i++)
	        {
	            squareOfSum += i;
	        }
	        squareOfSum *= squareOfSum;
	        
	        return squareOfSum - sumOfSquares;
	 }
}
