/**
 * Provides the necessary information about solar systems for the user to make a choice as well as generates power using solar. 
 * 
 * @author Brittany Pruneau 
 * 
 */

package finalProject.EnergyModules;

import finalProject.BTUs;
import finalProject.Environment;
import finalProject.Pollution;
import finalProject.Power;

public class SolarEnergySystems implements Power, Pollution, BTUs
{
	private double size; // kW or MW
	private double capacity; // mWh or kWh
	private double price;
	private double lifeSpan;
	private SolarEnergyDesigns type;
	
	
	
	/**
	 * @param size
	 * @param capacity
	 * @param price
	 * @param lifeSpan
	 * @param type
	 */
	public SolarEnergySystems(double size, double capacity, double price, double lifeSpan, SolarEnergyDesigns type)
	{
		this.size = size;
		this.capacity = capacity;
		this.price = price;
		this.lifeSpan = lifeSpan;
		this.type = type;
	}

	public void displaySolarEnergyDesigns()
	{
		//Passive Solar Heat Sink
		System.out.println("How The Heat Sink Works\r\n"
				+ "As temperatures drop at night, the heat "
				+ "absorbed by the water vessels is radiated back into"
				+ "the greenhouse. When properly done, the temperature inside "
				+ "the greenhouse stays an average of 20 to 30° warmer than outside, "
				+ "even in the dead of winter!");
		System.out.println("You are going to need to purchase 55-gallon drums, either black plastic or painted flat black. "
				+ "Again, you need an insulation board installed on the north wall prior to adding a bank of barrels. "
				+ "Then line up each barrel, fill with water, oil, or dense rocky material and seal.");
		System.out.println();
		
		//Passive Solar Water Heater
		System.out.println("1.2.2.2 Passive solar water-heating\r\n"
				+ "In the passive solar water-heating system, solar collectors are used to heat the water. "
				+ "Technologies including FPCs, ETCs, integrated collector storage allied to a CPC, and the "
				+ "photovoltaic/thermal (PVT) system can be used. The basic elements of the system include the collector, "
				+ "piping, and hot water tank. The heat transfer from collector to storage tank occurs through the natural "
				+ "convection principle. An electrical pump is not needed.");
		System.out.println();
		// Active Solar Water Heating
		System.out.println("1.2.2.3 Active solar space- and water-heating\r\n"
				+ "In the active solar space- and water-heating systems, the solar "
				+ "collectors transfer the heat to the heating system through pumps or fans. "
				+ "Nontracking solar collectors are enough for these demands. Sometimes the space- "
				+ "and water-heating functions are integrated in one system. The heating systems can "
				+ "use the solar heat directly or through heat exchange processes. Water or air is used "
				+ "as a transport medium.");
		// Passive Solar Architecture
		System.out.println("Intelligent Building Construction is very important and requires numerous parameters to calculate savings. "
				+ "These details will be integrated in this application at a later time. For now we will guestimate 10 percent reduction "
				+ "for heating and cooling production from other systems.");	
	}

	/*
	 * Generates energy using environmental information. 
	 */
	@Override
	public void generateChargeEnergyModule(Environment env)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showCurrentBTUlevel()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void computeDegradation(Environment env)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAnnualPollutionFromElectricityUse(Environment env, Double yearlyElectricity)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAnnualPollutionFromNaturalGasUsage(Environment env, Double yearlyElectricity)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateChargePowerModule(Environment env, double desiredTemp)
	{
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * Generates power depending on which system the user has chosen. 
	 */
	@Override
	public void generateChargePowerModule(Environment env)
	{
		if(this.type == SolarEnergyDesigns.activeSolarWaterHeater)
		{
			runActiveSolarWaterHeater(env);
		}
		if(this.type == SolarEnergyDesigns.passiveSolarWaterHeater)
		{
			runPassiveSolarWaterHeater(env);
		}
		if(this.type == SolarEnergyDesigns.passiveSolarArchitecture)
		{
			buildPassiveSolarArchitecture(); 
		}
		if(this.type == SolarEnergyDesigns.passiveSolarHeatSink)
		{
			chargePassiveSolarHeatSink(env);
		}
	}

	/*
	 * Charges a passive solar heat sink. 
	 */
	private void chargePassiveSolarHeatSink(Environment env)
	{
		// TODO Auto-generated method stub
		
	}

	/*
	 * Builds a passive solar architecture. 
	 */
	private void buildPassiveSolarArchitecture()
	{
		// TODO Auto-generated method stub
		
	}

	/*
	 * Runs a passive solar water heater. 
	 */
	private void runPassiveSolarWaterHeater(Environment env)
	{
		// TODO Auto-generated method stub
		
	}

	/*
	 * Runs an active solar water heater. 
	 */
	private void runActiveSolarWaterHeater(Environment env)
	{
		// TODO Auto-generated method stub
		
	}

	/*
	 * Shows current voltage levels. 
	 */
	@Override
	public void showCurrentVoltagelevel()
	{
		// TODO Auto-generated method stub
		
	}

	/*
	 * Shows present current level. 
	 */
	@Override
	public void showPresentCurrentLevel()
	{
		// TODO Auto-generated method stub
		
	}

	/*
	 * Computes the degradataion of the system. 
	 */
	@Override
	public void computeDegradation(Environment env, Double dateFirstUse, Double lastUsedDate)
	{
		// TODO Auto-generated method stub
		
	}

	/*
	 * Returns size. 
	 */
	public double getSize()
	{
		return size;
	}

	/*
	 * Sets the size.
	 */
	public void setSize(double size)
	{
		this.size = size;
	}

	/*
	 * Returns the capacity. 
	 */
	public double getCapacity()
	{
		return capacity;
	}

	/*
	 * Sets the capacity. 
	 */
	public void setCapacity(double capacity)
	{
		this.capacity = capacity;
	}

	/*
	 * Gets the price of the system.  
	 */
	public double getPrice()
	{
		return price;
	}

	/*
	 * Sets the price. 
	 */
	public void setPrice(double price)
	{
		this.price = price;
	}

	/*
	 * Gets the lifespan. 
	 */
	public double getLifeSpan()
	{
		return lifeSpan;
	}

	/*
	 * Sets the lifespan
	 */
	public void setLifeSpan(double lifeSpan)
	{
		this.lifeSpan = lifeSpan;
	}

	/*
	 * Gets the type of solar energy design. 
	 */
	public SolarEnergyDesigns getType()
	{
		return type;
	}

	/*
	 * Sets the type of energy design. 
	 */
	public void setType(SolarEnergyDesigns type)
	{
		this.type = type;
	}

	/*
	 * Returns information about the type of solar system the user has chosen. 
	 */
	@Override
	public String toString()
	{
		return "SolarEnergySystems [size=" + size + ", capacity=" + capacity + ", price=" + price + ", lifeSpan="
				+ lifeSpan + ", type=" + type + "]";
	}

}
