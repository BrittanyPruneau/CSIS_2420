/**
 * Allows for a linked list to have nodes that contain watts and BTU information. 
 * 
 * @author Brittany Pruneau 
 * 
 */

package finalProject;

public class WattBTUsLLNode
{
	WattBTUsLLNode next;
	WattBTUsLLNode left;
	WattBTUsLLNode right;
	
	PowerBinarySearchTree wattsBST;
	BTUBinarySearchTree BTUsBST;
	/**
	 * @param next
	 * @param watts
	 * @param bTUs
	 */
	public WattBTUsLLNode(PowerBinarySearchTree wattsBST, BTUBinarySearchTree bTUsBST)
	{
		this.wattsBST = wattsBST;
		this.BTUsBST = bTUsBST;
	}
}
