package starfishportal.googleplaceservice.hostservice.googleplace.contracts;

public class Place {
	
	private String id;

	
	private String name;

	
	private String reference;
	
	
	private String icon;
	
	
	private String vicinity;
	
	
	private String[] types;
	
	
	private PlaceGeometry geometry;
	
	 
	private double rating;


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}


	/**
	 * @param reference the reference to set
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}


	/**
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}


	/**
	 * @param icon the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}


	/**
	 * @return the vicinity
	 */
	public String getVicinity() {
		return vicinity;
	}


	/**
	 * @param vicinity the vicinity to set
	 */
	public void setVicinity(String vicinity) {
		this.vicinity = vicinity;
	}


	/**
	 * @return the types
	 */
	public String[] getTypes() {
		return types;
	}


	/**
	 * @param types the types to set
	 */
	public void setTypes(String[] types) {
		this.types = types;
	}


	/**
	 * @return the geometry
	 */
	public PlaceGeometry getGeometry() {
		return geometry;
	}


	/**
	 * @param geometry the geometry to set
	 */
	public void setGeometry(PlaceGeometry geometry) {
		this.geometry = geometry;
	}


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
	
}
