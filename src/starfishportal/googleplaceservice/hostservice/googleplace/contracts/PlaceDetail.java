/**
 * 
 */
package starfishportal.googleplaceservice.hostservice.googleplace.contracts;

/**
 * @author SAJAN
 * 
 */
public class PlaceDetail {
	
	private AddressDetails[] address_components;
	
	
	private String international_phone_number;
	
	
	private String website;
	
	
	private String formatted_phone_number;
	
	 
	private String formatted_address;
	
	
	private String id;

	
	private String name;

	
	private String reference;

	
	private String icon;

	
	private String vicinity;

	
	private String[] types;

	
	private PlaceGeometry geometry;
	
	
	private PlaceReviews[] reviews;
	
	
	private double utc_offset;
	
	private double rating;
	
	private String googleplusUrl; 


	/**
	 * @return the address_components
	 */
	public AddressDetails[] getAddress_components() {
		return address_components;
	}


	/**
	 * @param address_components the address_components to set
	 */
	public void setAddress_components(AddressDetails[] address_components) {
		this.address_components = address_components;
	}


	/**
	 * @return the international_phone_number
	 */
	public String getInternational_phone_number() {
		return international_phone_number;
	}


	/**
	 * @param international_phone_number the international_phone_number to set
	 */
	public void setInternational_phone_number(String international_phone_number) {
		this.international_phone_number = international_phone_number;
	}


	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}


	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}


	/**
	 * @return the formatted_phone_number
	 */
	public String getFormatted_phone_number() {
		return formatted_phone_number;
	}


	/**
	 * @param formatted_phone_number the formatted_phone_number to set
	 */
	public void setFormatted_phone_number(String formatted_phone_number) {
		this.formatted_phone_number = formatted_phone_number;
	}


	/**
	 * @return the formatted_address
	 */
	public String getFormatted_address() {
		return formatted_address;
	}


	/**
	 * @param formatted_address the formatted_address to set
	 */
	public void setFormatted_address(String formatted_address) {
		this.formatted_address = formatted_address;
	}


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
	 * @return the reviews
	 */
	public PlaceReviews[] getReviews() {
		return reviews;
	}


	/**
	 * @param reviews the reviews to set
	 */
	public void setReviews(PlaceReviews[] reviews) {
		this.reviews = reviews;
	}


	/**
	 * @return the utc_offset
	 */
	public double getUtc_offset() {
		return utc_offset;
	}


	/**
	 * @param utc_offset the utc_offset to set
	 */
	public void setUtc_offset(double utc_offset) {
		this.utc_offset = utc_offset;
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


	/**
	 * @return the googleUrl
	 */
	public String getGooglePlusUrl() {
		return googleplusUrl;
	}


	/**
	 * @param googleUrl the googleUrl to set
	 */
	public void setGooglePlusUrl(String googleUrl) {
		this.googleplusUrl = googleUrl;
	}

}
