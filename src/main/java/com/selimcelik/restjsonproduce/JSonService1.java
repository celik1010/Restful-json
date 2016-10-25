package com.selimcelik.restjsonproduce;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/jsonService1")
public class JSonService1 {

    @POST
    @Path("post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response setStudentDetail(Student student) {
        String response = student.getAd();
        return Response.status(201).entity(response).build();
    }
}
