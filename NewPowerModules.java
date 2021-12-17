/**
 * Provides a framework for the user to choose a new type of power system. 
 * 
 * @author Brittany Pruneau 
 * 
 */

package finalProject.EnergyModules;

import finalProject.Environment;
import finalProject.Power;

public class NewPowerModules implements Power
{
	private double size; // kW or Mw
	private double capacity; // kWh or MWh
	private double weight; 
	private double lifeSpan; //years
	/**
	 * @param size
	 * @param capacity
	 * @param weight
	 * @param lifespan
	 */
	public NewPowerModules(double size, double capacity, double weight, double lifespan)
	{
		this.size = size;
		this.capacity = capacity;
		this.weight = weight;
		this.lifeSpan = lifespan;
	}
	/**
	 * @return the size
	 */
	public double getSize()
	{
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(double size)
	{
		this.size = size;
	}
	/**
	 * @return the capacity
	 */
	public double getCapacity()
	{
		return capacity;
	}
	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(double capacity)
	{
		this.capacity = capacity;
	}
	/**
	 * @return the weight
	 */
	public double getWeight()
	{
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	/**
	 * @return the lifespan
	 */
	public double getLifespan()
	{
		return lifeSpan;
	}
	/**
	 * @param lifespan the lifespan to set
	 */
	public void setLifespan(double lifespan)
	{
		this.lifeSpan = lifespan;
	}

	@Override
	public void showCurrentVoltagelevel()
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void showPresentCurrentLevel()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateChargePowerModule(Environment env)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void computeDegradation(Environment env, Double dateFirstUse, Double lastUsedDate)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString()
	{
		return "NewPowerModules [size=" + size + ", capacity=" + capacity + ", weight=" + weight + ", lifeSpan="
				+ lifeSpan + "]";
	}
	@Override
	public void generateChargePowerModule(Environment env, double desiredTemp)
	{
		// TODO Auto-generated method stub
		
	}
	
	
}
