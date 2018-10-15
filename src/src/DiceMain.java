/**
 * 
 * @author dhan19
 *
 */
import java.util.Scanner;

public class DiceMain
{
	
			public static void main(String[] args)
			{
				NewDice die1 = new NewDice();
				NewDice die2 = new NewDice();
				int roll1 = die1.roll();
				int roll2 = die2.roll();
				System.out.println("die1: " + roll1 + "\tdie2: " + roll2);
				int counter = 1;
				
				while (roll1 != roll2)
				{
				    roll1 = die1.roll();
					roll2 = die2.roll();
					System.out.println("die1: " + roll1 + "\tdie2: " + roll2);
					counter++;
				}
				System.out.println("it took " + counter + " rolls to get doubles.");
			}
				
				
}
