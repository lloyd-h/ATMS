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
public class NoteContainer50 extends NoteContainer {

	//protected final Log logger = LogFactory.getLog(getClass());
	protected static final Logger logger = LoggerFactory.getLogger(NoteContainer50.class);
	
	/* (non-Javadoc)
	 * @see atm.data.NoteContainer#dispense(int)
	 */
	public boolean dispense(int count){
		
		if(this.noteCount >= count){
			this.noteCount = this.noteCount - count;
			this.amount = this.amount - 50*count;
			logger.info("Dispensed "+ count + "$50 notes. Available note count is: " + this.noteCount);
			return true;
		}
		else{
			logger.error("Not enough $50 notes. Available note count is: " + this.noteCount);
			return false;
		}
	}

}
