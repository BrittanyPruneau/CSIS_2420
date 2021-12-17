/**
 * Allows for functionality of rain object or list to be changed or deleted. 
 * 
 * @author Brittany Pruneau 
 * 
 */

package finalProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Rain extends Environment
{
	List<Double> rainfall = new ArrayList<Double>(); 
	private LinkedList savedRainFallList = new LinkedList<>();
	
	/*
	 * Generates a list of rain data.
	 */
	public Rain(List<Double> rainfall)
	{
		this.rainfall = rainfall;
	}
	
	/*
	 * Replaces a list of rain data. 
	 */
	public void replace365RainFall(List<Double> rainfall)
	{
		this.rainfall.clear();
		this.rainfall = rainfall;
	}
	
	/*
	 * Deletes a list of rain data. 
	 */
	public void delete365Rain(List<Double> rainfall)
	{
		rainfall.clear();
	}
	
}

