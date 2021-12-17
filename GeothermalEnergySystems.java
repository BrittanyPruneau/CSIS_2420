package finalProject.EnergyModules;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import finalProject.BTUs;
import finalProject.Environment;
import finalProject.Pollution;
import finalProject.Power;
import finalProject.Temperature;
import finalProject.WattsBTUsLinkedList;

public class GeothermalEnergySystems implements Power, Pollution, BTUs
{
	private double lifeSpan; 
	private GeothermalUses type; 
	private double size;//  kW/MW
	private double capacity; //kwH/MWh
	private double price;
	public List<Double> currentPowerProduced = new ArrayList<Double>();
	public WattsBTUsLinkedList geothermalEnergyLL = new WattsBTUsLinkedList(); 

	
	/**
	 * @param lifeSpan
	 * @param type
	 * @param size
	 * @param capacity
	 * @param price
	 */
	public GeothermalEnergySystems(double lifeSpan, GeothermalUses type, double size, double capacity, double price)
	{
		this.lifeSpan = lifeSpan;
		this.type = type;
		this.size = size;
		this.capacity = capacity;
		this.price = price;
	}

	public void displayGeothermalHeatingApplications()
	{
		//Geothermal Heating:
		System.out.println("There are a wide variety of applications for cheap geothermal "
				+ "heat including heating of houses, greenhouses, bathing and swimming or "
				+ "industrial uses. Most applications use geothermal in the form of hot "
				+ "fluids between 50 °C (122 °F) and 150 °C (302 °F). The suitable "
				+ "temperature varies for the different applications. For direct use of "
				+ "geothermal heat, the temperature range for the agricultural sector lies "
				+ "between 25 °C (77 °F) and 90 °C (194 °F), for space heating lies between "
				+ "50 °C (122 °F) to 100 °C (212 °F).[4] Heat pipes extend the temperature "
				+ "range down to 5 °C (41 °F) as they extract and \"amplify\" the heat. "
				+ "Geothermal heat exceeding 150 °C (302 °F) is typically used for geothermal "
				+ "power generation.[6]\r\n"
				+ "\r\n"
				+ "In 2004 more than half of direct geothermal heat was used for space heating, "
				+ "and a third was used for spas.[1] The remainder was used for a variety of "
				+ "industrial processes, desalination, domestic hot water, and agricultural "
				+ "applications. The cities of Reykjavík and Akureyri pipe hot water from "
				+ "geothermal plants under roads and pavements to melt snow. Geothermal desalination"
				+ " has been demonstrated.\r\n"
				+ "\r\n"
				+ "Geothermal systems tend to benefit from economies of scale, so space heating power "
				+ "is often distributed to multiple buildings, sometimes whole communities. This technique, "
				+ "long practiced throughout the world in locations such as Reykjavík, Iceland;[7] Boise, "
				+ "Idaho;[8] and Klamath Falls, Oregon;[9] is known as district heating.[10]\r\n"
				+ "\r\n"
				+ "In Europe alone 280 geothermal district heating plants were in operation in 2016 according "
				+ "to the European Geothermal Energy Council (EGEC) with a total capacity of approximately 4.9 GWth.[11]");
		System.out.println();
		//Geothermal for Energy 
		System.out.println("Geothermal power is electrical power generated from geothermal energy. Technologies "
				+ "in use include dry steam power stations, flash steam power stations and binary cycle power stations. "
				+ "Geothermal electricity generation is currently used in 26 countries,[25][26] while geothermal heating "
				+ "is in use in 70 countries.");
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
	public void showCurrentBTUlevel()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateChargePowerModule(Environment env)
	{
		
	}
	
	@Override
	public void generateChargePowerModule(Environment env, double desiredTemp)
	{
		if(this.type == GeothermalUses.DrySteam)
		{
			generateElectricityUsingDrySteam(env);
		}
		if(this.type == GeothermalUses.FlashSteam)
		{
			generateElectricityUsingFlashSteam(env);
		}
		if(this.type == GeothermalUses.BinaryCycle)
		{
			generateElectricityUsingBinaryCycle(env);
		}
		//BTUs
		if(this.type == GeothermalUses.Heating4bathing)
		{
			generateBTUs4Bathing(env);
		}
		//BTUs
		if(this.type == GeothermalUses.HeatingHeatPumps)
		{
			generateBTUsHeatPumpsMinusBTUs(env,desiredTemp);
		}
		if(this.type == GeothermalUses.HeatingGreenhouses)
		{
			generateBTUsUsingPassiveGeothermalHeatExchangerInsideGreenHouse(env);
		}
		if(this.type == GeothermalUses.HeatingIndustrialUse)
		{
			generateElectricity4IndustrialUse(env);
		}
		if(this.type == GeothermalUses.HeatingSpaceHeating)
		{
			generateBTUs4SpaceHeating(env);
		}
		if(this.type == GeothermalUses.HeatingAgriculturePond)
		{
			generateBTUs4AgriculturePondHeating(env);
		}
		if(this.type == GeothermalUses.HeatingSnowMelting)
		{
			generateBTUs2MeltSnow(env);
		}
		if(this.type == GeothermalUses.Desalination)
		{
			generateHeat4WaterDesalination(env);
		}
		if(this.type == GeothermalUses.HeatingAgricultureDrying)
		{
			generateBTUs4AgricultureDryingNeeds(env); 
		}
	
	}

	private void generateBTUs4AgricultureDryingNeeds(Environment env)
	{
		// TODO Auto-generated method stub
		
	}

	private void generateHeat4WaterDesalination(Environment env)
	{
		
	}

	private void generateBTUs2MeltSnow(Environment env)
	{
		// TODO Auto-generated method stub
		
	}

	private void generateBTUs4AgriculturePondHeating(Environment env)
	{
		// TODO Auto-generated method stub
		
	}

	private void generateBTUs4SpaceHeating(Environment env)
	{
		// TODO Auto-generated method stub
		
	}

	private void generateElectricity4IndustrialUse(Environment env)
	{
		// TODO Auto-generated method stub
		
	}

	private void generateBTUsUsingPassiveGeothermalHeatExchangerInsideGreenHouse(Environment env)
	{
		// TODO Auto-generated method stub
		
	}

	/*
	 * This method takes in the desired temperature and uses power in order to generate
	 */
	private void generateBTUsHeatPumpsMinusBTUs(Environment env, double desiredTemperature)
	{
		// one kilowatt-hour of electricity for a geothermal heat pump to produce nearly 12,000 Btu of cooling or heating. 
		//(To produce the same number of Btus, a standard heat pump on a 95-degree day consumes 2.2 kilowatt-hours.) Geothermal systems are twice as efficient as the top-rated air conditioners and almost 50 percent more efficient than the best gas furnaces, all year round.
		// This number includes the specific heat (Cp) of air (0.24 BTU per pound per degree Fahrenheit). 
		// It takes 0.24 BTU of heat to change the temperature of one pound of air by one degree F.
		// potential energy produced:
		// 
		// return a list of BTU and Power could be -BTU could be -Watts  per hour etc.  1kW = 1000W  1000W to produce 12,000 BTU so 1W per hour to produce 12BTU
		
		// keeps the temperature inside at 70 degrees
		List tempsInCelcius = env.conversion_DegreesF_to_Celcius(env.getDegreesF()); // this shouldnt be 2 methods. should be 1. Should be accessing temperatures from temp class and Environment is the parent class. 
		for(int i =0; i<tempsInCelcius.size(); i++) // 8760 hours of temps
		{
			double temp = (double) tempsInCelcius.get(i);
			double difference = Math.abs(temp-desiredTemperature); //returns the 
			double BTU2BProduced = .24*difference;
			// 1W per hour produces 12BTU
			// 1W * BTUrequired per hour / 12BTU = the amount of Watts required per hour to increase the temperature the difference desired. 
			double wattsRequiredPerHour = (1*BTU2BProduced)/12; 
			this.geothermalEnergyLL.append(-wattsRequiredPerHour, BTU2BProduced);
		}
	}

	public void printPowerLinkedList()
	{
		
	}
	private void generateBTUsHeatPumpsMinusElectricity(Environment env)
	{
		// one kilowatt-hour of electricity for a geothermal heat pump to produce nearly 12,000 Btu of cooling or heating. 
		//(To produce the same number of Btus, a standard heat pump on a 95-degree day consumes 2.2 kilowatt-hours.) Geothermal systems are twice as efficient as the top-rated air conditioners and almost 50 percent more efficient than the best gas furnaces, all year round.
		// This number includes the specific heat (Cp) of air (0.24 BTU per pound per degree Fahrenheit). 
		// It takes 0.24 BTU of heat to change the temperature of one pound of air by one degree F.
		// potential energy produced:
		// 
		// return a list of BTU and Power could be -BTU could be -Watts  per hour etc.  1kW = 1000W  1000W to produce 12,000 BTU so 1W per hour to produce 12BTU
		List tempsInCelcius = env.conversion_DegreesF_to_Celcius(env.getDegreesF()); // this shouldnt be 2 methods. should be 1. Should be accessing temperatures from temp class and Environment is the parent class. 
		for(int i =0; i<tempsInCelcius.size(); i++) // 8760 hours of temps
		{
			double temp = (double) tempsInCelcius.get(i);
			double difference = Math.abs(temp-70); //returns the 
			double BTUrequired = .24*difference;
			// 1W per hour produces 12BTU
			// 1W * BTUrequired per hour / 12BTU = the amount of Watts required per hour to increase the temperature the difference desired. 
			double wattsRequiredPerHour = (1*BTUrequired)/12; 
			
		}
	}
	
	
	private void generateBTUs4Bathing(Environment env)
	{
		// TODO Auto-generated method stub
		
	}

	private void generateElectricityUsingBinaryCycle(Environment env)
	{
		// TODO Auto-generated method stub
		
	}

	private void generateElectricityUsingFlashSteam(Environment env)
	{
		// TODO Auto-generated method stub
		
	}

	private void generateElectricityUsingDrySteam(Environment env)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void computeDegradation(Environment env)
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
		return "GeothermalEnergySystems [lifeSpan=" + lifeSpan + ", type=" + type + ", size=" + size + ", capacity="
				+ capacity + ", price=" + price + "]";
	}

	@Override
	public void generateChargeEnergyModule(Environment env)
	{
		// TODO Auto-generated method stub
		
	}



}
