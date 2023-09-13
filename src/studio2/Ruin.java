package studio2;

import java.util.Scanner;

public class Ruin
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int startAmount = in.nextInt();
		double winChance = in.nextDouble();
		int winLimit = in.nextInt();
		int totalSimulations = in.nextInt();
		int plays = 0;
	
		
		
		for (int i = totalSimulations ; i > 0 ; i-- )
		{
			int tempStartAmount = startAmount;
		
			boolean result = false;
			int day = 1;
		
			
			while (tempStartAmount > 0 && tempStartAmount < winLimit)
			{
				int game = (int) (Math.random() * 100) + 1;
				plays = 0;
				
				if (game <= winChance * 100)
				{
					startAmount++;
				} else
				{
					startAmount--;
				}
					
				plays++;
				
				
			}
			
			
			
			tempStartAmount = startAmount;
			System.out.println("Simulation day: " + day );
			System.out.println("Plays: " + plays );
			
			if (tempStartAmount == 0)
			{
				System.out.println("ruin");

			} else
			{
				System.out.println("success");
			}
			
			day++;
		}

		

	}

}
