package starfishportal.hostservice.contracts;

import starfishportal.hostservice.contracts.enums.Brand;
import starfishportal.hostservice.contracts.enums.Channel;

public class ClientProfile {
	

	private Brand _brandType;
	private Channel _channel;

	
	/**
	 * @return the _brandType
	 */
	public Brand get_brandType() {
		return _brandType;
	}

	/**
	 * @param _brandType the _brandType to set
	 */
	public void set_brandType(Brand brandType) {
		this._brandType = brandType;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClientProfile [_brandType=" + _brandType + "]";
	}

	
}
