
public class Problem15
{

	private static int size = 3;
	private static int paths = 0;

	public static void main(String[] args)
	{
		explore(0, 0);
		System.out.println(paths);
	}

	// brute force recursive solution
	public static void explore(int row, int col)
	{
		// base case: lower right corner
		if (row == size && col == size)
		{
			paths++;
		}
		else if (row == size)
		{
			explore(row, col + 1);
		}
		else if (col == size)
		{
			explore(row + 1, col);
		}
		else
		{
			explore(row + 1, col);
			explore(row, col + 1);
		}
	}
}
