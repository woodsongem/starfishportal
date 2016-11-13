/**
 * 
 */
package starfishportal.googleplaceservice.hostservice.googleplace.contracts;

/**
 * @author SAJAN
 *
 */
public class PlaceGeometry {
	
	
	private Location location;	
	
	
	private GeometryViewport viewport;


	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}


	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}


	/**
	 * @return the viewport
	 */
	public GeometryViewport getViewport() {
		return viewport;
	}


	/**
	 * @param viewport the viewport to set
	 */
	public void setViewport(GeometryViewport viewport) {
		this.viewport = viewport;
	}
}
