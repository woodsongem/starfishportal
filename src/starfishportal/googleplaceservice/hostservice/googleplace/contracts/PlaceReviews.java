/**
 * 
 */
package starfishportal.googleplaceservice.hostservice.googleplace.contracts;
/**
 * @author SAJAN
 *
 */
public class PlaceReviews {
		
	private PlaceReview[] aspects;
	
	
	private String author_name;
	
	
	private String author_url;
	
	
	private String text;
	
	
	private double	time;


	/**
	 * @return the aspects
	 */
	public PlaceReview[] getAspects() {
		return aspects;
	}


	/**
	 * @param aspects the aspects to set
	 */
	public void setAspects(PlaceReview[] aspects) {
		this.aspects = aspects;
	}


	/**
	 * @return the author_name
	 */
	public String getAuthor_name() {
		return author_name;
	}


	/**
	 * @param author_name the author_name to set
	 */
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}


	/**
	 * @return the author_url
	 */
	public String getAuthor_url() {
		return author_url;
	}


	/**
	 * @param author_url the author_url to set
	 */
	public void setAuthor_url(String author_url) {
		this.author_url = author_url;
	}


	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}


	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}


	/**
	 * @return the time
	 */
	public double getTime() {
		return time;
	}


	/**
	 * @param time the time to set
	 */
	public void setTime(double time) {
		this.time = time;
	}
}
