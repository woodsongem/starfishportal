package starfishportal.googleplaceservice.hostservice.googleplace.contracts;

public class PropertyKeyValue {
 
	private String _key;
	private String _value;
	private boolean _resultStatus;
	private String _errorMsg;
	/**
	 * @return the _key
	 */
	public String get_key() {
		return _key;
	}
	/**
	 * @param _key the _key to set
	 */
	public void set_key(String _key) {
		this._key = _key;
	}
	/**
	 * @return the _value
	 */
	public String get_value() {
		return _value;
	}
	/**
	 * @param _value the _value to set
	 */
	public void set_value(String _value) {
		this._value = _value;
	}
	/**
	 * @return the _errorMsg
	 */
	public String get_errorMsg() {
		return _errorMsg;
	}
	/**
	 * @param _errorMsg the _errorMsg to set
	 */
	public void set_errorMsg(String _errorMsg) {
		this._errorMsg = _errorMsg;
	}
	/**
	 * @return the _resultStatus
	 */
	public boolean is_resultStatus() {
		return _resultStatus;
	}
	/**
	 * @param _resultStatus the _resultStatus to set
	 */
	public void set_resultStatus(boolean _resultStatus) {
		this._resultStatus = _resultStatus;
	}
}
