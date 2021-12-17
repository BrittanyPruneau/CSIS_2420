/**
 * Defines lists of snow data which can be edited or deleted. 
 * 
 * @author Brittany Pruneau 
 * 
 */

package finalProject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Snow
{
	List<Double> snowFall = new ArrayList<Double>(); 
	private LinkedList savedSnowFallList = new LinkedList<>();
	
	/*
	 * Creates a list of snow data. 
	 */
	public Snow(List<Double> snowFall)
	{
		this.snowFall = snowFall;
	}
	
	
	/*
	 * Gets a list of snow data.  
	 */
	public List<Double> getSnowFall()
	{
		return snowFall;
	}

	/*
	 * Sets a list of snow data. 
	 */
	public void setSnowFall(List<Double> snowFall)
	{
		this.snowFall = snowFall;
	}

	/*
	 * Deletes a list of snow data. 
	 */
	public void delete365Snow(List<Double> snowFall)
	{
		snowFall.clear();
	}
	
}
