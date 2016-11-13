/**
 * 
 */
package starfishportal.googleplaceservice.hostservice.googleplace.contracts;
/**
 * @author SAJAN
 *
 */
public class PlaceReview {
	
	private double rating;
	
	
	private String type;


	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}


	/**
	 * @param rating the rating to set
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
