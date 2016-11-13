/**
 * 
 */
package starfishportal.googleplaceservice.hostservice.googleplace.contracts;

/**
 * @author SAJAN
 *
 */
public class GeometryViewport {

	
	private ViewportSouthwest southwest;
	
	
	private ViewportNortheast northeast;


	/**
	 * @return the southwest
	 */
	public ViewportSouthwest getSouthwest() {
		return southwest;
	}


	/**
	 * @param southwest the southwest to set
	 */
	public void setSouthwest(ViewportSouthwest southwest) {
		this.southwest = southwest;
	}


	/**
	 * @return the northeast
	 */
	public ViewportNortheast getNortheast() {
		return northeast;
	}


	/**
	 * @param northeast the northeast to set
	 */
	public void setNortheast(ViewportNortheast northeast) {
		this.northeast = northeast;
	}
	
	
}
