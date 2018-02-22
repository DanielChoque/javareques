package com.valework.yingul.controller;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

//import org.json.JSONException;
//import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.valework.yingul.model.Yng_RequestBody;

//import ch.qos.logback.core.net.SyslogOutputStream;
//import scala.annotation.meta.setter;

import javax.ws.rs.core.MediaType;

@RestController
@RequestMapping("/dhl")
public class DhlController {
	//private final String apiKey="46e903f2a3e1cb1933db836b99df089f91e9fd57";
	//private final String secretKey="8a5b791c1e426a96650b54693f04aec02e89b280";
	//private final String urlApi= "https://api.enviopack.com";
	//private final String cotizarDomicilio="/cotizar/precio/a-domicilio?access_token=";
	//private final String cotizarSucursal="/cotizar/precio/a-sucursal?access_token=";
	//private final String cotizarCosto="/cotizar/costo?access_token=";
	//private final String urlDHL="https://private-anon-e5589704da-dhlgloballabel.apiary-proxy.com";
	@RequestMapping("/tokken")
	public String da(){
		Client client = ClientBuilder.newClient();
		Response response = client.target("https://private-anon-ee29acebcf-efulfillment1.apiary-proxy.com/efulfillment/v1/auth/accesstoken")
		  .request(MediaType.TEXT_PLAIN_TYPE)
		  .header("Accept", "application/json")
		  .header("Authorization", "Basic ZTllZDgyYTgtNDIzNy00MTg1LThlMzYtNDcyNjRhYTllNzE4OmIxZWQxYmZhLTY4OWItNGQ1Yi1iYmYyLTM5ZGRlNjRjY2I2NA==")
		  .get();

		System.out.println("status: " + response.getStatus());
		System.out.println("headers: " + response.getHeaders());
		System.out.println("body:" + response.readEntity(String.class));
		return "save";
	}
	@RequestMapping("/tke")
	public String dan() {
		Client client = ClientBuilder.newClient();
		Entity payload = Entity.json("");
		Response response = client.target("https://private-anon-e5589704da-dhlgloballabel.apiary-proxy.com/shipping/v1/order/manifest")
		  .request(MediaType.APPLICATION_JSON_TYPE)
		  .header("Accept", "application/json")
		  .header("Authorization", "Bearer hk64vzaLETOVvs7lyQAkIGQe7DnsFL1y5rqkFEyeBToR34JhL53ymy")
		  .post(payload);

		System.out.println("status: " + response.getStatus());
		System.out.println("headers: " + response.getHeaders());
		System.out.println("body:" + response.readEntity(String.class));
		return "save";
	}
	@RequestMapping("/tokken2")
	public String da2(){
		
		Client client = ClientBuilder.newClient();
		Entity payload = Entity.json("{  'shipments': [    {      'packages': [        {          'packageDetails': {            'packageRefName': '55555555555555555',            'insuredValue': 1,            'weight': 2,            'declaredValue': 250,            'mailType': 2,            'height': 30,            'packageDesc': 'Desc111',            'currency': 'AUD',            'length': 20,            'weightUom': 'G',            'billingRef2': 'ref 2',            'packageId': 'fybjywwbdt',            'dutiesPaid': 'DDU',            'orderedProduct': 'PPS',            'dimensionUom': 'CM',            'billingRef1': 'ref 1'          },          'consigneeAddress': {            'city': 'Test City',            'name': 'Test Name',            'address1': 'Address line 1',            'address2': 'apt 123',            'phone': '555-555-5555',            'state': 'GA',            'country': 'IE',            'postalCode': '99999',            'email': 'test@email.com'          },          'customsDetails': [            {              'skuNumber': '3333333333333',              'countryOfOrigin': 'US',              'itemDescription': 'Desc1',              'itemValue': 10.1,              'packagedQuantity': 10,              'hsCode': '555555'            },            {              'skuNumber': '3333333333333',              'countryOfOrigin': 'CZ',              'itemDescription': 'Desc2',              'itemValue': 20.2,              'packagedQuantity': 20,              'hsCode': '555555'            }          ],          'returnAddress': {            'city': 'Test City',            'name': 'John Returns Doe',            'companyName': 'Test Company',            'country': 'US',            'state': 'GA',            'address1': 'Address line 1',            'postalCode': '99999'          }        }      ],      'pickupAccount': '5317861',      'distributionCenter': 'HKHKG1'    }  ]}");
		Response response = client.target("https://private-anon-e5589704da-dhlgloballabel.apiary-mock.com/shipping/v1/label?format=PNG&labelSize=4x6")
		  .request(MediaType.APPLICATION_JSON_TYPE)
		  .header("Accept", "application/json")
		  .header("Authorization", "Bearer jcfcKyn5qcyNPTruAYVvHKx4Wbgb17tc6uUlk05P4dBJuLPqJTALu5")
		  .post(payload);
	

		System.out.println("status: " + response.getStatus());
		System.out.println("headers: " + response.getHeaders());
		System.out.println("body:" + response.readEntity(String.class));
		
		/*Response response = client.target("https://private-anon-e5589704da-dhlgloballabel.apiary-mock.com/shipping/v1/label?format=PNG&labelSize=4x6")
		  .request(MediaType.APPLICATION_JSON_TYPE)
		  .header("Accept", "application/json")
		  .header("Authorization", "Bearer jcfcKyn5qcyNPTruAYVvHKx4Wbgb17tc6uUlk05P4dBJuLPqJTALu5")
		  .post(payload);

		System.out.println("status: " + response.getStatus());
		System.out.println("headers: " + response.getHeaders());
		System.out.println("body:" + response.readEntity(String.class));*/
		return "save";
	}
	 
	/*public String da3() throws JSONException {
		String requestBodyString="";
		JSONObject  jObject = new JSONObject(requestBodyString);
		Map<String,String> map = new HashMap<String,String>();
        Iterator iter = jObject.keys();
        while(iter.hasNext()){
            String key = (String)iter.next();
            String value= jObject.get(key).toString();
            map.put(key,value);
            System.out.println("status: " +key);
    		System.out.println("headers: " + value);
    		//System.out.println("body:" + response.readEntity(String.class));
            //Yng_RequestBody rbTemp= new Yng_RequestBody();
            //rbTemp.setKey(key);
            //rbTemp.setValue(value);
            //rbTemp.setRequest(requestTemp);
            //requestBodyDao.save(rbTemp);
        }
		
    	/*String prem="";
		if(buy.getYng_PaymentMethod().getYng_Card().getDueMonth()<10) {
			prem="0";
		}
    	String requestBodyString="{\"amount\": \""+buy.getCost()+"\","
        + "\"currency\": \"USD\","
        + "\"payment\": {"
            + "\"cardNumber\": \""+buy.getYng_PaymentMethod().getYng_Card().getNumber()+"\","
            + "\"cardExpirationMonth\": \""+prem+buy.getYng_PaymentMethod().getYng_Card().getDueMonth()+"\","
            + "\"cardExpirationYear\": \"20"+buy.getYng_PaymentMethod().getYng_Card().getDueYear()%100+"\""
            + "}"
        + "}";
    	JSONObject  jObject = new JSONObject(requestBodyString);
        Map<String,String> map = new HashMap<String,String>();
        Iterator iter = jObject.keys();
        while(iter.hasNext()){
            String key = (String)iter.next();
            String value= jObject.get(key).toString();
            map.put(key,value);
            Yng_RequestBody rbTemp= new Yng_RequestBody();
            rbTemp.setKey(key);
            rbTemp.setValue(value);
            rbTemp.setRequest(requestTemp);
            requestBodyDao.save(rbTemp);
        }
		return "save";
	}
	*/
}
