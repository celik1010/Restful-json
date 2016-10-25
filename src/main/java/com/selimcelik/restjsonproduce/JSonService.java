package com.selimcelik.restjsonproduce;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/jsonService")
public class JSonService {

    @GET
    @Path("get")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getStudentDetail() {
        Student student = new Student();
        student.setId(12);
        student.setAd("Mehmet");
        student.setSoyad("Celik");
        return student;
    }
    // link : http://localhost:8080/RestJSONProduce/rest/jsonService/get

    @GET
    @Path("selim")
    @Produces(MediaType.TEXT_PLAIN)
    public String getName() {

        return "Selim";
    }
}
