/**
 * 
 */
package atm.service;

import java.util.List;

import atm.data.NoteContainer;

/**
 * @author lloyd
 *
 */
public class DefaultDispenser implements Withdrawable {

	
	private List<NoteContainer> containers;
	
	/**
	 * @param containers the containers to set
	 */
	public void setContainers(List<NoteContainer> containers) {
		this.containers = containers;
	}
	
	/* (non-Javadoc)
	 * @see atm.service.Withdrawable#withdraw(int)
	 */
	public boolean withdraw(int amount) {
		return false;
	}

}
