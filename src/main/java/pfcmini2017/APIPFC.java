package pfcmini2017;

import javax.jws.WebMethod;
import javax.jws.WebService;

import pfcmini2017.comon.Response;

@WebService(name="APIPFC")
public interface APIPFC {

	@WebMethod(operationName="ListProducts")
	public Response getProducts();
	
	@WebMethod(operationName="ListClients")
	public Response getClients();
	
}
