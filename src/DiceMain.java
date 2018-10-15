/**
 * 
 * @author danielhan
 *
 */
public class DiceMain 
{
				public static void main(String[] args)
				{
					DiceNew dice = new DiceNew();
					
					int count = 0;
					int roll1 = dice.roll();
					
					
					{
					int roll2 = dice.roll();
					count ++;
					while(roll2 == roll1)
					{
						
					}
					System.out.println("First roll = " + roll1);
					System.out.println("Second roll = " + roll2);
					System.out.println("Sum of rolls = " + roll1 + roll2);
					System.out.println("Total number of rolls taken to get doubles = " + count  );
					}
					
				}
}
