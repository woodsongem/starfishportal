package starfishportal.googleplaceservice.hostservice.googleplace.contracts;

import starfishportal.hostservice.contracts.Result;
import starfishportal.hostservice.contracts.ResultMessage;
/**
 * 
 */
import starfishportal.hostservice.contracts.enums.ResultStatus;

/**
 * @author SAJAN
 * 
 */
public class GooglePlaceResponse extends Result {

	public GooglePlaceResponse(ResultStatus resultStatus,ResultMessage resultMessage) {
		super(resultStatus, resultMessage);
	}

	public GooglePlaceResponse(ResultStatus resultStatus,ResultMessage[] resultMessage) {
		super(resultStatus, resultMessage);
	}

	public GooglePlaceResponse(ResultStatus resultStatus) {
		super(resultStatus);
	}

	public GooglePlaceResponse() {

	}

	private PlacesList _googlePlaces;

	/**
	 * @return the _googlePlaces
	 */
	public PlacesList get_googlePlaces() {
		return _googlePlaces;
	}

	/**
	 * @param _googlePlaces
	 *            the _googlePlaces to set
	 */
	public void set_googlePlaces(PlacesList _googlePlaces) {
		this._googlePlaces = _googlePlaces;
	}

}
