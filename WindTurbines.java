/**
 * Provides the necessary information about wind turbinesfor the user to make a choice as well as generates power using wind. 
 * 
 * * A wind turbine is a device that converts the wind's kinetic energy into
 * electrical energy. Wind turbines are manufactured in a wide range of sizes,
 * with either horizontal or vertical axes. It is estimated that hundreds of
 * thousands of large turbines, in installations known as wind farms, now
 * generate over 650 gigawatts of power, with 60 GW added each year.[1] They are
 * an increasingly important source of intermittent renewable energy, and are
 * used in many countries to lower energy costs and reduce reliance on fossil
 * fuels. One study claimed that, as of 2009, wind had the "lowest relative
 * greenhouse gas emissions, the least water consumption demands and... the most
 * favourable social impacts" compared to photovoltaic, hydro, geothermal, coal
 * and gas.[2]
 * 
 * 
 * @author Brittany Pruneau 
 * 
 */
package finalProject.EnergyModules;

import java.util.ArrayList;
import java.util.List;
import finalProject.Environment;
import finalProject.Pollution;
import finalProject.Power;
import finalProject.WattsBTUsLinkedList;

public class WindTurbines implements Power, Pollution
{
	private int totalNumbofWindTubrines;
	private double size; 
	private TurbineTypes type;
	private double lifeSpan;
	private double capacityFactor;
	private double WattsGeneratedPerHour;
	public WattsBTUsLinkedList windPowerGeneratedLL = new WattsBTUsLinkedList();
	public List hourlyWindVelocity2Power = new ArrayList<>(); 
	/**
	 * @param totalNumbofWindTubrines
	 * @param size
	 * @param type
	 */
	public WindTurbines(int totalNumbofWindTubrines, double size, TurbineTypes type, double lifeSpan, double capacityFactor)
	{
		this.totalNumbofWindTubrines = totalNumbofWindTubrines;
		this.size = size;
		this.type = type;
		this.lifeSpan = lifeSpan; 
		this.capacityFactor = capacityFactor;
	}

	/*
	 * Shows different types of wind turbines for the sure to make a choice. 
	 */
	public void showWindTurbineTypes()
	{
		System.out.println("//A vertical axis Twisted Savonius type turbine.\r\n"
				+ "//Vertical-axis wind turbines (or VAWTs) have the main rotor shaft arranged vertically. One advantage of this arrangement is \r\n"
				+ "//that the turbine does not need to be pointed into the wind to be effective, which is an advantage on a site where the wind \r\n"
				+ "//direction is highly variable. It is also an advantage when the turbine is integrated into a building because it is inherently \r\n"
				+ "//less steerable. Also, the generator and gearbox can be placed near the ground, using a direct drive from the rotor assembly \r\n"
				+ "//to the ground-based gearbox, improving accessibility for maintenance. However, these designs produce much less energy averaged \r\n"
				+ "//over time, which is a major drawback.[27][34]\r\n"
				+ "//Vertical turbine designs have much lower efficiency than standard horizontal designs.[35] The key disadvantages include the \r\n"
				+ "//relatively low rotational speed with the consequential higher torque and hence higher cost of the drive train, the inherently \r\n"
				+ "//lower power coefficient, the 360-degree rotation of the aerofoil within the wind flow during each cycle and hence the highly \r\n"
				+ "//dynamic loading on the blade, the pulsating torque generated by some rotor designs on the drive train, and the difficulty of \r\n"
				+ "//modelling the wind flow accurately and hence the challenges of analysing and designing the rotor prior to fabricating a prototype.[36]\r\n"
				+ "//When a turbine is mounted on a rooftop the building generally redirects wind over the roof and this can double the wind speed at \r\n"
				+ "//the turbine. If the height of a rooftop mounted turbine tower is approximately 50% of the building height it is near the optimum for \r\n"
				+ "//maximum wind energy and minimum wind turbulence. While wind speeds within the built environment are generally much lower than at \r\n"
				+ "//exposed rural sites,[37][38] noise may be a concern and an existing structure may not adequately resist the additional stress.");
		System.out.println();
		System.out.println("Horizontal Axis wind turbines \r\n"
				+ "//Large three-bladed horizontal-axis wind turbines (HAWT) with the blades upwind of the tower produce the overwhelming \r\n"
				+ "//majority of wind power in the world today. These turbines have the main rotor shaft and electrical generator at the top \r\n"
				+ "//of a tower, and must be pointed into the wind. Small turbines are pointed by a simple wind vane, while large turbines generally use a wind sensor coupled with a yaw system. Most have a gearbox, which turns the slow rotation of the blades into a quicker rotation that is more suitable to drive an electrical generator.[28] Some turbines use a different type of generator suited to slower rotational speed input. These don't need a gearbox and are called direct-drive, meaning they couple the rotor directly to the generator with no gearbox in between. While permanent magnet direct-drive generators can be more costly due to the rare earth materials required, these gearless turbines are sometimes preferred over gearbox generators because they \"eliminate the gear-speed increaser, which is susceptible to significant accumulated fatigue torque loading, related reliability issues, and maintenance costs.\"[29] There is also the pseudo direct drive mechanism, which has some advantages over the permanent magnet direct drive mechanism.[30][31]\r\n"
				+ "//One Energy in Findlay, OH assembles one of their permanent magnet direct-drive wind turbines.\r\n"
				+ "//The rotor of a gearless wind turbine being set. This particular turbine was prefabricated in Germany, before being shipped \r\n"
				+ "//to the U.S. for assembly.\r\n"
				+ "//Most horizontal axis turbines have their rotors upwind of the supporting tower. Downwind machines have been built, \r\n"
				+ "//because they don't need an additional mechanism for keeping them in line with the wind. In high winds, the blades \r\n"
				+ "//can also be allowed to bend, which reduces their swept area and thus their wind resistance. Despite these advantages, \r\n"
				+ "//upwind designs are preferred, because the change in loading from the wind as each blade passes behind the supporting \r\n"
				+ "//tower can cause damage to the turbine.\r\n"
				+ "//Turbines used in wind farms for commercial production of electric power are usually three-bladed. These have low torque \r\n"
				+ "//ripple, which contributes to good reliability. The blades are usually colored white for daytime visibility by aircraft and \r\n"
				+ "//range in length from 20 to 80 meters (66 to 262 ft). The size and height of turbines increase year by year. Offshore wind turbines \r\n"
				+ "//are built up to 8 MW today and have a blade length up to 80 meters (260 ft). Designs with 10 to 12 MW were in preparation in 2018,[32] \r\n"
				+ "//and a \"15 MW+\" prototype with three 118 meters (387 ft) blades is planned to be constructed in 2022.[33] Usual multi megawatt turbines ");
	}
	
	/*
	 * Gets the total number of wind turbines.
	 */
	public int getTotalNumbofWindTubrines()
	{
		return totalNumbofWindTubrines;
	}

	/*
	 * Sets the total number of wind turbiens. 
	 */
	public void setTotalNumbofWindTubrines(int totalNumbofWindTubrines)
	{
		this.totalNumbofWindTubrines = totalNumbofWindTubrines;
	}

	/*
	 * Returns the size of wind turnine. 
	 */
	public double getSize()
	{
		return size;
	}

	/*
	 * Sets the size of wind turbine. 
	 */
	public void setSize(double size)
	{
		this.size = size;
	}

	/*
	 * Returns the type of wind turbine. 
	 */
	public TurbineTypes getType()
	{
		return type;
	}

	/*
	 * Sets the type of wind turbine. 
	 */
	public void setType(TurbineTypes type)
	{
		this.type = type;
	}

	/*
	 * Gets the life span of the wind turbine model. 
	 */
	public double getLifeSpan()
	{
		return lifeSpan;
	}

	/*
	 * Sets the life span. 
	 */
	public void setLifeSpan(double lifeSpan)
	{
		this.lifeSpan = lifeSpan;
	}

	/*
	 * Shows the current voltage levels of the wind turbine. 
	 */
	@Override
	public void showCurrentVoltagelevel()
	{
		// TODO Auto-generated method stub

	}

	/*
	 * Shows the present current levels.
	 */
	@Override
	public void showPresentCurrentLevel()
	{
		// TODO Auto-generated method stub

	}

	/*
	 * Shows the annual pollution generated. 
	 */
	@Override
	public void showAnnualPollutionFromElectricityUse(Environment env, Double yearlyElectricity)
	{
		// TODO Auto-generated method stub

	}

	/*
	 * Shows the annual pollution geneated from natural gas. 
	 */
	@Override
	public void showAnnualPollutionFromNaturalGasUsage(Environment env, Double yearlyElectricity)
	{
		// TODO Auto-generated method stub

	}

	/*
	 * Generates power pased off of the environmental wind data. 
	 */
	@Override
	public void generateChargePowerModule(Environment env)
	{
		if(this.type == TurbineTypes.horizontal)
		{
			generateElectricityHorizontal(env);
		}
		if(this.type == TurbineTypes.vertical)
		{
			generateElectricityVertical(env);

		}
	}

	/*
	 * Sets the wind turbine capacity factor. 
	 */
	public void setWindTurbineCapacityFactor(double cp)
	{
		this.capacityFactor = cp; 
	}
	
	/*
	 * Geneates power using a vertical wind turbine. 
	 */
	private void generateElectricityVertical(Environment env)
	{
		// Source:  https://www.luvside.de/en/capacity-factor-wind-turbine/
		// NAMEPLATE capacity is the amount of energy the turbine would produce if it ran 100 percent of the time at optimal wind speeds. 
		// Capacity FACTOR represents the estimated electricity production by multiplying the capacity times 8760 the numbers of hours in a year to find wattage
		// But this depends on wind speed of course. So if the turbinge is rated at 1.5kW Nameplate capcity it will produce 1.5kW per hour while the wind speed is 
		// at a constant 15m/s. 
		// cut in wind velocity is the point of which the turbine has overcome torque needed to spin the turbine. 
		// cout wind velocity is the wind speed of which the turbine is producing the maximum amount of power possible. 
		// Conclusion: (kW) KiloWatts generated per hour = (capacity factor: 20%) * (wind speed in meters per second) * .1 
		
		List hourlyWindVelocity2Power = env.getWindVelocity();
		// replace all the hours of wind velocity less than the cut in velocity == 0 this was we can skip over it and conclude that the power produced during that hour = 0; 
		
		// decompose all two orthogonal subspace - all the fields that are curlfree
		// vector fields that are divergence free. 
		// Helmholtz look this up
		// physics 
		// basics of forrier series ->  forrier transforms 
		// hilbert spaces
		
		//temporary data for cutInSpeed = 5mph
		// temp data for cutOutSpeed = 80mph;
		double cutInSpeed = 5;
		double cutOutSpeed = 80;
		
		
		for (int i = 0; i < hourlyWindVelocity2Power.size(); i++)
		{
			if((double) hourlyWindVelocity2Power.get(i) < cutInSpeed)
			{
				Object wattsGenerated = 0.0;
				hourlyWindVelocity2Power.set(i, wattsGenerated);
				windPowerGeneratedLL.append(0.0, 0.0);
			}
			if((double) hourlyWindVelocity2Power.get(i) > cutOutSpeed)
			{
				Object wattsGenerated = cutOutSpeed * this.capacityFactor * .1;
				hourlyWindVelocity2Power.set(i, wattsGenerated);
				windPowerGeneratedLL.append((cutOutSpeed * this.capacityFactor * .1), 0.0);

			}
			else
			{
				Object wattsGenerated = (double) hourlyWindVelocity2Power.get(i) * capacityFactor * .1;
				hourlyWindVelocity2Power.set(i, wattsGenerated);
				windPowerGeneratedLL.append((double) hourlyWindVelocity2Power.get(i) * capacityFactor * .1, 0.0);
			}
				
		}
		
	}

	/*
	 * Prints the vertical wind turbine power list. 
	 */
	public void printVerticalWindPowerList()
	{
		hourlyWindVelocity2Power.forEach(n-> System.out.println(n));
	}
	
	/*
	 * Prints the vertical wind power linked list. 
	 */
	public void printVerticalWindPowerLL()
	{
		windPowerGeneratedLL.printList();
	}
	
	/*
	 * Generates electricity for a horizontal wind turbine. 
	 */
	private void generateElectricityHorizontal(Environment env)
	{
		// TODO Auto-generated method stub
		
	}

	/*
	 * Computes the degredation of the wind trubie. 
	 */
	@Override
	public void computeDegradation(Environment env, Double dateFirstUse, Double lastUsedDate)
	{
		// https://en.wikipedia.org/wiki/Savonius_wind_turbine

	}

	/*
	 * Shows information about eh turbine the user chose. 
	 */
	@Override
	public String toString()
	{
		return "WindTurbines [totalNumbofWindTubrines=" + totalNumbofWindTubrines + ", size=" + size + ", type=" + type
				+ ", lifeSpan=" + lifeSpan + "]";
	}

	/*
	 * Generates charge module information.
	 */
	@Override
	public void generateChargePowerModule(Environment env, double desiredTemp)
	{
		// TODO Auto-generated method stub
		
	}
}
