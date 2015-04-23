package atm.service;

import org.springframework.beans.factory.annotation.Autowired;

import atm.data.WithdrawForm;

public class ATMManager {
	
	private Withdrawable dispenser;
	
	@Autowired
	private WithdrawForm form;
	
	/**
	 * @return the form
	 */
	public WithdrawForm getForm() {
		return form;
	}

	/**
	 * @param form the form to set
	 */
	public void setForm(WithdrawForm form) {
		this.form = form;
	}

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
