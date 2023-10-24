package dmacc.beans;

import jakarta.persistence.Embeddable;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Oct 23, 2023
 */
@Embeddable
public class Card {
	private String cardName;
	private String topAction;
	private String bottomAction;
	private int initiative; 
	private String level;
	
	public Card() {
		super();
	}
	
	public Card(String cardName, String topAction, String bottomAction, int initiative, String level) {
		this.cardName = cardName;
		this.topAction = topAction;
		this.bottomAction = bottomAction;
		this.initiative = initiative;
		this.level = level;
	}

	
	/**
	 * @return the cardName
	 */
	public String getCardName() {
		return cardName;
	}

	/**
	 * @param cardName the cardName to set
	 */
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	/**
	 * @return the topAction
	 */
	public String getTopAction() {
		return topAction;
	}

	/**
	 * @param topAction the topAction to set
	 */
	public void setTopAction(String topAction) {
		this.topAction = topAction;
	}

	/**
	 * @return the bottomAction
	 */
	public String getBottomAction() {
		return bottomAction;
	}

	/**
	 * @param bottomAction the bottomAction to set
	 */
	public void setBottomAction(String bottomAction) {
		this.bottomAction = bottomAction;
	}

	/**
	 * @return the initiative
	 */
	public int getInitiative() {
		return initiative;
	}

	/**
	 * @param initiative the initiative to set
	 */
	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}

	/**
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "card [topAction=" + topAction + ", bottomAction=" + bottomAction + ", initiative=" + initiative
				+ ", level=" + level + "]";
	}
	
	
}
