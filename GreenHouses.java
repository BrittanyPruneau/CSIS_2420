/**
 * Defines different types of green houses and information about green houses for which the user will choose from. 
 * 
 * @author Brittany Pruneau 
 * 
 */

package finalProject;

public class GreenHouses implements BTUs
{
	GreenHouseTypes typeOfGreenHouse;
	double price;
	Enum GreenHouseMaterialTypes;
	Double RValue;
	Double cubicFootage;
	
	
	/**
	 * @param price
	 * @param greenHouseMaterialTypes
	 * @param size
	 */
	public GreenHouses(GreenHouseTypes typeGR, double price, GreenHouseMaterialTypes type, Double length, Double width, Double height)
	{
		this.typeOfGreenHouse = typeGR;
		this.price = price;
		this.GreenHouseMaterialTypes = type;
		this.cubicFootage = length*width*height;
		determineRvalueOfMaterialUsed(type);
	}

	
	
	public void determineRvalueOfMaterialUsed(GreenHouseMaterialTypes material)
	{
		if(material.equals(material.PolyCarbonate6mmTwinWall))
		{
			this.RValue = 1.54;
		}
		if(material.equals(material.PolyCarbonate8mmTrimWall))
		{
			this.RValue = 1.69;
		}
		if(material.equals(material.PolyCarbonate8mmTwinWall))
		{
			this.RValue = 1.54;
		}
		if(material.equals(material.DoubleGlass))
		{
			this.RValue = 2.0;
		}
		if(material.equals(material.FiberglassGlazingSingleLayer))
		{
			this.RValue = .83;
		}
		if(material.equals(material.AcrylicTwinWall))
		{
			this.RValue = 1.82;
		}
		if(material.equals(material.PolyethyleneDouble6mm))
		{
			this.RValue = 1.7;
		}
		if(material.equals(material.DoubleGlassLayerLowE))
		{
			this.RValue = 2.5;
		}
	}
	
	public void GreenHouseTypeDetails()
	{
		//menu for user
		// ask for 
		// HighTunnel - Double wall inflateable roof and sides.
		// material - can use all of them. 
		// size - sq ft
		//shape
		// R value and U value 
		
		// EastPoint
		// // All materials
		// sizes
		
		//NorthEaster
		// All materials
		
		
		// heat needed per cubic foot depending on your k value, R value, u value, c value, baseline temperature, temperature outside. 
		// higher than 90 turn vent on. 
		// lower than 80 heater with some other means--> Rocket Stove with percolation water heater (BTUs) thermal conductivity of water.
	}
	
	public void displayGreenHouseTypes()
	{
		//create a menu for user to choose from
		getHighTunnelInfo();
		getLowTunnelInfo();
		getRollingGreenHouseInfo();
		getPolyCarbonateGreenHouseInfo();
	
	}

	
	
	private void getPolyCarbonateGreenHouseInfo()
	{
		System.out.println("Polycarbonate greenhouses help diffuse light more evenly than glass greenhouses, which helps plants thrive and even grow faster. Polycarbonate protects plants from excessive sunlight or radiation as it naturally offers UV protection.");
		
	}

	private void getRollingGreenHouseInfo()
	{
		System.out.println("Rolling Greenhouse benches allow operations to improve functionality by creating moveable aisles and allowing operations to quickly change their layout. ... The bench frames are constructed from 1.25\", 14-gauge galvanized steel and the 4\" side rails are made from extruded aluminum.");
		
	}

	private void getLowTunnelInfo()
	{
		System.out.println("Low tunnels are basically mini-greenhouses. They warm the soil and provide a temperate micro-climate for growing vegetables. Even though there may be snow on the ground, the temperature under the low tunnel is often just right for growing cool-season vegetables such as kale, beets, and spinach.");
		
	}

	private void getHighTunnelInfo()
	{
		System.out.println("High tunnels are an increasingly popular trend for growers and a proven technology for crop production. The term “high tunnel” is a loosely defined phrase for growing fruits and vegetables in greenhouses, although some high tunnels are used for cut flower production. High tunnels may be used to extend the growing season by providing protection for early- or late-season production, or they may be used for year-round growing. High tunnels are becoming increasingly popular due to the low start-up cost and quick rate of return on investment.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "High tunnels were originally greenhouses with high sidewalls to enable tractors and tillers to easily enter and exit greenhouses from either end. These greenhouses were simple in design, with usually just one layer of poly, roll-up curtains and no electricity. Some of these greenhouses only had poly on them for a few weeks before the warmer weather allowed the cover to be removed safely without any damage to the crops. High tunnel greenhouses enabled local growers to produce crops during all four seasons and helped combat the forces of unpredictable weather, particularly in the early spring.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Today’s high tunnels may be as simple as a greenhouse frame with one layer of poly and roll-up curtains, or a more sophisticated greenhouse that is “moveable” and has roof vents, year-round covering, an irrigation system and heat. These freestanding greenhouses are available in all different widths and lengths. The most common use of a high tunnel is for tomato production, and is usually a 30-foot by 96-foot greenhouse; however, many other crops are being grown in greenhouses, including cucumbers, lettuce, strawberries, raspberries and herbs. Recognizing this trend in growing, seed companies have began to specialize in offering greenhouse-grown seed varieties and other unique varieties for heirloom and organic growing. High tunnels are all customized to meet the individual grower’s needs and are specific to the crop that is being produced.");
		
	}

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

	/**
	 * @return the price
	 */
	public double getPrice()
	{
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price)
	{
		this.price = price;
	}

	/**
	 * @return the greenHouseMaterialTypes
	 */
	public Enum getGreenHouseMaterialTypes()
	{
		return GreenHouseMaterialTypes;
	}

	/**
	 * @param greenHouseMaterialTypes the greenHouseMaterialTypes to set
	 */
	public void setGreenHouseMaterialTypes(Enum greenHouseMaterialTypes)
	{
		GreenHouseMaterialTypes = greenHouseMaterialTypes;
	}

	/**
	 * @return the rValue
	 */
	public Double getRValue()
	{
		return RValue;
	}

	/**
	 * @param rValue the rValue to set
	 */
	public void setRValue(Double rValue)
	{
		RValue = rValue;
	}

	/**
	 * @return the cubicFootage
	 */
	public Double getCubicFootage()
	{
		return cubicFootage;
	}

	/**
	 * @param cubicFootage the cubicFootage to set
	 */
	public void setCubicFootage(Double cubicFootage)
	{
		this.cubicFootage = cubicFootage;
	}



	@Override
	public String toString()
	{
		return "GreenHouses [typeOfGreenHouse=" + typeOfGreenHouse + ", price=" + price + ", GreenHouseMaterialTypes="
				+ GreenHouseMaterialTypes + ", RValue=" + RValue + ", cubicFootage=" + cubicFootage + "]";
	}
	
	
	
}
