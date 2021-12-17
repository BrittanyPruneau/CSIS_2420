/**
 * Shows information about biomass systems for the user to choose from. 
 * 
 * @author Brittany Pruneau 
 * 
 */

package finalProject.EnergyModules;

import finalProject.BTUs;
import finalProject.Environment;
import finalProject.Pollution;
import finalProject.Power;

public class BioMassSystems implements Power, Pollution, BTUs  
{
	private BiomassSystemType type;
	private double size; // BTU or Wattage
	private double capacity; // Joules/Hour or Watt hours
	private double totalCost = 94; //  
	private double costPerUnitOfEnergy;
	private double costPerUnitOfPower;
	private double lifeSpan;
	private Environment env;
	private final double tubeDiameter = .04; // meters (phi)
	private final double tubeLength = 18.76; //meters
	private final double volumeOfReactor = .018; //m^3
	private final double areaOccupiedByReactor = 3.67; // m^2
	private final double gasVelocity = 7; 
	private final double liquidVelocity = 3.67; //  m/s
	private final double bioMassConcentration = 6316; // g m^-3 
	private final double volumetricProductivity = 78; 
	private final double specificGrowthRate = 0.02; // h^-1

	/**
	 * @param type
	 * @param size
	 * @param capacity
	 * @param totalCost
	 * @param costPerUnitOfEnergy
	 * @param costPerUnitOfPower
	 * @param lifeSpan
	 */
	public BioMassSystems(BiomassSystemType type, double size, double capacity, double totalCost,
			double costPerUnitOfEnergy, double costPerUnitOfPower, double lifeSpan)
	{
		this.type = type;
		this.size = size;
		this.capacity = capacity;
		this.totalCost = totalCost;
		this.costPerUnitOfEnergy = costPerUnitOfEnergy;
		this.costPerUnitOfPower = costPerUnitOfPower;
		this.lifeSpan = lifeSpan;
	}
	
	/*
	 * Returns the type of biomass system. 
	 */
	public BiomassSystemType getType()
	{
		return type;
	}

	/*
	 * Sets the type of biomass system. 
	 */
	public void setType(BiomassSystemType type)
	{
		this.type = type;
	}

	/*
	 * @returns the size of the biomass system. 
	 */
	public double getSize()
	{
		return size;
	}

	/*
	 * Sets the size of the biomass system. 
	 */
	public void setSize(double size)
	{
		this.size = size;
	}



	/*
	 * Returns the capacity of the biomass system. 
	 */
	public double getCapacity()
	{
		return capacity;
	}

	/*
	 * Sets the capacity of the biomass system. 
	 */
	public void setCapacity(double capacity)
	{
		this.capacity = capacity;
	}

	/*
	 * Returns the total cost of the biomass system. 
	 */
	public double getTotalCost()
	{
		return totalCost;
	}

	/*
	 * Sets the total cost of the biomass system. 
	 */
	public void setTotalCost(double totalCost)
	{
		this.totalCost = totalCost;
	}

	/*
	 * Gets the cost per unit of energy. 
	 */
	public double getCostPerUnitOfEnergy()
	{
		return costPerUnitOfEnergy;
	}

	/*
	 * Sets the cost per unit of energy. 
	 */
	public void setCostPerUnitOfEnergy(double costPerUnitOfEnergy)
	{
		this.costPerUnitOfEnergy = costPerUnitOfEnergy;
	}



	/*
	 * Returns the cost per unit of power. 
	 */
	public double getCostPerUnitOfPower()
	{
		return costPerUnitOfPower;
	}

	/*
	 * Sets the cost per unit of power. 
	 */
	public void setCostPerUnitOfPower(double costPerUnitOfPower)
	{
		this.costPerUnitOfPower = costPerUnitOfPower;
	}



	/*
	 * Returns the lifespan of the system. 
	 */
	public double getLifeSpan()
	{
		return lifeSpan;
	}



	/*
	 * Sets the lifespan of the system. 
	 */
	public void setLifeSpan(double lifeSpan)
	{
		this.lifeSpan = lifeSpan;
	}

	/*
	 * Describe types of biomass system to the user. 
	 */
	public void describeBiomassTypes()
	{
		System.out.println("Which biomass system should you choose? ");
		System.out.println("The type of system best suited to a particular application depends on many factors, "
				+ "including: availability and cost of each type of biomass (e.g. chip, pellet or logs), "
				+ "competing fuel cost (e.g. fuel oil and natural gas), thermal peak and annual load, "
				+ "building size and type, space availability, operation and maintenance (O&M) staff "
				+ "availability, and local emissions regulations.\r\n"
				+ "\r\n"
				+ "For buildings or campuses with more than 100,000 ft² to heat in a moderately cold "
				+ "climate, a system fuelled with wood chips will probably be the most economical, "
				+ "assuming that there is a stable local chip supply. The economics are even better for "
				+ "buildings with a year-round hot water or steam load or when competing against high-priced "
				+ "fossil fuels.\r\n"
				+ "\r\n"
				+ "For buildings less than 10,000 ft² in a moderately cold climate, a wood pellet system "
				+ "might be the best option. These systems can be manually loaded with 40-lb bags of "
				+ "pellets. For larger systems, it is usually best to have pellets delivered in bulk "
				+ "(not bagged), where bulk delivery is available. These systems usually use a pellet "
				+ "silo or bunker to store large quantities of pellets. As a result, the pellets can be "
				+ "automatically conveyed from the silo to the pellet stove, pellet furnace, or pellet boiler.\r\n"
				+ "\r\n"
				+ "Another option for smaller buildings is a cordwood system. The best of these systems "
				+ "have a burner surrounded by a large water jacket. The cordwood is loaded in batches "
				+ "and burned at full fire to heat the water. The hot water is a thermal energy storage "
				+ "medium that is circulated through the building's heaters as controlled by thermostats.\r\n"
				+ "\r\n"
				+ "Some cordwood systems reduce burn rate by throttling combustion air, but this results "
				+ "in low efficiency and very high emissions of particulate matter and unburned hydrocarbons. "
				+ "As a result, these systems are not recommended, and are illegal in many jurisdictions.\r\n"
				+ "\r\n"
				+ "Facilities with a high capacity factor (i.e., high average annual thermal load) are often "
				+ "good candidates for biomass heating. The capital costs for biomass heating systems are "
				+ "significantly higher than the costs for fossil-fuel plants, but savings on fuel use reduce "
				+ "the levelized cost of energy over time. The types of facilities for which biomass is usually "
				+ "a good investment include hospitals, prisons, school campuses, or other institutions where "
				+ "hot water use results in high load for all seasons. Additionally, biomass heating will not "
				+ "be cost effective if the competing heating fuel is significantly more expensive than the "
				+ "biomass feedstock.\r\n"
				+ "\r\n"
				+ "A variety of incentives exist for biomass power, but vary with Federal and state legislation "
				+ "and policies. The Database of State Incentives for Renewables & Efficiency (DSIRE) lists "
				+ "incentives for biomass. The timing of incentive programs often allows less construction "
				+ "time than needed for biomass projects.\r\n"
				+ "\r\n"
				+ "Federal agencies often cannot take direct advantage of financial incentives for renewable "
				+ "energy unless they use a different ownership structure. The Federal Energy Management "
				+ "Program (FEMP)'s Guide to Integrating Renewable Energy in Federal Construction has more "
				+ "information on renewable energy project funding.");
		System.out.println("Biopower technologies convert renewable biomass "
				+ "fuels into heat and electricity using processes like those "
				+ "used with fossil fuels. There are three ways to harvest the "
				+ "energy stored in biomass to produce biopower: burning, "
				+ "bacterial decay, and conversion to a gas or liquid fuel. "
				+ "Biopower can offset the need for carbon fuels burned in power "
				+ "plants, thus lowering the carbon intensity of electricity "
				+ "generation. Unlike some forms of intermittent renewable energy, "
				+ "biopower can increase the flexibility of electricity generation "
				+ "and enhance the reliability of the electric grid.");
		System.out.println();
		System.out.println("Biofuel is energy used for transportation. Biomass is one type of renewable resource that can be "
				+ "converted into liquid fuels—known as biofuels—for transportation. "
				+ "Biofuels include cellulosic ethanol, biodiesel, and renewable "
				+ "hydrocarbon \"drop-in\" fuels. The two most common types of biofuels "
				+ "in use today are ethanol and biodiesel. Biofuels can be used in airplanes "
				+ "and most vehicles that are on the road. Renewable transportation fuels that "
				+ "are functionally equivalent to petroleum fuels lower the carbon intensity of "
				+ "our vehicles and airplanes.");
		System.out.println();
		System.out.println("Biomass thermal space heating technology has evolved to include "
				+ "highly efficient wood stoves, "
				+ "pellet stoves, fireplace inserts, and hydronic heaters ");
		System.out.println("Biomass stoves, pellet stove or wood stove, burn biomass fuel to heat a home or heat water. Biomass fuel includes agricultural "
				+ "crops and trees, wood and wood waste and residues (including wood pellets), plants (including acquating plants), "
				+ "grasses, residues, and fibers.");
		System.out.println();
		System.out.println("The two principal types of chip-fired direct combustion systems are stationary- and "
				+ "traveling-grate combustors, otherwise known as fixed-bed and atmospheric fluidized-bed systems. ");
		System.out.println("FIXED-BED SYSTEMS\r\n"
				+ "There are various configurations of fixed-bed systems, but the common "
				+ "characteristic is that fuel is delivered onto a grate where it reacts with oxygen "
				+ "in the air blown through the firebox. This is an exothermic reaction that produces "
				+ "very hot gases and generates steam in the heat exchanger section of the boiler.");
		System.out.println("ATMOSPHERIC FLUIDIZED-BED SYSTEMS\r\n"
				+ "In either a circulating fluidized-bed or bubbling fluidized-bed system, the biomass "
				+ "is burned in a hot bed of suspended, incombustible particles, such as sand. "
				+ "Fluidized-bed systems generally achieve more complete carbon conversion, resulting "
				+ "in reduced emissions and improved system efficiency. In addition, compared to fixed-bed "
				+ "systems, fluidized-bed boilers can use a wider range of feedstocks. "
				+ "Fluidized-bed systems also have a higher electric load than fixed-bed systems due to "
				+ "increased fan power requirements.");
		System.out.println("Biomass GASIFICATION systems are similar to combustion systems, except that the quantity of air is limited. This process converts the biomass to a hot gas, which can be combusted in a boiler.\r\n"
				+ "\r\n"
				+ "The efficiency of a direct combustion system is influenced by a number of "
				+ "factors, including biomass moisture content, combustion air distribution and "
				+ "amounts (excess air), operating temperature and pressure, and flue gas (exhaust) "
				+ "temperature. A typical biomass system operating on fuel with a moisture content of 40% "
				+ "has a net efficiency of about 60% to 65%. Although the wood can be dried before combustion "
				+ "to increase efficiency, this is not typically done in practice because of the need for additional "
				+ "equipment and higher initial cost.");
		System.out.println();
		System.out.println("While thre is a lot of information about biomass, a very good document to read can be found at"
						+"https://www.auri.org/wp-content/uploads/2016/06/Biomass-Cooling_Final.pdf ");
		System.out.println("Below is a list of well researched and tested biomass cooling systems");
		System.out.println("Absorption chillers utilize a heat source from the biomass boiler in a thermodynamic cycle for the cooling\r\n"
				+ "process. Possible heat sources are district heating plants based on fossil or renewable fuel, waste heat or\r\n"
				+ "solar heat. The thermodynamic cycle of absorption chillers is due to a refrigerant and a solvent. The\r\n"
				+ "refrigerant must be completely soluble in the solvent. Absorption chillers based on lithium bromide and\r\n"
				+ "water achieve cold water temperatures of 102.2 degrees Fahrenheit (39 Celsius) while the minimum\r\n"
				+ "temperature of the heat source needs to be 167 degrees Fahrenheit (75 degrees Celsius). To achieve\r\n"
				+ "lower temperatures with absorption chillers, the application of ammonia as the refrigerant and water as\r\n"
				+ "the solvent, along with higher temperatures of the heat source are required.\r\n"
				+ "The achievable temperature difference between the feed and return flow of a district cooling system is\r\n"
				+ "considerably lower compared to district heating systems. District heating and/or cooling is a centralized \r\n"
				+ "23\r\n"
				+ "system used to supply multiple buildings. The air conditioning of buildings, which is the most relevant\r\n"
				+ "cooling application, requires feed temperatures of approximately 42.8 to 53.6 degrees Fahrenheit (6 to\r\n"
				+ "12 degrees Celsius). Hence, the flow rate in district cooling systems increases and larger pipe diameters\r\n"
				+ "are required compared to district heating networks. Furthermore, the investment costs and the\r\n"
				+ "operational costs increase due to pipe size and increased pumping. The trend of the daily cooling demand\r\n"
				+ "of a district cooling system typically shows rather high short-term peak loads. The integration of storage\r\n"
				+ "tanks is a feasible option to meet the peak cooling needs");
	}
	/*
	 * Gets the environment.
	 */
	public Environment getEnvironment()
	{
		return this.env;
	}
	
	
	@Override
	public void generateChargePowerModule(Environment env)
	{
		// TODO Auto-generated method stub
		
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
	public void computeDegradation(Environment env, Double dateFirstUse, Double lastUsedDate)
	{
		// TODO Auto-generated method stub
		
	}

	/*
	 * generates energy, depending on which biomass system the user has chosen. 
	 */
	@Override
	public void generateChargeEnergyModule(Environment env)
	{
		if(this.type.equals(BiomassSystemType.BioFuel_ALGAE))
		{
			generateBiofuelfromAlgae(env); 
		}
		if(this.type.equals(BiomassSystemType.BiomassCoolingABSORPTION_CHILLER))
		{
			
		}
		if(this.type.equals(BiomassSystemType.biomassGASIFICATION_BOILER))
		{
			
		}
		if(this.type.equals(BiomassSystemType.BiomassThermalEnergyDirectionCombustionATMOSPHERIC_FLUIDIZED))
		{
			
		}
		if(this.type.equals(BiomassSystemType.BiomassThermalEnergyDirectionCombustionFixedBed))
		{
			
		}
		if(this.type.equals(BiomassSystemType.BioPower))
		{
			
		}
		if(this.type.equals(BiomassSystemType.PELLET_STOVE))
		{
			
		}
		if(this.type.equals(BiomassSystemType.WOOD_STOVE))
		{
			
		}	
	}

	/*
	 * /*
		 * The information for how I have generated the amount of biofuel from algae production is explained in the article below. 
		 * algae species. see page 7, 11 and 15 [online] Design and optimization of artificial cultivation units for algae production
		 *  https://pdf.sciencedirectassets.com/271090/1-s2.0-S0360544214X00150/1-s2.0-S0360544214006963/main.pdf?X-Amz-Security-Token=IQoJb3JpZ2luX2VjEOr%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJHMEUCIBCGz31mA0CapH%2Bc0ExmIEsBQiD%2Bi%2BhkAlogHp5GIMPdAiEAn6%2Fe13viVffqe59R2OBA77HvQkh2WeCNJPEINUH7RFkqgwQIsv%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARAEGgwwNTkwMDM1NDY4NjUiDHh9Vqw%2F7rCrd5WUwSrXA8Pws6NtMkV%2F8%2Frf3ZTulys7NScUBXrHDEyDJAEkcMwIW2ZXk7GWad0qffB4mP7PYs%2BEoXLZTJcvYBJPfBd3JJpNb4dxvcBCWu4moK9REajeu5olyt32S4et8nCT6d4VNUSkK0XBUWB%2FYlg5w1znt0fe%2BgswKRNNKaeKzDEYeSfjnggH1rHFTsOH4sVlYGPL3EwD5NXRo1htRP%2BRUWzF5Sp3Yg8ibadXljbQNh5L8aNlnfdA7E4EDXR%2BK8V3MaxzcfzzSgWGk6GqRhij793wxIpfHu1OeGw6GFaJDVNLmdL2mxtEXtl61gZhX3rtd9LwYfkt%2FqjYtSWS7UcVcVV8cbV%2BjfNrXCQq5yUZ8JpYjKP3sh7Fo%2BK8bjlwGah7D0cJCviYzpU2Z7TDo6aj8JbXWjeLvFefcuYFhueYWXNmrAyUzw3QYY3zej%2BNgE1emzA06wMWMXH2LJtyoK5BW6wWLSuMufxlCTB1ZN6JHxVgpV3UgT%2FoM1INXOXdr%2FNqdf6c0zqLAVZTGNoA%2BRX2l7NPd4OgQtFq0%2BI75OVC%2BVnfpPtw9TUgAYmoOg0pZcHSeazWa4XeL90WSFmrtIco2ySzHIt5MiIxP2HwOVBYDBCVQnXCe%2BXqfDDDZDCYr4uNBjqlAb1%2FdlFGcj5r3O0jQBVkxtRCV%2Fzxx3InjKnh4jakYsX0zatQPZvA0pJK22Ul9OoLPwPBGm4rd23Msosm5XouOiy2zYS9%2BuDMRNWONr%2BM1iUP2kgto5Vnjwwm5h3XWVtDfnP5sxOlMteUCM9HMANDI3K89qDVZ2qpU1r7H65vbI7hoStmUYlVAf5KwMM%2B8KeJEkNx1jF%2F0zb7YiC7iL9KkSS8vUVpTQ%3D%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20211128T022631Z&X-Amz-SignedHeaders=host&X-Amz-Expires=300&X-Amz-Credential=ASIAQ3PHCVTY4J656AVX%2F20211128%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Signature=fe166de9a5880c73ce74574eecd85304a8877b05770bb992a36b37db301089ed&hash=0a44a76da1a1927e464ce88e4bc055860549fc8289b5bd209df7a371044e4b11&host=68042c943591013ac2b2430a89b270f6af2c76d8dfd086a07176afe7c76c2c61&pii=S0360544214006963&tid=spdf-fa304173-0560-4e2f-b1c6-18a705e10d8f&sid=55132a7d5da1334a687ac8b5bfb2cbfcdf97gxrqa&type=client
		 */
		
		/*
		 * Summary of the case study: 
		 * In the case study, the influence of two
		 * marine-water species (Phaeodactylum tricornutum and Isochrysis galbana) and
		 * four geographical locations (Tulsa, USA; Hyderabad, India; Cape Town, South
		 * Africa; and Rio-de-Janeiro, Brazil) on the design of PBRs was investigated.
		 * The necessary parameters for the model described in Section 2 are lipid
		 * content (OCs), light absorption coefficient (Ka), percentage of dry algae
		 * present in algae biomass (%s), species dependent constant (Ik), latitude,
		 * longitude, and time zone. The relevant data for the two marine-water species
		 * considered in the case study are listed in Table A1. The species specific
		 * constants a and b shown in Eq. (17) are estimated by nonlinear regression
		 * analysis on experimental data given in Ref. [84] where eight species of
		 * marine phytoplankton were grown at different temperatures ranging from 10 to
		 * 25 C. Fig. A1 shows the graphical representation of our regression analysis
		 * for Phaeodactylum tricornutum and Isochrysis galbana species. Figure shows
		 * that maximum specific growth rate is exponentially dependent on reactor
		 * temperature. The four locations and their corresponding data are listed in
		 * Table A2. Maximum and minimum temperatures of the selected 12 days (obtained
		 * from a weather website called WeatherSpark [85]) at these locations are shown
		 * in Table A3. The model parameters and cost coefficients such as equipment
		 * costs and electricity costs that are used for the case studies are summarized
		 * in Table A4 and Table A5, respectively. The biodiesel demand in Eq. (55) is
		 * 34,386 g y1 based on [36].
		 * 
		 */
		
		/*
		 * The results reveal that the higher the liquid velocity, the higher the growth
		 * rate and volumetric productivity of algae biomass becomes, yielding the
		 * highest growth rate and productivity of Case SA3 with a velocity of 0.95 m s1.
		 *  
		 * This increase in growth rates and productivities are due to better mixing
		 * of the culture at higher liquid velocities, which facilitates better light
		 * distribution inside the PBR.
		 */
		//env.irradiance.getIrradiance();
		//env.getTemperatures().farenheitToDegreesCelcius();
	 
	/*
	 * Generates biofuel from algae. 
	 */
	public void generateBiofuelfromAlgae(Environment env)
	{
		//TODO
	}

	/*
	 * Shows current level of BTU
	 */
	@Override
	public void showCurrentBTUlevel()
	{
		// TODO Auto-generated method stub
		
	}

	/*
	 * Computes the degreadation of the system. 
	 */
	@Override
	public void computeDegradation(Environment env)
	{
		// TODO Auto-generated method stub
		
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
	 * Displays information about he biogas system. 
	 */
	@Override
	public String toString()
	{
		return "BioMassSystems [type=" + type + ", size=" + size + ", capacity=" + capacity + ", totalCost=" + totalCost
				+ ", costPerUnitOfEnergy=" + costPerUnitOfEnergy + ", costPerUnitOfPower=" + costPerUnitOfPower
				+ ", lifeSpan=" + lifeSpan + "]";
	}

	/*
	 * Charges the module. 
	 */
	@Override
	public void generateChargePowerModule(Environment env, double desiredTemp)
	{
		// TODO Auto-generated method stub
		
	}
	
	
}
