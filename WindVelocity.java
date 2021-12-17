/**
 * Populates a list as well as a linked list with wind information. 
 * 
 * @author Brittany Pruneau 
 * 
 */

package finalProject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WindVelocity
{
	List<Double> windVelocityList = new ArrayList<Double>(); 
	private LinkedList windVelocityLL = new LinkedList<>();
	public WindVelocity(List<Double> windVelocity)
	{
		this.windVelocityList = windVelocity;
	}
	
	/*
	 * Retuns wind velocity list.  
	 */
	public List<Double> getWindVelocityList()
	{
		return windVelocityList;
	}

	/*
	 *	Sets a list of wind velocity.  
	 */
	public void setWindVelocityList(List<Double> windVelocity)
	{
		this.windVelocityList = windVelocity;
	}

	/*
	 * Delets a list of wind velocity information. 
	 */
	public void delete365windVelocity(List<Double> windVelocity)
	{
		windVelocity.clear();
	}
	
}
