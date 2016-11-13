/**
 * 
 */
package starfishportal.hostservice.contracts;

import starfishportal.hostservice.contracts.enums.ResultStatus;

/**
 * @author sajan
 *
 */
public class ResultMessage {

	private String errorMessgae;
	private String parameter;
	private String errorCode;
	private ResultStatus resultStatus;
	/**
	 * @return the errorMessgae
	 */
	public String getErrorMessgae() {
		return errorMessgae;
	}
	/**
	 * @param errorMessgae the errorMessgae to set
	 */
	public void setErrorMessgae(String errorMessgae) {
		this.errorMessgae = errorMessgae;
	}
	/**
	 * @return the parameter
	 */
	public String getParameter() {
		return parameter;
	}
	/**
	 * @param parameter the parameter to set
	 */
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * @return the resultStatus
	 */
	public ResultStatus getResultStatus() {
		return resultStatus;
	}
	/**
	 * @param resultStatus the resultStatus to set
	 */
	public void setResultStatus(ResultStatus resultStatus) {
		this.resultStatus = resultStatus;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResultMessage [errorMessgae=" + errorMessgae + ", parameter="
				+ parameter + ", errorCode=" + errorCode + ", resultStatus="
				+ resultStatus + "]";
	}
			
}
