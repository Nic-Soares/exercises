/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package WS;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author nicolas
 */
@Path("caminho")
public class principal {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of principal
     */
    public principal() {
    }

    /**
     * Retrieves representation of an instance of WS.principal
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
        return "Web service RESTful - Ola Mundo !!";
    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
    @Path("potencia/{N1}/{N2}") //anotaçao para representar o patch do caminho e os paramentos
    public String getPotencia(@PathParam("N1") int N1, @PathParam("N2") int N2) {
        double resp = Math.pow(N1, N2);
        return "Potencia: " + N1 + "^" + N2 + "igual a " + resp;
    }

    /**
     * PUT method for updating or creating an instance of principal
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public void putText(String content) {
    }
}
