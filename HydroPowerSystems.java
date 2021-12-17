/**
 * Provides the necessary information about hydropower systems and the functionality to generate power use. 
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

public class HydroPowerSystems implements Power, Pollution
{
	private double size; // kW or MW
	private HydroPowerTypes type; 
	private double price; 
	private double lifeSpan; 
	public WattsBTUsLinkedList HydroPowerLL = new WattsBTUsLinkedList();
	public List <Double> ElectricityGenerated = new ArrayList<Double>();

	/**
	 * @param size
	 * @param type
	 * @param price
	 * @param lifeSpan
	 */
	public HydroPowerSystems(double size, HydroPowerTypes type, double price, double lifeSpan)
	{
		this.size = size;
		this.type = type;
		this.price = price;
		this.lifeSpan = lifeSpan;
	}

	public void showHydroPowerSystems()
	{
		// Mechanical Power
		System.out.println("One way of utilizing hydropower is for mechanical purposes.");
		//Watermills
		System.out.println(
				"A watermill or water mill is a mill that uses hydropower. It is a structure that uses a water wheel or "
						+ "water turbine to drive a mechanical process such as milling (grinding), rolling, or hammering. Such "
						+ "processes are needed in the production of many material goods, including flour, lumber, paper, textiles,"
						+ " and many metal products. These watermills may comprise gristmills, sawmills, paper mills, textile mills, "
						+ "hammermills, trip hammering mills, rolling mills, wire drawing mills.\r\n" + "\r\n"
						+ "One major way to classify watermills is by wheel orientation (vertical or horizontal), one "
						+ "powered by a vertical waterwheel through a gear mechanism, and the other equipped with a horizontal "
						+ "waterwheel without such a mechanism. The former type can be further divided, depending on where the "
						+ "water hits the wheel paddles, into undershot, overshot, breastshot and pitchback (backshot or reverse "
						+ "shot) waterwheel mills. Another way to classify water mills is by an essential trait about their "
						+ "location: tide mills use the movement of the tide; ship mills are water mills onboard (and constituting) "
						+ "a ship.\r\n" + "\r\n"
						+ "Watermills impact the river dynamics of the watercourses where they are installed. During the time "
						+ "watermills operate channels tend to sedimentate, particularly backwater.[29] Also in the backwater area, "
						+ "inundation events and sedimentation of adjacent floodplains increase. Over time however these effects are "
						+ "cancelled by river banks becoming higher.[29] Where mills have been removed, river incision increases and "
						+ "channels deepen.");
		// Compressed Air
		System.out.println("Another use for hydropower is to create compressed air!");
		System.out.println(
				"A plentiful head of water can be made to generate compressed air directly without moving parts. "
						+ "In these designs, a falling column of water is deliberately mixed with air bubbles generated through turbulence "
						+ "or a venturi pressure reducer at the high-level intake. This allows it to fall down a shaft into a subterranean, "
						+ "high-roofed chamber where the now-compressed air separates from the water and becomes trapped. The height of the "
						+ "falling water column maintains compression of the air in the top of the chamber, while an outlet, submerged below "
						+ "the water level in the chamber allows water to flow back to the surface at a lower level than the intake. A "
						+ "separate outlet in the roof of the chamber supplies the compressed air. A facility on this principle was built "
						+ "on the Montreal River at Ragged Shutes near Cobalt, Ontario in 1910 and supplied 5,000 horsepower to nearby mines");
		
		// Electricity 
		System.out.println("Hydroelectric power plants vary in terms of the way they harvest energy. One type involves a dam and a reservoir. "
				+ "The water in the reservoir is available on demand to be used to generate electricity by passing through channels that connect "
				+ "the dam to the reservoir. The water spins a turbine, which is connected to the generator that produces electricity.[28]\r\n"
				+ "\r\n"
				+ "The other type is called a run-of-river plant. In this case, a barrage is built to control the flow of water, absent a "
				+ "reservoir. The run-of river power plant needs continuous water flow and therefore has less ability to provide power on "
				+ "demand. The kinetic energy of flowing water is the main source of energy.[28]\r\n"
				+ "\r\n"
				+ "Both designs have limitations. For example, dam construction can result in discomfort to nearby residents. The dam and "
				+ "reservoirs occupy a relatively large amount of space that may be opposed by nearby communities.[32] Moreover, reservoirs "
				+ "can potentially have major environmental consequences such as harming downstream habitats.[28] On the other hand, the "
				+ "limitation of the run-of-river project is the decreased efficiency of electricity generation because the process depends "
				+ "on the speed of the seasonal river flow. This means that the rainy season increases electricity generation compared to "
				+ "the dry season.[33]\r\n"
				+ "\r\n"
				+ "The size of hydroelectric plants can vary from small plants called micro hydro, to large plants supply that power to a "
				+ "whole country. As of 2019, the five largest power stations in the world are conventional hydroelectric power stations "
				+ "with dams.[34]\r\n"
				+ "\r\n"
				+ "Hydroelectricity can also be used to store energy in the form of potential energy between two reservoirs at different "
				+ "heights with pumped-storage. Water is pumped uphill into reservoirs during periods of low demand to be released for "
				+ "generation when demand is high or system generation is low.\r\n"
				+ "\r\n"
				+ "Other forms of electricity generation with hydropower include tidal stream generators using energy from tidal power "
				+ "generated from oceans, rivers, and human-made canal systems to generating electricity.");
		//Rain Power
		System.out.println("Rain has been referred to as \"one of the last unexploited energy sources in nature. When it rains, billions "
				+ "of litres of water can fall, which have enormous electric potential if used in the right way.\"[35] Research is being"
				+ " done into the different methods of generating power from rain, such as by using the energy in the impact of raindrops. "
				+ "This is in its very early stages with new and emerging technologies being tested, prototyped and created. Such power "
				+ "has been called rain power.[36][37] One method in which this has been attempted is by using hybrid solar panels called "
				+ "\"all-weather solar panels\" that can generate electricity from both the sun and the rain.[38]\r\n"
				+ "\r\n"
				+ "According to zoologist and science and technology educator, Luis Villazon, \"A 2008 French study estimated that you "
				+ "could use piezoelectric devices, which generate power when they move, to extract 12 milliwatts from a raindrop. Over "
				+ "a year, this would amount to less than 0.001kWh per square metre – enough to power a remote sensor.\" Villazon "
				+ "suggested a better application would be to collect the water from fallen rain and use it to drive a turbine, with "
				+ "an estimated energy generation of 3kWh of energy per year for a 185m2 roof.[39] A microturbine-based system created"
				+ " by three students from the Technological University of Mexico has been used to generate electricity. The Pluvia "
				+ "system \"uses the stream of rainwater runoff from houses' rooftop rain gutters to spin a microturbine in a cylindrical "
				+ "housing. Electricity generated by that turbine is used to charge 12-volt batteries.\"[40]\r\n"
				+ "\r\n"
				+ "The term rain power has also been applied to hydropower systems which include the process of capturing the rain");
	}
	
	/*
	 * Returns size 
	 */
	public double getSize()
	{
		return size;
	}

	/*
	 * Sets size
	 */
	public void setSize(double size)
	{
		this.size = size;
	}

	/*
	 * Gets type of Hydropower type. 
	 */
	public HydroPowerTypes getType()
	{
		return type;
	}

	/*
	 * Sets HydropowerTypes
	 */
	public void setType(HydroPowerTypes type)
	{
		this.type = type;
	}

	/*
	 * Returns the price of the system. 
	 */
	public double getPrice()
	{
		return price;
	}

	/*
	 * Sets the price of the system. 
	 */
	public void setPrice(double price)
	{
		this.price = price;
	}

	/*
	 * Gets the life span of the system. 
	 */
	public double getLifeSpan()
	{
		return lifeSpan;
	}

	/*
	 * Sets the life span of the system. 
	 */
	public void setLifeSpan(double lifeSpan)
	{
		this.lifeSpan = lifeSpan;
	}

	/*
	 * Shows the annual pollution from electricity usage. 
	 */
	@Override
	public void showAnnualPollutionFromElectricityUse(Environment env, Double yearlyElectricity)
	{
		// TODO Auto-generated method stub
		
	}

	/*
	 * Shows the annual pollution from natural gas usage. 
	 */
	@Override
	public void showAnnualPollutionFromNaturalGasUsage(Environment env, Double yearlyElectricity)
	{
		// TODO Auto-generated method stub
		
	}

	/*
	 * Shows current voltage of the system.
	 */
	@Override
	public void showCurrentVoltagelevel()
	{
		// TODO Auto-generated method stub
		
	}

	/*
	 * Shows current of the system.
	 */
	@Override
	public void showPresentCurrentLevel()
	{
		// TODO Auto-generated method stub
		
	}

	/*
	 * Charges the module. 
	 */
	@Override
	public void generateChargePowerModule(Environment env, double desiredTemp)
	{
		
	}
	
	/*
	 * Uses environment information in order to generate power. 
	 */
	@Override
	public void generateChargePowerModule(Environment env)
	{
		// Calculating the amount of available power
		// TODO https://en.wikipedia.org/wiki/Hydropower
		
		if(this.type == HydroPowerTypes.Watermills)
		{
			runWaterMill((env));
		}
		if(this.type == HydroPowerTypes.CompressedAir)
		{
			generateCompressedAir(env);
		}
		if(this.type == HydroPowerTypes.HydroElectricity)
		{
			generateElectricity(env);
		}
		
	}

	/*
	 * Generates Electricity from HydroPower
	 * 		// https://www.open.edu/openlearn/ocw/mod/oucontent/view.php?id=73762&section=6.2
		// The information used in order to calculate the amount of electricity generated 
		// by a micro hydro generator is taken from the above resource.
		// Effective head: 25meters
		// turbo generator efficiency: .85
		// flow rate = 600 litres/min -> .010 cubic meters per second
		// 1000 * .85 * .010 * 25 = 
		// power(Watts) = 1000 * generator efficiency * m^3 per second flow rate * effective head; 
		// stream flow datasheet was taken from : https://www.sciencebase.gov/catalog/item/5d5c3770e4b01d82ce8fc0a6
		
		// Energy.gov "A drop-in-the-creek turbine that can generate power from a stream with as little as 13 inches 
		//of water and no head. Output from the Jack Rabbit is a maximum of 100 Watts, so daily output averages 1.5–2.4 
		//kilowatt-hours, depending on your site. Sometimes referred to as the Aquair UW Submersible Hydro Generator."
		
		
		// temporarily using generatorEfficiency .85;
	 */
	private void generateElectricity(Environment env)
	{	
		List headData = env.getWaterDataheightHeads();
		List flowData_metersPerSecond = env.conversion_Cubic_Feet_Sec_2metersPerSecond(env.getWaterDataFlowRates());
		
		for(int i = 0; i<env.getWaterDataheightHeads().size(); i++)
		{
			this.ElectricityGenerated.add(Double.valueOf(1000*(double)flowData_metersPerSecond.get(i)*.85*(double)headData.get(i))); //Watts per hour
			this.HydroPowerLL.append(1000*(double)flowData_metersPerSecond.get(i)*.85*(double)headData.get(i), 0);
		}	
	}
	
	/*
	 * Prints a linked list of power generated.
	 */
	public void printHydroPowerLL()
	{
		this.HydroPowerLL.printList();
	}

	/*
	 * Prints a list of electricity generated. 
	 */
	public void printHydroPowerList()
	{
		this.ElectricityGenerated.forEach(n ->System.out.println(n));
	}
	/*
	 * Produces Compressed Air from HydroPower
	 */
	private void generateCompressedAir(Environment env)
	{
		// TODO Auto-generated method stub
	}

	/*
	 * Runs a Water Mill 
	 */
	private void runWaterMill(Environment environment)
	{
		// TODO Auto-generated method stub
	}

	/*
	 * Shows the degradataion of the system. 
	 */
	@Override
	public void computeDegradation(Environment env, Double dateFirstUse, Double lastUsedDate)
	{
		// TODO Auto-generated method stub
	}
	
	@Override
	public String toString()
	{
		return "HydroPowerSystems [size=" + size + ", type=" + type + ", price=" + price + ", lifeSpan=" + lifeSpan
				+ ", HydroPowerLL=" + HydroPowerLL + ", ElectricityGenerated=" + ElectricityGenerated + "]";
	}

}
