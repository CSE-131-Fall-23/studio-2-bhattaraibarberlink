package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much money do you start with?");
		double startAmount = in.nextDouble();
		
		System.out.println("What's the chance of winning today as a percent?");
		double winChance = in.nextDouble();
		
		System.out.println("What's your win limit?");
		double winLimit = in.nextDouble();
		
		System.out.println("How many days do you want to gamble?");
		int gambleDays = in.nextInt();
		
		
		
		for(int totalSimulations = 1; totalSimulations < gambleDays+1; totalSimulations++) 
		{
		
		double moneyCount = 0;
		int count = 0;
		int winCount = 0;
		int lossCount = 0;
		
		while(startAmount+moneyCount > 0 && startAmount+moneyCount < winLimit) 
		{
			
			if ( (Math.random()*101) <= winChance) 
			{
				moneyCount++;
				count++;
				winCount++;
			}
			else 
			{
				moneyCount--;
				count++;
				lossCount++;
			}
			
			System.out.println("You played "+count+" times on day: " + totalSimulations);
		}
		
		
		}

	}

}
