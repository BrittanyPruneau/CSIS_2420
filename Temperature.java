/**
 * Populates lists of temperature data. 
 * 
 * @author Brittany Pruneau 
 * 
 */

package finalProject;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Temperature extends Environment
{
	List<Double> temps  = new ArrayList<Double>(); 
	private LinkedList tempsLLL = new LinkedList<>();
	
	/*
	 * Populates lists of temperature data.
	 */
	public Temperature(List<Double> temps)
	{
		this.temps = temps;
	}
	
	/*
	 * Converts a list of temperatures in farenheit to degrees celcius.
	 */
	public List farenheitToDegreesCelcius()
	{
		temps.forEach(temp -> temp= ((temp-32)/1.8));
		return this.temps;
	}
	
	/*
	 * Returns a list of temperatures. 
	 */
	public List<Double> getTemps()
	{
		return temps;
	}

	/*
	 * Sets a list of temperatures. 
	 */
	public void setTemps(List<Double> temps)
	{
		this.temps = temps;
	}

	/*
	 * Replaces a list of temperatures.
	 */
	public void replace365RainFall(List<Double> rainfall)
	{
		this.temps.clear();
		this.temps = temps;
	}
	
	/*
	 * Deletes a list of temperatures.
	 */
	public void delete365Rain(List<Double> temps)
	{
		temps.clear();
	}
	
}
