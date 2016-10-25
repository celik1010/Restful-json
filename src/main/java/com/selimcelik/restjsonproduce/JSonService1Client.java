package com.selimcelik.restjsonproduce;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JSonService1Client {
    public static void main(String[] args) {
        String URI="http://localhost:8080/RestJSONProduce/rest/jsonService1/post";
        ClientConfig config=new DefaultClientConfig();
        Client client=Client.create(config);
        WebResource resource=client.resource(URI);
        
        String json="{\"id\":12,\"ad\":\"Selim11\",\"soyad\":\"Celik\"}";
        ClientResponse response=resource.type("application/json").post(ClientResponse.class,json);
        System.out.println("Json servis çıkış");
        if (response.getStatus()!=201) {
            try {
                throw new Exception("Error code :"+response.getStatus());
            } catch (Exception ex) {
                Logger.getLogger(JSonService1Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Çıktı : "+ response.getEntity(String.class));

    }
}
