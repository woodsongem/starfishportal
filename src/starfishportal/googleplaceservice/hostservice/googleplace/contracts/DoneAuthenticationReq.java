
package starfishportal.googleplaceservice.hostservice.googleplace.contracts;

import starfishportal.hostservice.contracts.enums.Brand;
import starfishportal.hostservice.contracts.enums.Channel;

public class DoneAuthenticationReq {
 	private String _userName;
	private String _passWord;
	private Channel _channel;
	private Brand  _brand;
	private String _ipAddress;
	/**
	 * @return the _userName
	 */
	public String get_userName() {
		return _userName;
	}
	/**
	 * @param _userName the _userName to set
	 */
	public void set_userName(String _userName) {
		this._userName = _userName;
	}
	
	/**
	 * @return the _passWord
	 */
	public String get_passWord() {
		return _passWord;
	}
	
	/**
	 * @param _passWord the _passWord to set
	 */
	public void set_passWord(String _passWord) {
		this._passWord = _passWord;
	}
	/**
	 * @return the _channel
	 */
	public Channel get_channel() {
		return _channel;
	}
	/**
	 * @param _channel the _channel to set
	 */
	public void set_channel(Channel _channel) {
		this._channel = _channel;
	}
	/**
	 * @return the _brand
	 */
	public Brand get_brand() {
		return _brand;
	}
	/**
	 * @param _brand the _brand to set
	 */
	public void set_brand(Brand _brand) {
		this._brand = _brand;
	}
	/**
	 * @return the _ipAddress
	 */
	public String get_ipAddress() {
		return _ipAddress;
	}
	/**
	 * @param _ipAddress the _ipAddress to set
	 */
	public void set_ipAddress(String _ipAddress) {
		this._ipAddress = _ipAddress;
	}
 
}
