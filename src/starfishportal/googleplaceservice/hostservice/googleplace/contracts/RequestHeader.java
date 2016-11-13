package starfishportal.googleplaceservice.hostservice.googleplace.contracts;

public class RequestHeader {
	//private Channel _channelType;
	private String _channelType;
	private String _userName;
	private String _password;
	private String _requestSentdateTime;
	
	
	/**
	 * @return the _channelType
	 */
	public String get_channelType() {
		return _channelType;
	}

	/**
	 * @param _channelType the _channelType to set
	 */
	public void set_channelType(String channelType) {
		//this._channelType = channelType;
	}

	
	/**
	 * @return the _userName
	 */
	public String get_userName() {
		return this._userName;
	}

	
	/**
	 * @param _userName the _userName to set
	 */
	public void set_userName(String userName) {
		this._userName = userName;
	}

	
	
	/**
	 * @return the _requestSentdateTime
	 */
	public String get_requestSentdateTime() {
		return this._requestSentdateTime;
	}

	
	/**
	 * @param _requestSentdateTime the _requestSentdateTime to set
	 */
	public void set_requestSentdateTime(String requestSentdateTime) {
		this._requestSentdateTime = requestSentdateTime;
	}

	
	/**
	 * @return the _password
	 */
	public String get_password() {
		return _password;
	}

	
	/**
	 * @param _password the _password to set
	 */
	public void set_password(String _password) {
		this._password = _password;
	}
}
