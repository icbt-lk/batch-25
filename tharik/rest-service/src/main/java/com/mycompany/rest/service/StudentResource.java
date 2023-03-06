/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rest.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author hnd
 */
@Path("student")
@RequestScoped
public class StudentResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of StudentResource
     */
    public StudentResource() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.rest.service.StudentResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getStudents() {
        DBUtils utils = new DBUtils();
        Gson gson = new GsonBuilder().create();
        return gson.toJson(utils.getStudents());
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getStudent(@PathParam("id") String id) {
        DBUtils utils = new DBUtils();
        Student st = utils.getStudent(id);
        Gson gson = new GsonBuilder().create();
        return gson.toJson(st);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addStudent(String content) {
        Gson gson = new GsonBuilder().create();
        Student st = gson.fromJson(content, Student.class);
        
        if (st.getId() == null) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        
        DBUtils utils = new DBUtils();
        utils.addStudent(st);
        
        return Response.status(Response.Status.CREATED).build();
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateStudent(String content)  {
        Gson gson = new GsonBuilder().create();
        Student st = gson.fromJson(content, Student.class);
        
        if (st.getId() == null) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        DBUtils utils = new DBUtils();
        utils.updateStudent(st);
        return Response.status(Response.Status.OK).build();
    }
    
    @DELETE
    @Path("/{id}")
    public Response deleteStudent(@PathParam("id") String id)  {
        DBUtils utils = new DBUtils();
        utils.deleteStudent(id);
        return Response.status(Response.Status.OK).build();
    }
}
