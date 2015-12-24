import java.io.*;
import java.util.*;

public class Problem11
{

	private static int[][] grid;

	private static String filePath = "./res/Problem11.txt";

	public static void main(String[] args)
	{
		parseGrid();
		
		int maxProduct = 1;
		for (int i = 0; i < grid.length; i++)
		{
			for (int j = 0; j < grid.length; j++)
			{
				maxProduct = Math.max(getMaxProduct(i, j), maxProduct);
			}
		}
		
		System.out.println(maxProduct);
	}

	public static int getMaxProduct(int myRow, int myColumn)
	{
		int product1 = 1;
		int product2 = 1;
		int product3 = 1;
		int product4 = 1;

		int i = 0;
		int j = 0;

		while (i < 4)
		{
			// down diagonal
			if (myRow + 4 < grid.length && myColumn + 4 < grid.length)
			{
				product3 *= grid[myRow + i][myColumn + j];
			}
			// up diagonal
			if (myRow - 4 > 0 && myColumn + 4 < grid.length)
			{
				product4 *= grid[myRow - i][myColumn + j];
			}
			// down
			if (myRow + 4 < grid.length)
			{
				product1 *= grid[myRow + i][myColumn];
			}
			i++;
			// across
			if (myColumn + 4 < grid.length)
			{
				product2 *= grid[myRow][myColumn + j];
			}
			j++;
		}

		return Math.max(Math.max(product1, product2), Math.max(product3, product4));
	}

	@SuppressWarnings("resource")
	public static void parseGrid()
	{
		try
		{
			File file = new File(filePath);
			Scanner scanner = new Scanner(file).useDelimiter(" ");

			int size = 1;
			while (scanner.hasNextInt())
			{
				size++;
				scanner.next();
			}
			grid = new int[size][size];

			scanner = new Scanner(file).useDelimiter("[ \n]");
			for (int i = 0; i < size; i++)
			{
				for (int j = 0; j < size; j++)
				{
					grid[i][j] = scanner.nextInt();
				}
			}
			scanner.close();
		}
		catch (IOException e)
		{

		}
	}
}
