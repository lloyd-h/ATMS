/**
 * 
 */
package atm.service;

/**
 * @author lloyd
 *
 */
public interface Withdrawable {

	/**
	 * This implements the withdraw algorithm
	 * @param amount The amount to be withdrawn
	 * @return
	 */
	public int withdraw(int amount);
}
