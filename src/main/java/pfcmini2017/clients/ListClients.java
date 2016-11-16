package pfcmini2017.clients;

import java.rmi.RemoteException;

import org.dolibarr.www.ns.Authentication;
import org.dolibarr.www.ns.Filterthirdparty;
import org.dolibarr.www.ns.Thirdparty;
import org.dolibarr.www.ns.WebServicesDolibarrThirdPartyPortTypeProxy;
import org.dolibarr.www.ns.holders.ResultHolder;
import org.dolibarr.www.ns.holders.ThirdPartiesArray2Holder;
import org.dolibarr.www.ns.holders.ThirdpartyHolder;

import pfcmini2017.comon.Response;

public class ListClients {

	String APIKEY="fe45f813b52a7194b487b3eb397c9d2f";
	String login="acorral";
	String pass="demo*1234";
	public Response listClients(Response response){
		Authentication auth=new Authentication(APIKEY, "dollibar", login, pass, "ThirdParty");
		WebServicesDolibarrThirdPartyPortTypeProxy proxy = new WebServicesDolibarrThirdPartyPortTypeProxy();
		ResultHolder res=new ResultHolder();
		ThirdPartiesArray2Holder holder = new ThirdPartiesArray2Holder();
		try {
			
			proxy.getListOfThirdParties(auth, new Filterthirdparty(), res, holder);
			
				response.setResponse(res.value.getResult_code());
				String resu="";
				for (Thirdparty th : holder.value) {
					resu+=th.getClient();
					resu+=","+th.getId();
					resu+=";";
				}
				response.setResult(resu);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}
}
