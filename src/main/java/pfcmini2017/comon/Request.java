package pfcmini2017.comon;



import java.util.Map;

public class Request {

	
	public static final	Integer CLIENTS=0;
	public static final	Integer PRODUCTS=1;
	public static final	Integer SALES=2;
	
	
	public static final Integer LIST=0;
	public static final Integer CREATE=1;
	public static final Integer UPDATE=2;
	public static final Integer DELETE=3;
	
	
	private Integer backend;
	private Integer operation;
	private Map<String,Object> parameters;
	
	
	public Integer getBackend() {
		return backend;
	}
	public void setBackend(Integer backend) {
		this.backend = backend;
	}
	public Integer getOperation() {
		return operation;
	}
	public void setOperation(Integer operation) {
		this.operation = operation;
	}
	public Map<String, Object> getParameters() {
		return parameters;
	}
	public void setParameters(Map<String, Object> parameters) {
		this.parameters = parameters;
	}
	
	
}
