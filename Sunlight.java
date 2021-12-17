/**
 * Populates lists of sunlight data.  
 * 
 * @author Brittany Pruneau 
 * 
 */

package finalProject;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sunlight extends Environment 
{
	List<Double> irradiance  = new ArrayList<Double>(); 
	private LinkedList irradianceLL = new LinkedList<>();
	
	/*
	 * Generates a list of irradiance data. 
	 */
	public Sunlight(List<Double> irradiance)
	{
		
		this.irradiance = irradiance;
	}
	
	/*
	 * Sets a list of sun data.
	 */
	public void setIrradiance(List<Double> irradiance)
	{
		this.irradiance = irradiance;
	}

	/*
	 * Replaces a list of sun data. 
	 */
	public void replace365Sunlight(List<Double> irradiance)
	{
		this.irradiance.clear();
		this.irradiance = irradiance;
	}
	
	/*
	 * Deletes a list of sun data. 
	 */
	public void delete365Sunlight(List<Double> irradiance)
	{
		irradiance.clear();	
	}
	
	/*
	 * Saves a list of sun data. 
	 */
	public void save365Sunlight(List<Double> irradiance)
	{
		//this.savedRainFallList.append(rainfall);
	}
}
