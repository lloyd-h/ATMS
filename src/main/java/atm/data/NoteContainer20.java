/**
 * 
 */
package atm.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lloyd
 *
 */
public class NoteContainer20 extends NoteContainer {

	//protected final Log logger = LogFactory.getLog(getClass());
	protected static final Logger logger = LoggerFactory.getLogger(NoteContainer20.class);
	
	/* (non-Javadoc)
	 * @see atm.data.NoteContainer#dispense(int)
	 */
	public boolean dispense(int count) {
		
		if(this.noteCount >= count){
			this.noteCount = this.noteCount - count;
			this.amount = this.amount - 20*count;
			logger.info("Dispensed "+ count + "$20 notes. Available note count is: " + this.noteCount);
			return true;
		}
		else{
			logger.error("Not enough $20 notes. Available note count is: " + this.noteCount);
			return false;
		}
	}

}