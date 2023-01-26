package sortState;

public class State implements Comparable
{
	// instance variables
	private String name;
	private String capital;
	private String nickname;
	private int population;
	
	public State(String n, String c, String nn, int p)
	{
		name = n;
		capital = c;
		nickname = nn;
		population = p;
	}
	
	// Comparable Interface method
	// If the population of this state is less than the other state
	// return -1, if the population of this state is greater than
	// the other state return 1, and if the populations are equal
	// return 0;
	public int compareTo(Object obj)
	{

		
		return 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getCapital()
	{
		return capital;
	}
	
	public String getNickname()
	{
		return nickname;
	}
	
	public int getPopulation()
	{
		return population;
	}
}