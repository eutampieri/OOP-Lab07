/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {
	BASKET(Place.BOTH, 7, "basket"),
	VOLLEY(Place.BOTH, 7, "volley"),
	TENNIS(Place.BOTH, 2, "tennis"),
	BIKE(Place.OUTDOOR, 1, "bike"),
	F1(Place.OUTDOOR, 1, "F1"),
	MOTOGP(Place.OUTDOOR, 1, "motogp"),
	SOCCER(Place.OUTDOOR, 11, "soccer");
	
	private final Place p;
	private final int noTeamMembers;
	private final String actualName;
	
	private Sport(final Place place, final int noTeamMembers, final String actualName) {
		this.p = place;
		this.noTeamMembers = noTeamMembers;
		this.actualName = actualName;
	}


	public boolean isIndividualSport() {
		return this.noTeamMembers == 1;
	}
	
	public Place getPlace() {
		return this.p;
	}
	
	public String toString() {
		return this.actualName;
	}
}
