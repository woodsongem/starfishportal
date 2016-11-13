/**
 * 
 */
package starfishportal.googleplaceservice.hostservice;


/**
 * @author SAJAN
 * 
 */

public class starfishgoogleplacesearch  {

	
	public GooglePlaceResponse getGooglePlaceByName(GooglePlaceRequest googlePlaceRequest) {		
		IDoneGooglePlaceInternal googlePlaceObject=new DoneGooglePlaceInternal();
		return	googlePlaceObject.getGooglePlaceByName(googlePlaceRequest);	
	}
	
	public GooglePlaceDetailResponse getGooglePlaceDetail(GooglePlaceDetailRequest placeDetailRequest) {	
		IDoneGooglePlaceInternal googlePlaceObject=new DoneGooglePlaceInternal();
		return	googlePlaceObject.getGooglePlaceDetail(placeDetailRequest);		
	}
}