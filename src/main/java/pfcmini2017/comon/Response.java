package pfcmini2017.comon;



public class Response {

	public static final String OK="OK";
	public static final String KO="KO";
	
	private Request request;
	private String Result;
	private String response;
	public Request getRequest() {
		return request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}
	public String getResult() {
		return Result;
	}
	public void setResult(String result) {
		Result = result;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	@Override
	public String toString() {
		return "Response [request=" + request + ", Result=" + Result
				+ ", response=" + response + "]";
	}
	
	
}
