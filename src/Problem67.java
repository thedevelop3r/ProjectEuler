import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem67
{

	/** path of resource file **/
	private static final String filePath = "./res/TrianglePath1.txt";

	/** triangle of numbers **/
	private static ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();

	/** Generic main Method **/
	public static void main(String[] args)
	{
		
		parseTriangle();	
		System.out.println(maxSum());
		triangle = new ArrayList<ArrayList<Integer>>();
	}

	/**
	 * The maxSum method gets the maximum path sum in the triangle of numbers.
	 * @return maximum sum
	 */
	public static int maxSum()
	{
		for (int i = triangle.size() - 2; i >= 0; i--)
		{
			for (int j = 0; j < triangle.get(i).size(); j++)
			{
				triangle.get(i).set(j,
						triangle.get(i).get(j) + Math.max(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1)));
			}
		}
		return triangle.get(0).get(0);
	}

	/**
	 * The parseTriangle method parses the triangle of numbers into a 2D
	 * ArrayList from a text file.
	 */
	public static void parseTriangle()
	{
		try
		{
			File file = new File(filePath);
			Scanner scanner = new Scanner(file);

			int line = 0;
			while (scanner.hasNextLine())
			{
				Scanner myLine = new Scanner(scanner.nextLine());
				triangle.add(new ArrayList<Integer>());
				while (myLine.hasNextInt())
				{
					triangle.get(line).add(myLine.nextInt());
				}
				line++;
				myLine.close();
			}
			scanner.close();
		}
		catch (IOException exception)
		{

		}
	}
}
