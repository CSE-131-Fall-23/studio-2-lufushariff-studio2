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
		int day = 1;
		double ruins = 0;
		
		
		for (int i = totalSimulations ; i > 0 ; i-- )
		{
			int tempStartAmount = startAmount;
				
			while (tempStartAmount > 0 && tempStartAmount < winLimit)
			{
				int game = (int) (Math.random() * 100) + 1;
				
				if (game <= winChance * 100)
				{
					tempStartAmount++;
				} else
				{
					tempStartAmount--;
				}
					
				plays++;
				
				
			}		
			
			
			
			System.out.println("Simulation: " + day + " " + plays);

			
			if (tempStartAmount == 0)
			{
				System.out.println("ruin");
				ruins++;

			} else
			{
				System.out.println("success");
			}
			
			System.out.println();
			
			day++;
			plays = 0;
			tempStartAmount = startAmount;
		}

		System.out.println(ruins + " " + totalSimulations);
		System.out.println(ruins/totalSimulations);

	}

}
