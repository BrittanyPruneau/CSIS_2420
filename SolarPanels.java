/**
 * Provides the necessary information about solar panels for the user to make a choice as well as generates power using solar. 
 * 
 * @author Brittany Pruneau 
 * 
 */

package finalProject.EnergyModules;

import java.util.ArrayList;
import java.util.List;

import finalProject.ChargeControllers;
import finalProject.Environment;
import finalProject.Power;
import finalProject.WattsBTUsLinkedList;

public class SolarPanels implements Power
{
	private double maxPower;
	private double openCircuitVoltage;// Open circuit voltage is how many volts the solar panel outputs with no load
										// on it. If you just measure with a voltmeter across the plus and minus leads,
										// you will read Voc. Since the solar panel isn’t connected to anything, there
										// is no load on it, and it is producing no current.
										// This is a very important number, as it is the maximum voltage that the solar
										// panel can produce under standard test conditions, so this is the number to
										// use when determining how many solar panels you can wire in series going into
										// your inverter or charge controller.
										// Voc will potentially be briefly produced in the morning when the sun first
										// comes up and the panels are at their coolest, but the connected electronics
										// haven’t woken up out of sleep mode yet.
										// Remember, fuses and breakers protect wires against over-current, not
										// over-voltage. So, if you put too much voltage into most electronics, you will
										// damage them.

	private double maxVoltageVmpp; // The Vmpp is the voltage when the power output is the greatest. It is the
									// actual voltage you want to see when it is connected to the MPPT solar
									// equipment (like an MPPT solar charge controller or a grid-tie inverter) under
									// standard test conditions.

	private double shortCircuitCurrent; // Short Circuit Current is how many amps (i.e. current) the solar panels are
										// producing when not connected to a load but when the plus and minus of the
										// panels wires are directly connected to each other. If you just measure with
										// an ammeter across the plus and minus leads, you will read Isc. This is the
										// highest current the solar panels will produce under standard test conditions.
										// When determining how many amps a connected device can handle, like a solar
										// charge controller or inverter, the Isc is used, generally multiplied by 1.25
										// for National Electrical Code (NEC) 80% requirements.
	private double maxCurrent; // Impp The Impp is the current (amps) when the power output is the greatest. It
								// is the actual amperage you want to see when it is connected to the MPPT solar
								// equipment under standard test conditions.

	private double nominalVoltage; // Nominal voltage is the one that confuses a lot of people. It’s not a real
									// voltage that you will actually measure. Nominal voltage is a category.
									// geranimals-are-like-solar-panels-reallyFor example, a nominal 12V solar panel
									// has a Voc of about 22V and a Vmp of about 17V. It is used to charge a 12V
									// battery (which is actually around 14V).
	private double moduleEfficiency; // shown as a percentage 18% So your panels can charge to appox 18% of size
										// specification.
	private double size; // kW or MW
	private double capacity; // mWh or kWh
	private double price;
	private double lifeSpan;
	private SolarPanelType type;

	private ChargeControllers CCno1;
	public WattsBTUsLinkedList MonoSolarPanelPowerLL = new WattsBTUsLinkedList();
	public List powerProducedByMonoSolarPanels = new ArrayList<Double>();

	/**
	 * @param maxPower
	 * @param openCircuitVoltage
	 * @param maxVoltageVmpp
	 * @param shortCircuitCurrent
	 * @param maxCurrent
	 * @param nominalVoltage
	 * @param moduleEfficiency
	 * @param size
	 * @param capacity
	 */
	public SolarPanels(SolarPanelType type, double price, double maxPower, double openCircuitVoltage,
			double maxVoltageVmpp, double shortCircuitCurrent, double maxCurrent, double nominalVoltage,
			double moduleEfficiency, double size, double capacity, double lifeSpan)
	{
		this.type = type;
		this.maxPower = maxPower;
		this.openCircuitVoltage = openCircuitVoltage;
		this.maxVoltageVmpp = maxVoltageVmpp;
		this.shortCircuitCurrent = shortCircuitCurrent;
		this.maxCurrent = maxCurrent;
		this.nominalVoltage = nominalVoltage;
		this.moduleEfficiency = moduleEfficiency;
		this.size = size;
		this.capacity = capacity;
		this.lifeSpan = lifeSpan;
	}

	/*
	 * Returns the max power generated. 
	 */
	public double getMaxPower()
	{
		return maxPower;
	}

	/*
	 * Returns the open circuit voltage.
	 */
	public double getOpenCircuitVoltage()
	{
		return openCircuitVoltage;
	}

	/*
	 * Sets the open circuit voltage. 
	 */
	public void setOpenCircuitVoltage(double openCircuitVoltage)
	{
		this.openCircuitVoltage = openCircuitVoltage;
	}

	/*
	 * Return the maxVoltageVmpp
	 */
	public double getMaxVoltageVmpp()
	{
		return maxVoltageVmpp;
	}

	/*
	 * Sets the max voltage 
	 */
	public void setMaxVoltageVmpp(double maxVoltageVmpp)
	{
		this.maxVoltageVmpp = maxVoltageVmpp;
	}

	/*
	 * Gets the short circuit current
	 */
	public double getShortCircuitCurrent()
	{
		return shortCircuitCurrent;
	}

	/*
	 * Sets the short circuit current. 
	 */
	public void setShortCircuitCurrent(double shortCircuitCurrent)
	{
		this.shortCircuitCurrent = shortCircuitCurrent;
	}

	/*
	 * Returns the max current
	 */
	public double getMaxCurrent()
	{
		return maxCurrent;
	}

	/*
	 * sets the max current. 
	 */
	public void setMaxCurrent(double maxCurrent)
	{
		this.maxCurrent = maxCurrent;
	}

	/*
	 * Gets the nominal voltage. 
	 */
	public double getNominalVoltage()
	{
		return nominalVoltage;
	}

	/*
	 * Sets the nomainal voltage. 
	 */
	public void setNominalVoltage(double nominalVoltage)
	{
		this.nominalVoltage = nominalVoltage;
	}

	/*
	 * Gets the module efficiency.
	 */
	public double getModuleEfficiency()
	{
		return moduleEfficiency;
	}

	/*
	 * Sets the module efficiency. 
	 */
	public void setModuleEfficiency(double moduleEfficiency)
	{
		this.moduleEfficiency = moduleEfficiency;
	}

	/*
	 * Gets the size. 
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
	 * Gets the capacity.
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
	 * Gets the charge controllers. 
	 */
	public ChargeControllers getCCno1()
	{
		return CCno1;
	}

	/*
	 * Sets the charge controller information. 
	 */
	public void setCCno1(ChargeControllers cCno1)
	{
		CCno1 = cCno1;
	}

	/*
	 * Shows the current voltage level. 
	 */
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

	/*
	 * Generates power depending on the type of solar panel. 
	 */
	@Override
	public void generateChargePowerModule(Environment env)
	{
		// TODO Auto-generated method stub
		if (this.type.equals(SolarPanelType.MonocrystallineSolarPanels))
		{
			generateMonoCrystallineSolarPower((env));
		}
		if (this.type.equals(SolarPanelType.PolycrystallineSolarPanels))
		{

		}
		if (this.type.equals(SolarPanelType.SolarShingles))
		{

		}
		if (this.type.equals(SolarPanelType.ThinFilmSolarPanels))
		{

		}
	}

	/*
	 * Generates charge based on environmet. 
	 */
	@Override
	public void generateChargePowerModule(Environment env, double desiredTemp)
	{
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * Generates power depending on the environmental irradiance. 
	 * 
	 * The information in order to do this with accuracy was taken from: 
	 * 		// snow impact   according to : https://www.osti.gov/servlets/purl/5232456
		// density of snow as well as the inches of snow can reduce power output by 70 percent on average. 
		//  Some energy losses due to temperature effects were experienced
		//later in the winter, ranging from a 2% daily loss in January to a 10% loss in
		//April in Utah.
		// taken from table of single snowfalls page 25 
		// 4.3 inches and above caused 100 percent energy loss.
		// 3.1 inches caused 39 percent energy loss. 
		// .5 inches caused 20.1 percent energy loss. 
		
		// January consists of the first 744 hours of the year. So for the first 744 hours IF the location is of the climate zones that have a winter season.  
		
		// Temperature affects are calculated based off of this source: https://www.cedgreentech.com/article/how-does-heat-affect-solar-panel-efficiencies
		// The best way to determine your panel’s tolerance to heat is by looking at the manufacturer’s data sheet. There, you’ll see a term called the “temperature coefficient (Pmax.)”  
		//This is the maximum power temperature coefficient.  It tells you how much power the panel will lose when the temperature rises by 1°C above 25°C. @ STC 
		//(STC is the Standard Test Condition temperature where the module’s nameplate power is determined).  

		//For example, the temperature coefficient of a solar panel might be -.258% per 1 degree Celsius.  So, for every degree above 25°C, the maximum power of the solar panel falls by .258%, 
		//for every degree below, it increases by .258%.   What this means no matter where you are, your panel may be affected by seasonal variations. However, the temperature coefficient also 
		//tells you that efficiency increases in temperatures lower than 25°C.  So, in most climates, the efficiency will balance out over the long run.  

		//For a geographic region where temperatures higher than 25 degrees C. are the norm, one can consider alternatives to Mono or Polycrystalline modules, which have the highest 
		//efficiency (At 1:1 concentration), but also the highest temperature coefficient at PMAX. Project designers may want to consider a thin film or CdTe module – or in the case of a very 
		//large project, High Concentration PV, which is designed for hot climates, but not applicable for small projects. 
	 */
	private void generateMonoCrystallineSolarPower(Environment env)
	{
		// Average wattage of a rooftop solar panel is 350 watts. 
		// cell efficiency * solar irradiance for the hour. 
		// panel purchased at https://www.renogy.com/320-watt-monocrystalline-solar-panel/
		this.maxPower = 320; // Watts
		this.openCircuitVoltage = 40.1; // Volts
		this.maxVoltageVmpp = 1000; // Volts DC
		this.shortCircuitCurrent = 10.36;// amps
		this.maxCurrent = 15; // amps
		//this.nominalVoltage = 
		this.moduleEfficiency = .21;
		this.size = 320;// really same as Max Power in ideal conditions
		//this.capacity = 
		this.price =  329.47; // price per panel 
		this.lifeSpan = 25; // years
		
		List snowFallDataList = env.getSnow();
		
		List temperatureListInCelcius = env.conversion_DegreesF_to_Celcius(env.getDegreesF());
		List solarIrradianceList = env.getIrradiance();
		
		for (int i = 0; i < solarIrradianceList.size(); i++)
		{
			if ((double) snowFallDataList.get(i) > 4.3)
			{
				this.powerProducedByMonoSolarPanels.add(Double.valueOf(0.0));
				MonoSolarPanelPowerLL.append(0.0,  0.0);
			}
			if(((double) snowFallDataList.get(i) > 2.9 && (double) snowFallDataList.get(i) < 3.1))
			{
				double reducedEfficiencyDueTo3p1INCHES = moduleEfficiency - (moduleEfficiency * .39)
						- (moduleEfficiency * .02); // 39 percent losses
				// Object powerProduced = Double.valueOf(reducedEfficiencyDueTo3p1INCHES*
				// (double)solarIrradianceList.get(i));
				this.powerProducedByMonoSolarPanels
						.add(Double.valueOf(reducedEfficiencyDueTo3p1INCHES * (double) solarIrradianceList.get(i)));
				MonoSolarPanelPowerLL.append(reducedEfficiencyDueTo3p1INCHES * (double) solarIrradianceList.get(i), 0.0);
				
			}
			if((double) snowFallDataList.get(i) > .3 && (double) snowFallDataList.get(i) < .5)
			{
				double reducedEfficiencyDueTOhalfINCH = moduleEfficiency - (moduleEfficiency * .21)
						- (moduleEfficiency * .02); // 39 percent losses
				// Object powerProduced = Double.valueOf(( reducedEfficiencyDueTOhalfINCH*
				// (double)solarIrradianceList.get(i)));
				this.powerProducedByMonoSolarPanels
						.add(Double.valueOf((reducedEfficiencyDueTOhalfINCH * (double) solarIrradianceList.get(i))));
				MonoSolarPanelPowerLL.append((reducedEfficiencyDueTOhalfINCH * (double) solarIrradianceList.get(i)), 0.0);

			}
		}

	}

	/*
	 * Prints the solar panel power list. 
	 */
	public void printSolarPanelPowerList()
	{
		this.powerProducedByMonoSolarPanels.forEach(n -> System.out.println(n));
	}

	/*
	 * prints the solar panel linked list. 
	 */
	public void printSolarPanelPowerLinkedList()
	{
		this.MonoSolarPanelPowerLL.printList();
	}
	
	/*
	 * Computes the degradataion. 
	 */
	@Override
	public void computeDegradation(Environment env, Double dateFirstUse, Double lastUsedDate)
	{
		// TODO Auto-generated method stub

	}

	/*
	 * Shows informatio about the solar panels chosen. 
	 */
	@Override
	public String toString()
	{
		return "SolarPanels [maxPower=" + maxPower + ", openCircuitVoltage=" + openCircuitVoltage + ", maxVoltageVmpp="
				+ maxVoltageVmpp + ", shortCircuitCurrent=" + shortCircuitCurrent + ", maxCurrent=" + maxCurrent
				+ ", nominalVoltage=" + nominalVoltage + ", moduleEfficiency=" + moduleEfficiency + ", size=" + size
				+ ", capacity=" + capacity + ", price=" + price + ", lifeSpan=" + lifeSpan + ", CCno1=" + CCno1 + "]";
	}

}
