/**
 * Holds the environment information that will be used to generate energy and power. 
 * 
 * @author Brittany Pruneau
 */

package finalProject;

import java.util.List;

public class Environment
{
	Sunlight irradiance;
	WaterData waterData;
	WaterData heightHead;
	WindVelocity windVelocity; 
	Temperature degreesF;
	Rain rain;
	Snow snow; 
	
	/*
	 * Returns a list that has been converted from inches to meters.
	 */
	public List inchesToMeters(List list)
	{
		return list;
	}
	/*
	 * Returns a list that converts cubic feet per second to meters per second.
	 */
	public List conversion_Cubic_Feet_Sec_2metersPerSecond(List list)
	{
		list.forEach(cubicMeter -> cubicMeter = ((1/3)*(double)cubicMeter));
		return list;
	}
	 /*
	  * Returns a list that converts degrees in fereinheight to celcius.
	  */
	public List conversion_DegreesF_to_Celcius(List temps)
	{
		temps.forEach(temp -> temp= (((double)temp-32)/1.8));
		return temps;
	}
	
	/*
	 * Creates a list of irradiance data
	 */
	public void setIrradiance(List<Double> irradiance)
	{
		this.irradiance = new Sunlight(irradiance);
	}
	/*
	 *	Returns a list of irradiance data.  
	 */
	public List getIrradiance()
	{
		return this.irradiance.irradiance;
	}

	/*
	 * Sets two lists of water data information. 
	 */
	public void setWaterData(List<Double> flowRates, List<Double> heightHeads)
	{
		this.waterData = new WaterData(flowRates, heightHeads);
	}
	
	/*
	 * Gets a list of water flow rates.
	 */
	public List getWaterDataFlowRates()
	{
		return waterData.flowRates;
	}
	
	/*
	 * Gets a list of water data height heads
	 */
	public List getWaterDataheightHeads()
	{
		return waterData.heightHead;
	}
	
	/*
	 * Sets a list of wind velocity data.
	 */
	public void setwindVelocity(List<Double> windVelocity)
	{
		this.windVelocity = new WindVelocity(windVelocity);
	}
	/*
	 * Returns a list of wind velocities.
	 */
	public List getWindVelocity()
	{
		return windVelocity.windVelocityList;
	}
	
	/*
	 *	Returns a list of degrees in Farinheight
	 */
	public List getDegreesF()
	{
		return degreesF.temps;
	}
	
	/*
	 * Returns a list of temperatures in farinheight.
	 */
	public void setTemperatureinFarinheight(List <Double> temps)
	{
		this.degreesF = new Temperature(temps); 
	}

	/*
	 * Returns a list of snow data. 
	 */
	public List getSnow()
	{
		return snow.snowFall;
	}
	
	/*
	 * Sets a list of snow data.
	 */
	public void setSnow(List<Double> snow)
	{
		this.snow = new Snow(snow);
	}
	
	/*
	 * Returns a list of rain data.
	 */
	public List getRain()
	{
		return rain.rainfall;
	}

	/*
	 * Sets a list of rain data.
	 */
	public void setRain(List<Double> rain)
	{
		this.rain = new Rain(rain);
	}	
}
