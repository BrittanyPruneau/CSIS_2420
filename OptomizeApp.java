package finalProject;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import finalProject.EnergyModules.BioMassSystems;
import finalProject.EnergyModules.BiomassSystemType;
import finalProject.EnergyModules.GeothermalEnergySystems;
import finalProject.EnergyModules.GeothermalUses;
import finalProject.EnergyModules.HydroPowerSystems;
import finalProject.EnergyModules.HydroPowerTypes;
import finalProject.EnergyModules.SolarEnergyDesigns;
import finalProject.EnergyModules.SolarEnergySystems;
import finalProject.EnergyModules.SolarPanelType;
import finalProject.EnergyModules.SolarPanels;
import finalProject.EnergyModules.TurbineTypes;
import finalProject.EnergyModules.WindTurbines;


/**
 * This project will take in environmental data from many different txt files and generate power using many 
 * different types of "reneweable" modules using this information. 
 * 
 * @author Brittany Pruneau
 *
 */
public class OptomizeApp
{
public static Environment env1;
public static GeothermalEnergySystems geothermalTest;
public static GeothermalEnergySystems geothermalTestElectricity;
public static GeothermalEnergySystems geothermalTestDesalination;
public static HydroPowerSystems hydroTest;
public static HydroPowerSystems hydroTestusingElectricity;
public static HydroPowerSystems hydroTesttoGenerateCompressedAir;
public static SolarEnergySystems solarTest;
public static SolarEnergySystems solarEnergySystemsTest;
public static SolarEnergySystems solarEnergySystemsTest2;
public static SolarPanels monoSolar;
public static WindTurbines turbineType;
public static WindTurbines turbineType2;
public static BioMassSystems biomassDesign2;
public static BioMassSystems biomassDesign3;
public static BioMassSystems biomassDesign4;
public static BioMassSystems biomassDesign5;
public static BioMassSystems biomassDesign6;
public static BioMassSystems biomassDesign7;
public static BioMassSystems biomassDesign8;
public static long duration;
public static double seconds;

	public static void main(String[] args)
	{		
		Scanner  input = new Scanner(System.in);
		boolean quit = false; 
		int choice; 
		do
		{
			displayMenu(); 
			choice = input.nextInt();
			 
			switch(choice)
			{
			case 1: 
				env1 = GenerateEnergyFarm();
				break;
			case 2: 
				reportSizeOfDataSets();
				break;
			case 3: 
				energyUsingGreenHouses();
				break;
			case 4: 
				showPowerProducingModules();
				break;
			case 5: 
				System.out.println();
				System.out.println("Generating power from the modules listed above! ");
				generatePowerUsingTheseModules();
				break;
			case 6:
				int nanoDivisor = 1000000000;
				long start = System.nanoTime();
				showBinaryTrees8760HoursOf1Year();
				long end = System.nanoTime();
				duration = end - start;
				seconds = (double)duration/nanoDivisor;
				break;
			case 7:
				 System.out.printf("Time: accounts : Duration: %,d nanoseconds [%.10f seconds]%n", duration, seconds);
				break;
			case 8: 
				System.out.println("Exited");
				quit = true; 
				break; 
			default: 
				System.out.println("Invalid choice. ");
			}
			System.out.println("\n\n\n");
		}
			while(!quit);
			System.out.println("\n\nGoodbye!");
			input.close(); 	
		
	
	}

	/*
	 * Shows binary search trees over 8760 hours throughout the year comparing power produced by solar, wind, and hydroelectric. 
	 */
	public static void showBinaryTrees8760HoursOf1Year()
	{
		LinkedListOfPowerAndWattsBinarySearchTrees GODofAllHoliness = new LinkedListOfPowerAndWattsBinarySearchTrees();
		WattBTUNode currentWindNode = turbineType2.windPowerGeneratedLL.head;
		System.out.println("Size of wind turbine linked list: ");
		
		System.out.println("size size size size");
		System.out.println();
		System.out.println("Here is the length for solar: " + monoSolar.MonoSolarPanelPowerLL.length());
		System.out.println("Here is the length for hydro: " + hydroTestusingElectricity.HydroPowerLL.length());
		System.out.println("Here is the length for wind: " + turbineType2.windPowerGeneratedLL.length());
		
		WattBTUNode currentSolarNode = 	monoSolar.MonoSolarPanelPowerLL.head;
		WattBTUNode currentHydroNode = hydroTestusingElectricity.HydroPowerLL.head;
		while(currentSolarNode.next != null)
		{
			PowerBinarySearchTree powerBST = new PowerBinarySearchTree();
			powerBST.insert(currentWindNode.watts, currentWindNode.BTUs);
			powerBST.insert(currentSolarNode.watts, currentSolarNode.BTUs);
			powerBST.insert(currentHydroNode.watts, currentHydroNode.BTUs);
			
			BTUBinarySearchTree btuBST = new BTUBinarySearchTree();
			btuBST.insert(currentWindNode.watts, currentWindNode.BTUs);
			btuBST.insert(currentSolarNode.watts, currentSolarNode.BTUs);
			btuBST.insert(currentHydroNode.watts, currentHydroNode.BTUs);
					
			GODofAllHoliness.append(powerBST, btuBST); /////////// START HERE
			currentWindNode = currentWindNode.next;
			currentSolarNode = currentSolarNode.next;
			currentHydroNode = currentHydroNode.next;
		}
		System.out.println("donZZZZZZ");
		System.out.println("LENGTHHHHHHHHHHHHHHHHHHHHH of god of all holiness");
		System.out.println(GODofAllHoliness.length());

		
		GODofAllHoliness.printList();
	}

	/*
	 *	Generates power at the users demand.
	 */
	public static void generatePowerUsingTheseModules()
	{
		geothermalTest.generateChargeEnergyModule(env1);

		hydroTestusingElectricity.generateChargePowerModule(env1);      ///// here!
		
		System.out.println("Hydropower Linked List");
		//hydroTestusingElectricity.printHydroPowerLL();
		System.out.println("Arraylist of hydropower data: ");
		//hydroTestusingElectricity.printHydroPowerList();
		
			
		monoSolar.generateChargePowerModule(env1);
		System.out.println("Print power list =] ");
		//monoSolar.printSolarPanelPowerList();
		System.out.println();
		//monoSolar.printSolarPanelPowerLinkedList();
		
		turbineType2.generateChargePowerModule(env1);
		//turbineType2.printVerticalWindPowerList();
		//turbineType2.printVerticalWindPowerLL();

		
		biomassDesign2.generateBiofuelfromAlgae(env1);
	}

	/*
	 * Shows information about the power producing modules. 
	 */
	private static void showPowerProducingModules()
	{
		 biomassDesign2 = new BioMassSystems(BiomassSystemType.BiomassCoolingABSORPTION_CHILLER, 256.36, 256.36, 256.36, 256.36, 256.36,256.36);
		 biomassDesign3 = new BioMassSystems(BiomassSystemType.biomassGASIFICATION_BOILER, 256.36, 256.36, 256.36, 256.36, 256.36,256.36);
		 biomassDesign4 = new BioMassSystems(BiomassSystemType.BiomassThermalEnergyDirectionCombustionATMOSPHERIC_FLUIDIZED, 256.36, 256.36, 256.36, 256.36, 256.36,256.36);
		 biomassDesign5 = new BioMassSystems(BiomassSystemType.BiomassThermalEnergyDirectionCombustionFixedBed, 256.36, 256.36, 256.36, 256.36, 256.36,256.36);
		 biomassDesign6 = new BioMassSystems(BiomassSystemType.BioPower, 256.36, 256.36, 256.36, 256.36, 256.36,256.36);
		 biomassDesign7 = new BioMassSystems(BiomassSystemType.PELLET_STOVE, 256.36, 256.36, 256.36, 256.36, 256.36,256.36);
		 biomassDesign8 = new BioMassSystems(BiomassSystemType.WOOD_STOVE, 256.36, 256.36, 256.36, 256.36, 256.36,256.36);

		System.out.println(biomassDesign2);
		System.out.println(biomassDesign3);
		System.out.println(biomassDesign4);
		System.out.println(biomassDesign5);
		System.out.println(biomassDesign6);
		System.out.println(biomassDesign7);
		System.out.println(biomassDesign8);

		
		turbineType = new WindTurbines(6, 45300, TurbineTypes.horizontal, 40, 800);
		turbineType2 = new WindTurbines(8, 56000, TurbineTypes.vertical, 56, 900);
		System.out.println(turbineType);
		System.out.println(turbineType2);
		
		geothermalTest = new GeothermalEnergySystems(40.3, GeothermalUses.HeatingIndustrialUse, 600.3, 1000.3, 20000.3); 
		geothermalTestElectricity = new GeothermalEnergySystems(20.6, GeothermalUses.FlashSteam, 622005.3, 1055500.3, 20000.3); 
		geothermalTestDesalination = new GeothermalEnergySystems(20.6, GeothermalUses.Desalination, 622005.3, 1055500.3, 20000.3);
		System.out.println(geothermalTest);
		System.out.println(geothermalTestElectricity);
		System.out.println(geothermalTestDesalination);
		
		hydroTest = new HydroPowerSystems(4571.56, HydroPowerTypes.Watermills, 56000, 25.7);
		hydroTestusingElectricity = new HydroPowerSystems(6000.56, HydroPowerTypes.HydroElectricity, 65000, 20.7);
		hydroTesttoGenerateCompressedAir = new HydroPowerSystems(6000.56, HydroPowerTypes.CompressedAir, 65056, 30.5);
		System.out.println(hydroTest);
		System.out.println(hydroTestusingElectricity);
		System.out.println(hydroTesttoGenerateCompressedAir);
		
		solarTest = new SolarEnergySystems(56000.9, 67000, 30000, 20.7, SolarEnergyDesigns.passiveSolarHeatSink);
		//SolarPanels solarPanelTest = new SolarPanels(30000, 3200.5, 51352, 45.3,453.1, 452.1, 12.1, 34.2, 23.4, 345.1, 43);
		solarEnergySystemsTest = new SolarEnergySystems(123.3, 34.5, 3531.1, 543, SolarEnergyDesigns.passiveSolarArchitecture);
		solarEnergySystemsTest2 = new SolarEnergySystems(123.3, 34.5, 3531.1, 543, SolarEnergyDesigns.passiveSolarWaterHeater);
		monoSolar = new SolarPanels(SolarPanelType.MonocrystallineSolarPanels, 35.36, 536.32, 2323.23, 2323.23, 2323.23, 2323.23, 2323.23, 2323.23, 2323.23, 2323.23, 2323.23);	
		System.out.println(solarTest);
		System.out.println(solarEnergySystemsTest);
		System.out.println(solarEnergySystemsTest2);
		System.out.println(monoSolar);
		
	}
	
	/*
	 * Shows informatio about energy using modules. 
	 */
	public static void energyUsingGreenHouses()
	{
		GreenHouses greenHousetest0 = new GreenHouses(GreenHouseTypes.HighTunnel, 13000, GreenHouseMaterialTypes.DoubleGlass, 5.3, 5.5, 5.5);
		GreenHouses greenHousetest1 = new GreenHouses(GreenHouseTypes.PolyCarbonate, 13000, GreenHouseMaterialTypes.DoubleGlassLayerLowE, 5.3, 5.5, 5.5);
		GreenHouses greenHousetest2 = new GreenHouses(GreenHouseTypes.RollingGreenHouse, 13000, GreenHouseMaterialTypes.PolyCarbonate8mmTrimWall, 5.3, 5.5, 5.5);
		GreenHouses greenHousetest3 = new GreenHouses(GreenHouseTypes.LowTunnel, 13000, GreenHouseMaterialTypes.FiberglassGlazingSingleLayer, 5.3, 5.5, 5.5);
		System.out.println(greenHousetest0);
		System.out.println(greenHousetest1);
		System.out.println(greenHousetest2);
		System.out.println(greenHousetest3);
		
	}

	/*
	 * Shows the size of the data sets used.
	 */
	public static void reportSizeOfDataSets()
	{
		//env1.getIrradiance().forEach(m-> System.out.println(m));
		System.out.println("Size of list of irradiance = " + env1.getIrradiance().size());
		
		//env1.getDegreesF().forEach(m-> System.out.println(m));
		System.out.println("Size of list of degrees = " + env1.getDegreesF().size());
		
		//env1.getRain().forEach(m-> System.out.println(m));
		System.out.println("Size of list of degrees = " + env1.getRain().size());
		
		//env1.getSnow().forEach(m-> System.out.println(m));
		System.out.println("Size of list of snow days = " + env1.getSnow().size());
		
		//env1.getWaterDataFlowRates().forEach(m-> System.out.println(m));
		System.out.println("Size of list of water info = " + env1.getWaterDataFlowRates().size());
		
		//env1.getWaterDataheightHeads().forEach(m-> System.out.println(m));
		System.out.println("Size of list of water height info = " + env1.getWaterDataheightHeads().size());
	}

	/*
	 * Generates energy based on environmental data. 
	 */
	public static Environment GenerateEnergyFarm()
	{
		System.out.println("Hourly irradiance was taken from PVWATTS at location Carson City Nevada");
		String environmentalData = "src/finalProject/EnvironmentalResources/HourlyWindVelocity365.txt";
		List<Double> rainfallData = new ArrayList<Double>(); 
		List<Double> snowData = new ArrayList<Double>(); 
		List<Double> windData = new ArrayList<Double>(); 
		List<Double> temps = new ArrayList<Double>(); 
		List<Double> irradiance = new ArrayList<Double>(); 
		List<Double> waterFlowRates = new ArrayList<Double>(); 
		List<Double> waterHead = new ArrayList<Double>(); 
		Environment env1 = new Environment();
		
		try(Scanner reader = new Scanner(new File(environmentalData)))
		{
			int i = 0;
			while(reader.hasNextLine() && i<9000)
			{
				Double rain = Double.parseDouble(reader.nextLine());
				
					rainfallData.add(rain); 
					snowData.add(rain); 
					windData.add(rain); 
					irradiance.add(rain);
					temps.add(rain);
					waterFlowRates.add(rain);
					waterHead.add(rain);
					
					i++;
			}
			
			env1.setIrradiance(irradiance);
			env1.setRain(rainfallData);
			env1.setSnow(snowData);
			env1.setWaterData(waterFlowRates,waterHead);
			env1.setTemperatureinFarinheight(temps);
			env1.setwindVelocity(windData);
			
		}
				
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		return env1;
	}

	/*
	 * Displays a menu for the user. 
	 */
	private static void displayMenu()
	{
		System.out.println("-------------------------");
		System.out.println("1 Build your solar farm");
		System.out.println("2 Report the size of your data sets ");
		System.out.println("3 Show information about all of your energy USING systems");
		System.out.println("4 Show information about all of your power PRODUCING systems");
		System.out.println("5 Generate Power!!");
		System.out.println("6 Show binary search trees for power generated from solar, wind, and water over 8760 hours of the year!");
		System.out.println("7 Want to see how long that took to compute? ");
		System.out.println("8 Exit");
		System.out.println("-------------------------");
		
	}
	
	
}
