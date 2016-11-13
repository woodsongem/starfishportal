package starfishportal.googleplaceservice.hostservice.googleplace.contracts;

public class PlaceAutoComplete {
	@Key
	public String id;
	@Key
	public String description;
	@Key
	public String reference;

	@Override
	public String toString() {
		return description + " - " + id + " - " + reference;
	}
}
