/**
 * 
 */
package starfishportal.hostservice.contracts;

import java.sql.Time;
import java.util.Date;


/**
 * @author admin
 *
 */
public class Base {
	private Date RequestStartDate;
	private Time RequestStartTime;
	private Date ResponseStartDate;
	private Time ResponseStartTime;
	
	/**
	 * @return the requestStartDate
	 */
	public Date getRequestStartDate() {
		return RequestStartDate;
	}
	/**
	 * @param requestStartDate the requestStartDate to set
	 */
	public void setRequestStartDate(Date requestStartDate) {
		RequestStartDate = requestStartDate;
	}
	/**
	 * @return the requestStartTime
	 */
	public Time getRequestStartTime() {
		return RequestStartTime;
	}
	/**
	 * @param requestStartTime the requestStartTime to set
	 */
	public void setRequestStartTime(Time requestStartTime) {
		RequestStartTime = requestStartTime;
	}
	/**
	 * @return the responseStartDate
	 */
	public Date getResponseStartDate() {
		return ResponseStartDate;
	}
	/**
	 * @param responseStartDate the responseStartDate to set
	 */
	public void setResponseStartDate(Date responseStartDate) {
		ResponseStartDate = responseStartDate;
	}
	/**
	 * @return the responseStartTime
	 */
	public Time getResponseStartTime() {
		return ResponseStartTime;
	}
	/**
	 * @param responseStartTime the responseStartTime to set
	 */
	public void setResponseStartTime(Time responseStartTime) {
		ResponseStartTime = responseStartTime;
	}
}
