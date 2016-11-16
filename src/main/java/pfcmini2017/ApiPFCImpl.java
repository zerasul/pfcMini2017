package pfcmini2017;

import pfcmini2017.comon.Request;
import pfcmini2017.comon.Response;

public class ApiPFCImpl implements APIPFC{

	@Override
	public Response getProducts() {
		Request req = new Request();
		req.setBackend(Request.PRODUCTS);
		req.setOperation(Request.LIST);
		Response res = new Response();
		res.setRequest(req);
		return res;
	}

	@Override
	public Response getClients() {
		Request req = new Request();
		req.setBackend(Request.CLIENTS);
		req.setOperation(Request.LIST);
		Response res = new Response();
		res.setRequest(req);
		return res;
	}

}
