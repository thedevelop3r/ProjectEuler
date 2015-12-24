import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Problem13
{

	private static int[][] values;
	private static String filePath = "./res/Problem13.txt";
	private static String sum = "";
	
	public static void main(String[] args)
	{
		parseValues();
		
		int carry = 0;
		for(int c = values[0].length - 1; c >= 0; c--)
		{
			carry = getColCarryOut(c, carry);
		}
		
		System.out.println(("" + carry + sum).substring(0, 10));
	}
	
	public static int getColCarryOut(int col, int value)
	{
		int colSum = value;
		for(int r = 0; r < values.length; r++)
		{
			colSum += values[r][col];
		}
		sum = "" + new Integer(colSum % 10) + sum;
		return colSum/10;
	}

	@SuppressWarnings("resource")
	public static void parseValues()
	{
		try
		{
			File file = new File(filePath);
			Scanner scanner = new Scanner(file);
			
			//get size of array
			int size = 0;
			while(scanner.hasNextLine())
			{
				scanner.nextLine();
				size++;
			}
			
			values = new int[size][size/2];
			
			int row = 0;
			int col = 0;
			scanner = new Scanner(file);
			while (scanner.hasNextLine())
			{
				Scanner line = new Scanner(scanner.nextLine()).useDelimiter("");
				
				while(line.hasNext())
				{
					values[row][col] = line.nextInt();
					col++;
				}
				line.close();
				col = 0;
				row++;
			}
			scanner.close();
		}
		catch (IOException e)
		{
			// pass
		}
	}

}
