/**
 * 
 */
package atm.data;

/**
 * @author lloyd
 *
 */
public abstract class NoteContainer {
	
	private int amount;
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

	private int noteCount;
	
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
	public abstract int dispense(int count);

}
