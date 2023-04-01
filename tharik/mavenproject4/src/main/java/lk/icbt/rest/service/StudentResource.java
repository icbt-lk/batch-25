/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.icbt.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author hnd
 */
@Path("student")
public class StudentResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
        return "This is test text response";
    }
}
