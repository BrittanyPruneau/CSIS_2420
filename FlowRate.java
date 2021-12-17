/**
 * Allows the user to change flow rate information. 
 * 
 * @author Brittany Pruneau 
 * 
 */
package finalProject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FlowRate
{
	List<Double> flowRate = new ArrayList<Double>(); 
	private LinkedList flowRateLL = new LinkedList<>();
	
	/*
	 * Constructs a list of flow rate data.
	 */
	public FlowRate(List<Double> flowRate)
	{
		this.flowRate = flowRate;
	}
	
	/*
	 * Replaces a list of flow rate data by first clearing and then replacing. 
	 */
	public void replace365flowRate(List<Double> flowRate)
	{
		this.flowRate.clear();
		this.flowRate = flowRate;
	}
	
	/*
	 * Deletes a list of flow rate data. 
	 */
	public void delete365FlowRates(List<Double> flowRate)
	{
		flowRate.clear();
	}
	
}
