package finalProject;

/**
 * Provides functionality of a binary search tree to organize BTUs.   
 *  
 *  @author Brittany Pruneau 
 *  
 * BinarySearchTree.java - Class to manage binary search 
 *                         tree implementations.
 * 
 * @author: @professorgordon
 * Provides functionality for inserting, pre-order traversing, in-order traversing, and post order traversing.
 * @url: http://johngordon.io/javaadvancedtrees.php
 * @license: Creative Commons. No Warranty. No Liability.
 * @disclaimer: This code file is intended strictly for
 *              academic purposes. It is NOT intended for
 *              use in production systems.
 *  
 */

public class BTUBinarySearchTree
{
  public WattBTUNode root;
  public WattBTUNode rootFound;

  public WattBTUNode getRoot()
  {
	  return this.root;
  }
  public void insert(double watts, double bTUs)
  {
	  WattBTUNode newNode = new WattBTUNode(watts, bTUs);
    if(root == null)
    {
      root = newNode;
      return;
    }
    else
    {
    	WattBTUNode current = root, parent = null; 
      while(true)
      {
        parent = current; 
        if(bTUs < current.BTUs)  // if 33 < 20(head) 
        {						// current is the head
          current = current.left;  // now we change the current node to be equal to the left node from parent
          if(current == null) // if left node is null
          {
            parent.left = newNode; // then we create a new left node of the data inside parent(kept track of the newly added data)
            return;
          }
        }
        else // (if 33 > 20 ) (if newly added data is greater than the head)
        {
          current = current.right;	// greater than head
          if(current == null) // if there is no right node yet.
          {
            parent.right = newNode;		// then we are going to create a new right node. 
            return;
          }
        }
      }
    }
  }


  /*
   * Traverses left in binary search tree.
   */
  public WattBTUNode traverseLeft(WattBTUNode root)
  {
	  if(root.left != null)
	  {
		  return traverseLeft(root.left);
	  }
	  else 
		  return root;
  }
  
  /*
   * Traverses right in a binary search tree.
   */
  public WattBTUNode traverseRight(WattBTUNode root)
  {
	  if(root.right != null)
	  {
		  return traverseRight(root.right);
	  }
	  else 
		  return root;
  }
  	
  /*
   * Counts the number of nodes in a binary search tree.
   */
  public int countNumber(WattBTUNode n)
  {
	  if(root == null)
	    {
	      System.out.println("Tree is empty");
	      return 0; 
	    }
	    else
	    {
	    	int leftCount = 0;
	    	if(n.left!=null)
	    	{
	    		leftCount = countNumber(n.left);
	    	}
	    	int rightCount = 0;
	    	if(n.right!=null)
	    	{
	    		rightCount = countNumber(n.right);
	    	}	
	     return 1 + leftCount + rightCount;
	    }    
  }
  
  /*
   * Traverses a binary search tree using the pre order traversal method. 
   */
  public void preOrderTraverse(WattBTUNode n)
  {
    if(root == null)
    {
      System.out.println("Tree is empty");
      return;
    }
    else
    {
      System.out.println(n.watts + " " + n.BTUs);
      if(n.left!= null)
      {
        preOrderTraverse(n.left);
      }
      if(n.right!= null)
      {
        preOrderTraverse(n.right);
      }
    }
  }

  /*
   * Traverses a binary search tree using the in order traversal method. 
   */
  public void inOrderTraverse(WattBTUNode n)
  {
    if(root == null)
    {
      System.out.println("Tree is empty");
      return;
    }
    else
    {
      if(n.left!= null)
      {
        inOrderTraverse(n.left);
      }
      System.out.println(n.watts + " " + n.BTUs);
      if(n.right!= null)
      {
        inOrderTraverse(n.right);
      }
    } 
  }

  /*
   * Traverses a binary search tree using the post order traversal method. 
   */
  public void postOrderTraverse(WattBTUNode n)
  {
    if(root == null)
    {
      System.out.println("Tree is empty");
      return;
    }
    else
    {
      if(n.left!= null)
      {
        postOrderTraverse(n.left);
      }
      if(n.right!= null)
      {
        postOrderTraverse(n.right);
      }
      System.out.println(n.watts + " " + n.BTUs);
    }
  }
}