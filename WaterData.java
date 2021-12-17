/**
 * Populates a list of water data and provides necessary mathematical conversions. 
 * 
 * @author Brittany Pruneau 
 * 
 */
package finalProject;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WaterData extends Environment
{
	List<Double> flowRates  = new ArrayList<Double>(); 
	List<Double> heightHead  = new ArrayList<Double>(); 

	private LinkedList flowRateLL = new LinkedList<>();
	
	/*
	 * Water data has been found at https://nwis.waterdata.usgs.gov/usa/nwis/uv/?cb_00060=on&cb_00065=on&format=html&site_no=14120000&period=365&begin_date=2021-11-24&end_date=2021-12-01
	 */
	public WaterData(List<Double> flowRates, List<Double> heightHead)
	{
		this.flowRates = flowRates;
		this.heightHead = heightHead;
	}
	
	/*
	 * Converts cubic feet per second to meters per second. 
	 */
	public List conversion_Cubic_Feet_Sec_2metersPerSecond()
	{
		this.flowRates.forEach(cubicMeter -> cubicMeter = ((1/3)*(double)cubicMeter));
		return this.flowRates;
	}
	
	/*
	 * Returns a list of flow rates.
	 */
	public List<Double> getFlowRates()
	{
		return flowRates;
	}

	/*
	 * Sets a list of flow rates.
	 */
	public void setFlowRates(List<Double> flowRates)
	{
		this.flowRates = flowRates;
	}

	/*
	 * Returns a list of height and head data.
	 */
	public List<Double> getHeightHead()
	{
		return heightHead;
	}

	/*
	 * Sets height and head data. 
	 */
	public void setHeightHead(List<Double> heightHead)
	{
		this.heightHead = heightHead;
	}
	
	/*
	 * Deletes a list of rain data.
	 */
	public void delete365Rain(List<Double> flowRates)
	{
		flowRates.clear();
	}

}
