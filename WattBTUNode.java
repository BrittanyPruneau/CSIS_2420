/**
 * Allows for a linked list to have nodes that contain watts and BTU information. 
 * 
 * @author Brittany Pruneau 
 * 
 */
package finalProject;

public class WattBTUNode
{
	WattBTUNode next;
	WattBTUNode left;
	WattBTUNode right;
	
	double watts;
	double BTUs;
	/**
	 * @param next
	 * @param watts
	 * @param bTUs
	 */
	public WattBTUNode(double watts, double bTUs)
	{
		this.watts = watts;
		BTUs = bTUs;
	}
}

