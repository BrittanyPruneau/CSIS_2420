package finalProject;

/**
 * The Solar panels charge the batteries, and the charge controller insures the proper charging of battery. The battery gives DC voltage to inverter, and inverter converts DC voltage to the normal AC voltage.
 * A charge controller helps in charging deep cycle lead acid batteries that are used in Solar PV systems. How a solar charge controller works
 * solar charge controller working principles
 
   For the reverse protection there are two techniques: shunt and series diodes. In shunt technique the fuse in it blows if the input is reversed- connected because the diode is forward biased. This will prevent DC from getting damaged but the fuse need to be replaced .
 *
 * @author Brittany Pruneau
 *
 */
public class ChargeControllers
{
	private double operatingTemperature; 
	private double storageTemperature; 
	private double chargeControllerType; 
	private double BatteryTempCompensation; 
	private double SolarModuleSize; 
	private double Indications; 
	
	/*
	 * @param operatingTemperature 
	 * @param storageTemperature
	 * @param chargeControllerType
	 * @param batteryTempCompensation
	 * @param solarModuleSize
	 * @param indications
	 */
	public ChargeControllers(double operatingTemperature, double storageTemperature, double chargeControllerType,
			double batteryTempCompensation, double solarModuleSize, double indications)
	{
		this.operatingTemperature = operatingTemperature;
		this.storageTemperature = storageTemperature;
		this.chargeControllerType = chargeControllerType;
		BatteryTempCompensation = batteryTempCompensation;
		SolarModuleSize = solarModuleSize;
		Indications = indications;
	}
	
	/**
	 * @returns the operatingTemperature
	 */
	public double getOperatingTemperature()
	{
		return operatingTemperature;
	}
	/**
	 * @param operatingTemperature 
	 */
	public void setOperatingTemperature(double operatingTemperature)
	{
		this.operatingTemperature = operatingTemperature;
	}
	/**
	 * @returns storageTemperature
	 */
	public double getStorageTemperature()
	{
		return storageTemperature;
	}
	/**
	 * @param storage temperature.
	 */
	public void setStorageTemperature(double storageTemperature)
	{
		this.storageTemperature = storageTemperature;
	}
	/**
	 * @returns chargeControllerType
	 */
	public double getChargeControllerType()
	{
		return chargeControllerType;
	}
	/**
	 * @param chargeControllerType 
	 */
	public void setChargeControllerType(double chargeControllerType)
	{
		this.chargeControllerType = chargeControllerType;
	}
	/**
	 * @returns batteryTempCompensation
	 */
	public double getBatteryTempCompensation()
	{
		return BatteryTempCompensation;
	}
	/**
	 * @param batteryTempCompensation
	 */
	public void setBatteryTempCompensation(double batteryTempCompensation)
	{
		BatteryTempCompensation = batteryTempCompensation;
	}
	/**
	 * @returns the solarModuleSize
	 */
	public double getSolarModuleSize()
	{
		return SolarModuleSize;
	}
	/**
	 * @param solarModuleSize
	 */
	public void setSolarModuleSize(double solarModuleSize)
	{
		SolarModuleSize = solarModuleSize;
	}
	/**
	 * @returns Indications
	 */
	public double getIndications()
	{
		return Indications;
	}
	/**
	 * @param Indications
	 */
	public void setIndications(double indications)
	{
		Indications = indications;
	}
	
	
	
	
	
}
