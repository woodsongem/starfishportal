package starfishportal.googleplaceservice.hostservice.googleplace.contracts;

public class PlacesList {
	
	private String NextPageToken;	

	private String status;
	
	private Place[] results;
	
	/**
	 * @return the nextPageToken
	 */
	public String getNextPageToken() {
		return NextPageToken;
	}

	/**
	 * @param nextPageToken the nextPageToken to set
	 */
	public void setNextPageToken(String nextPageToken) {
		NextPageToken = nextPageToken;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the results
	 */
	public Place[] getResults() {
		return results;
	}

	/**
	 * @param results the results to set
	 */
	public void setResults(Place[] results) {
		this.results = results;
	}
	
}
