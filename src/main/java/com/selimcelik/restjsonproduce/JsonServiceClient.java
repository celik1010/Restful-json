package com.selimcelik.restjsonproduce;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class JsonServiceClient {
 
    public static void main(String[] args) {
        ClientConfig config=new DefaultClientConfig();
        Client client=Client.create(config);
        WebResource webresource=client.resource("http://localhost:8080/RestJSONProduce/rest");
        
        System.out.println(webresource.path("rest").path("jsonService/get").get(ClientResponse.class).getEntity(String.class));
    }
}
