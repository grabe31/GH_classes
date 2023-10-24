package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Oct 22, 2023
 */

@Entity
public class mClass {
	@Id
	@GeneratedValue
	private long id;
	private String className;
	private int health;
	private int stamina;
	private boolean isStarter;
	@Autowired
	private Card card;
	//items
	//perks
	//modifier deck
	
	public mClass() {
		super();
	}
	
	public mClass(String className, int health, int stamina, boolean isStarter, Card card) {
		super();
		this.className = className;
		this.health = health;
		this.stamina = stamina;
		this.isStarter = isStarter;
		this.card = card;
	
	}
	
	

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * @return the stamina
	 */
	public int getStamina() {
		return stamina;
	}

	/**
	 * @param stamina the stamina to set
	 */
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	/**
	 * @return the isStarter
	 */
	public boolean isStarter() {
		return isStarter;
	}

	/**
	 * @param isStarter the isStarter to set
	 */
	public void setStarter(boolean isStarter) {
		this.isStarter = isStarter;
	}
	
	

	/**
	 * @return the card
	 */
	public Card getCard() {
		return card;
	}

	/**
	 * @param card the card to set
	 */
	public void setCard(Card card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return "MercClass [className=" + className + ", health=" + health + ", stamina=" + stamina + ", isStarter="
				+ isStarter + " " + card.getCardName() + "]";
	}
	
	
	

}
