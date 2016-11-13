/**
 * 
 */
package starfishportal.googleplaceservice.hostservice.googleplace.contracts;

/**
 * @author SAJAN
 *
 */
public class GooglePlaceDetail {
	
	private String status;	
	private PlaceDetail result;
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the result
	 */
	public PlaceDetail getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(PlaceDetail result) {
		this.result = result;
	}	
	
}
