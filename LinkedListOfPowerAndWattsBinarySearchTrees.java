/**
 * Contains the functionality for a Linked List which contains two binary search trees in each node. 
 * The first binary search tree contains power in Watts and the second contains energy in BTUs.
 * 
 * @author Brittany Pruneau 
 * 
 */

package finalProject;

import java.util.*;
import java.awt.List;
import java.util.*;
/*
 * This class is responsible for storing functionality for the Linked List object instantiated in the main method. 
 */
public class LinkedListOfPowerAndWattsBinarySearchTrees
{
	WattBTUsLLNode head = null; 
	WattBTUsLLNode temp = null;
	WattBTUsLLNode temp2 = null;
	int hour = 1;
	
	
	public void append(PowerBinarySearchTree wattsBST, BTUBinarySearchTree BTUsBST)
	{
		if (head == null)
	    {
	      this.head = new WattBTUsLLNode(wattsBST, BTUsBST);
	      return;
	    }
		WattBTUsLLNode current = this.head; // variable current shows the head which stores int 2 and PlayerNode next which is currently null.
	    
	    while (current.next != null) // checks if current node already contains an int data
	    {
	      current = current.next;
	    }
	    current.next = new WattBTUsLLNode(wattsBST, BTUsBST);   	
	}
	
	public int length()
	{
		if(head == null)
			return 0; 
		int count = 1;
		WattBTUsLLNode current = head; 
		while(current.next!=null)
		{
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void printList()
	{
		WattBTUsLLNode current = head;
		
	    System.out.println("List Contents: ");
	    int day = 1;
	    while (current.next != null)
	    {
	    	System.out.println("Printing Wattage Binary Search Tree: ");
	    	System.out.println("Hour: " + this.hour + " Day: " + day);
	      current.wattsBST.inOrderTraverse(current.wattsBST.getRoot());
	      System.out.println();
	      
	    	System.out.println("Printing BTU Binary Search Tree: ");
	    	System.out.println("Hour: " + this.hour + " Day: " + day);
	      current.BTUsBST.inOrderTraverse(current.BTUsBST.getRoot());
	     
	      current = current.next;
	      this.hour++;
	      
	      if(hour == 25)
	      {
	    	  hour = 1;
	    	  day++;
	      }
	    }
	   if(head == null) System.out.println("null");
	}

}