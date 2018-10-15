/**
 * 
 * @author danielhan
 *
 */
public class DiceNew 
{
	private int numRolls;
	
	public DiceNew()
	{
		numRolls = 0;
	}
	
		public int roll()
		{
			numRolls++;
			return (int)(Math.random()*6+1);
		}
		public void reset()
		{
			numRolls = 0;
		}

		public int getNumRolls() 
		{
		return numRolls;
}
}
