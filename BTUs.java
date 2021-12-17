/**
 * Gaurantees each energy module class with implement the methods below.
 * 
 * @author Brittany Pruneau
 *
 */
package finalProject;

public interface BTUs
{
	void generateChargeEnergyModule(Environment env);
	void showCurrentBTUlevel();
	void computeDegradation(Environment env);
}
