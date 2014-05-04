package atm.service;

import org.springframework.beans.factory.annotation.Autowired;

public class ATMManager {
	
	private Withdrawable dispenser;
	
	@Autowired
	public ATMManager(Withdrawable dispenser){
		this.dispenser = dispenser;
	}
	
	/**
	 * Withdraw money 
	 * @param amount The amount to be withdrawn
	 * @return
	 */
	public boolean withdraw(int amount){
		return this.dispenser.withdraw(amount);
	}

}
