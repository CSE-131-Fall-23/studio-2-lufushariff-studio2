package studio2;

public class Pi
{

	public static void main(String[] args)
	{
		double dartX = Math.random();
		double dartY = Math.random();
		int inside = 0;

		for (int i = 0; i < 100; i++)
		{
			if ( (Math.pow(dartX, 2) + Math.pow(dartY, 2)) <= 1)
			{
				inside++;
			}
		}

		System.out.println(inside/400.0);
		
	}

}
