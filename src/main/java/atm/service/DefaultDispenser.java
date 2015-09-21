/**
 * 
 */
package atm.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import atm.data.NoteContainer;


/**
 * @author lloyd
 *
 */
public class DefaultDispenser implements Withdrawable {

	
	private Map<String, NoteContainer> containers;
	
	//protected final Log logger = LogFactory.getLog(getClass());
	protected static final Logger logger = LoggerFactory.getLogger(DefaultDispenser.class);
	
	/**
	 * @param containers the containers to set
	 */
	public void setContainers(Map<String,NoteContainer> containers) {
		this.containers = containers;
	}
	
	/* (non-Javadoc)
	 * @see atm.service.Withdrawable#withdraw(int)
	 */
	public boolean withdraw(int amount){
		
		logger.info("Withdrawing " + amount);
		NoteContainer container50 = containers.get("50");
		NoteContainer container20 = containers.get("20");
		
		if(amount == 50){
			return container50.dispense(1);
		}
		else if(amount == 20){
			return container20.dispense(1);
		}
		else if(amount > 50){
			int mod = amount % 50;
			if(mod == 0){
				return container50.dispense(amount/50);
			}
			else if(mod >= 20){
				int nextMod = mod % 20;
				if(nextMod ==0){
					//If enough notes are available, dispense them.
					int count_20 = container20.getNoteCount();
					int count_50 = container50.getNoteCount();
					
					if((count_20 >= mod/20) && (count_50 >= (amount - mod)/50)){
						return container20.dispense(mod/20) && container50.dispense((amount - mod)/50);
					}
					else{
						return false;
					}
				}
				else{
					return false;
				}
			}
			else{
				return false;
			}
		}
		else if(amount > 20){
			int mod = amount % 20;
			if(mod == 0){
				return container20.dispense(amount/20);
			}
			else{
				return false;
			}
		}
		else{
			//can't dispense. Im testing
			return false;
//			Another comment
//            Another
		}
		
	}

}
