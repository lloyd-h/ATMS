/**
 * 
 */
package atm.data;

/**
 * @author lloyd
 *
 */
public abstract class NoteContainer {
	
	protected int amount;
	protected int noteCount;
	
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * @param noteCount the noteCount to set
	 */
	public void setNoteCount(int noteCount) {
		this.noteCount = noteCount;
	}

	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}
	
	/**
	 * @return the noteCount
	 */
	public int getNoteCount() {
		return noteCount;
	}
	
	/**
	 * 
	 * @param count number of notes to dispense
	 * @return
	 */
	public abstract boolean dispense(int count);

}
