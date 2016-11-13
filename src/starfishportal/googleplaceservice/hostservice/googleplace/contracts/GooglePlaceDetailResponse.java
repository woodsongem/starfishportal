package starfishportal.googleplaceservice.hostservice.googleplace.contracts;

import starfishportal.hostservice.contracts.Result;
/**
 * 
 */
import starfishportal.hostservice.contracts.ResultMessage;
import starfishportal.hostservice.contracts.enums.ResultStatus;

/**
 * @author SAJAN
 *
 */
public class GooglePlaceDetailResponse extends Result {

	private GooglePlaceDetail _placeDetail;
	
	public GooglePlaceDetailResponse(ResultStatus resultStatus,ResultMessage resultMessage) {
		super(resultStatus, resultMessage);
	}

	public GooglePlaceDetailResponse(ResultStatus resultStatus,ResultMessage[] resultMessage) {
		super(resultStatus, resultMessage);
	}

	public GooglePlaceDetailResponse(ResultStatus resultStatus) {
		super(resultStatus);
	}

	public GooglePlaceDetailResponse() {

	}

	/**
	 * @return the _placeDetail
	 */
	public GooglePlaceDetail get_placeDetail() {
		return _placeDetail;
	}

	/**
	 * @param _placeDetail the _placeDetail to set
	 */
	public void set_placeDetail(GooglePlaceDetail _placeDetail) {
		this._placeDetail = _placeDetail;
	}
}
