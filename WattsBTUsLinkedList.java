/**
 * Populates a linked list with wattage and btu information. 
 * 
 * @author Brittany Pruneau 
 * 
 */

package finalProject;

import java.util.*;

import java.awt.List;
import java.util.*;

public class WattsBTUsLinkedList
{
	WattBTUNode head = null; 
	WattBTUNode temp = null;
	WattBTUNode temp2 = null;
	
	/*
	 * Adds a new node to a linked list. 
	 */
	public void append(double watts, double BTUs)
	{
		if (head == null)
	    {
	      this.head = new WattBTUNode(watts, BTUs);
	      return;
	    }
		WattBTUNode current = this.head; // variable current shows the head which stores int 2 and PlayerNode next which is currently null.
	    
	    while (current.next != null) // checks if current node already contains an int data
	    {
	      current = current.next;
	    }
	    current.next = new WattBTUNode(watts, BTUs);   	
	}
	
	/*
	 * Returns the length of the linked list. 
	 */
	public int length()
	{
		if(head == null)
			return 0; 
		int count = 1;
		WattBTUNode current = head; 
		while(current.next!=null)
		{
			count++;
			current = current.next;
		}
		return count;
	}

	/*
	 * Prints the linked list. 
	 */
	public void printList()
	{
		WattBTUNode current = head;
	    System.out.println("List Contents: ");
	    while (current != null)
	    {
	      System.out.println(current.watts + ", " + current.BTUs);
	      current = current.next;
	    }
	   if(head == null) System.out.println("null");
	}

}