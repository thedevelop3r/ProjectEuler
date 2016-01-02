public class Problem1
{
	public static void main(String[] args) {
        int n = 3;
        int m = 5;
        int max = 1000;
        
        //get natural numbers that are divisible by n or m
        int sum = 0;
        for(int i = 1; i < max; i++)
        {
            if((i % n == 0) || (i % m == 0))
            {
                sum += i;
            }
        }
        
        //print to user
        System.out.println(sum);
    }
}
