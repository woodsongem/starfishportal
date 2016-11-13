package starfishportal.googleplaceservice.hostservice.googleplace.contracts;

import starfishportal.hostservice.contracts.ClientProfile;

public class GooglePlaceRequest {

	private String _searchText;
	private RequestHeader _requestHeader; 
	private ClientProfile _clientProfile;
	private Location _location;	
	private Double _radius;
	private String _types;
	private boolean _sensor;
	private String rankby;
	/**
	 * @return the _searchText
	 */
	public String get_searchText() {
		return _searchText;
	}
	/**
	 * @param _searchText the _searchText to set
	 */
	public void set_searchText(String searchText) {
		this._searchText = searchText;
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
	/**
	 * @return the _clientProfile
	 */
	public ClientProfile get_clientProfile() {
		return _clientProfile;
	}
	/**
	 * @param _clientProfile the _clientProfile to set
	 */
	public void set_clientProfile(ClientProfile clientProfile) {
		this._clientProfile = clientProfile;
	}
	
	/**
	 * @return the _location
	 */
	public Location get_location() {
		return _location;
	}
	/**
	 * @param _location the _location to set
	 */
	public void set_location(Location _location) {
		this._location = _location;
	}
	
	/**
	 * @return the _radius
	 */
	public Double get_radius() {
		return _radius;
	}
	/**
	 * @param _radius the _radius to set
	 */
	public void set_radius(Double _radius) {
		this._radius = _radius;
	}
	
	/**
	 * @return the _types
	 */
	public String get_types() {
		return _types;
	}
	
	/**
	 * @param _types the _types to set
	 */
	public void set_types(String _types) {
		this._types = _types;
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
	 * @return the rankby
	 */
	public String getRankby() {
		return rankby;
	}
	/**
	 * @param rankby the rankby to set
	 */
	public void setRankby(String rankby) {
		this.rankby = rankby;
	}
	
}
