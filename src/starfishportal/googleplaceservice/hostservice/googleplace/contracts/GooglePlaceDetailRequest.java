package starfishportal.googleplaceservice.hostservice.googleplace.contracts;

import starfishportal.hostservice.contracts.ClientProfile;
/**
 * 
 */

/**
 * @author SAJAN
 *
 */
public class GooglePlaceDetailRequest {
 
	private String _referenceNo;
    private boolean _sensor; 
    private RequestHeader _requestHeader; 
	private ClientProfile _clientProfile;
	
	/**
	 * @return the _referenceNo
	 */
	public String get_referenceNo() {
		return _referenceNo;
	}

	/**
	 * @param _referenceNo the _referenceNo to set
	 */
	public void set_referenceNo(String _referenceNo) {
		this._referenceNo = _referenceNo;
	}

	
	/**
	 * @return the _sensor
	 */
	public boolean get_sensor() {
		return _sensor;
	}

	
	/**
	 * @param _sensor the _sensor to set
	 */
	public void set_sensor(boolean _sensor) {
		this._sensor = _sensor;
	}

	/**
	 * @return the _clientProfile
	 */
	public ClientProfile get_clientProfile() {
		return _clientProfile;
	}

	/**
	 * @param _clientProfile the _clientProfile to set
	 */
	public void set_clientProfile(ClientProfile _clientProfile) {
		this._clientProfile = _clientProfile;
	}

	/**
	 * @return the _requestHeader
	 */
	public RequestHeader get_requestHeader() {
		return _requestHeader;
	}

	/**
	 * @param _requestHeader the _requestHeader to set
	 */
	public void set_requestHeader(RequestHeader _requestHeader) {
		this._requestHeader = _requestHeader;
	}
}
