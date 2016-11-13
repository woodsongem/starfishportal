/**
 * 
 */
package starfishportal.hostservice.contracts;

import starfishportal.hostservice.contracts.enums.ResultStatus;

/**
 * @author SAJAN
 *
 */
public class Result {

	
	public Result()
	{
		
	}
	
	public Result(ResultStatus resultStatus,ResultMessage resultMessage)
	{
		this.set_resultStatus(resultStatus);
		ResultMessage[] resultMsg=new ResultMessage[1];
		resultMsg[0]=resultMessage;
		this.set_errorMsg(resultMsg);		
	}
	
	public Result(ResultStatus resultStatus,ResultMessage[] resultMessage)
	{
		this.set_resultStatus(resultStatus);
		this.set_errorMsg(resultMessage);
	}
	
	public Result(ResultStatus resultStatus)
	{
		this.set_resultStatus(resultStatus);
	}
	
	
	private ResultStatus _resultStatus;
	private ResultMessage[] _errorMsg; 
	
	/**
	 * @return the _resultStatus
	 */
	public ResultStatus get_resultStatus() {
		return _resultStatus;
	}
	/**
	 * @param _resultStatus the _resultStatus to set
	 */
	private void set_resultStatus(ResultStatus _resultStatus) {
		this._resultStatus = _resultStatus;
	}
	/**
	 * @return the _errorMsg
	 */
	public ResultMessage[] get_errorMsg() {
		return _errorMsg;
	}
	/**
	 * @param _errorMsg the _errorMsg to set
	 */
	private void set_errorMsg(ResultMessage[] _errorMsg) {
		this._errorMsg = _errorMsg;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Result [_resultStatus=" + _resultStatus + "]";
				//" _errorMsg="
			//	+ Arrays.toString(_errorMsg) + "]";
	}
	

}
