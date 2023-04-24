/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package WS;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
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
@Path("calculadora")
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
        return "Bem vindo a nossa Calculadora pré histórica";
    }
    
    //SOMA
    @GET
    @Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
    @Path("soma/{N1}/{N2}")
    public String getSoma(@PathParam("N1") int N1, @PathParam("N2") int N2) {
        int resp = N1 + N2;
        return "Soma: " + N1 + " + " + N2 + " = " + resp;
    }
    
    //Subtraçao
    @GET
    @Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
    @Path("subtracao/{N1}/{N2}")
    public String getSubtracao(@PathParam("N1") int N1, @PathParam("N2") int N2) {
        int resp = N1 - N2;
        return "Subtracao: " + N1 + " - " + N2 + " = " + resp;
    }
    
    //Multiplicação
    @GET
    @Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
    @Path("multiplicacao/{N1}/{N2}")
    public String getMultiplicacao(@PathParam("N1") int N1, @PathParam("N2") int N2) {
        int resp = N1 * N2;
        return "Multiplicacao: " + N1 + " * " + N2 + " = " + resp;
    }
    
    //Divisão
    @GET
    @Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
    @Path("divisao/{N1}/{N2}")
    public String getDivisao(@PathParam("N1") int N1, @PathParam("N2") int N2) {
        if (N2 == 0) {
            return "Não é possível dividir por zero";
        }
        double resp = (double) N1 / N2;
        return "Divisao: " + N1 + " / " + N2 + " = " + resp;
    }


    
    @GET
    @Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
    @Path("potencia/{N1}/{N2}")
    public String getPotencia(@PathParam("N1") int N1, @PathParam("N2") int N2) {
        double resp = Math.pow(N1,N2);
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
