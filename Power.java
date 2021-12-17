/**
 * Gaurantees each energy module class with implement the methods below.
 * 
 * @author Brittany Pruneau
 *
 */
package finalProject;

public abstract interface Power
{
	void generateChargePowerModule(Environment env, double desiredTemp);
	void generateChargePowerModule(Environment env);
	void showCurrentVoltagelevel();
	void showPresentCurrentLevel();
	void computeDegradation(Environment env, Double dateFirstUse, Double lastUsedDate);
}
