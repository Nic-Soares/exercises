/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package WS;

import DAO.*;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.*;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author nicolas
 */
@Path("rest")
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
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("teste")
    public String getTeste(){
        return "teste";

    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("funcionarios")
    public String getFuncionario(){

        FuncionarioDAO funcionarioDao = new FuncionarioDAO();
        ArrayList<Funcionario> funcionarios = funcionarioDao.getLista();

        Gson gson = new Gson();
        
        return gson.toJson(funcionarios);

    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("funcionarios/{numat}")
    public String getFuncionario(@PathParam("numat") int numat){
        FuncionarioDAO funcDAO = new FuncionarioDAO();
        Funcionario funcionario = funcDAO.consulta(numat);
        if(funcionario != null){
            Gson gson = new Gson();
            return gson.toJson(funcionario);
        }
        else
            throw new WebApplicationException(Response.Status.NOT_FOUND);
    }
    
    @DELETE
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("funcionarios/{numat}")
    public Response delFuncionario(@PathParam("numat") int numat) {
    
        FuncionarioDAO funcDAO = new FuncionarioDAO();
        // testa se encontrou e removeu o Funcionario
        if(funcDAO.remove(numat)){
            return Response.status(Response.Status.OK).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        
    }
    
    @POST
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("funcionarios")
    public Response addFuncionario(String content) {
    
        Gson gson = new Gson();
        Funcionario funcionario = (Funcionario) gson.fromJson(content, Funcionario.class);
        FuncionarioDAO funcDAO = new FuncionarioDAO();
        // testa inserir um novo Funcionario
        try{
            funcDAO.adiciona(funcionario);
        } catch(RuntimeException e){
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        return Response.status(Response.Status.OK).build();

    }
    
    @PUT
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("funcionarios")
    public Response setFuncionario(String content) {
    
        Gson gson = new Gson();
        Funcionario funcionario = (Funcionario) gson.fromJson(content, Funcionario.class);
        FuncionarioDAO funcDAO = new FuncionarioDAO();
        
        try {
            if (funcDAO.atualiza(funcionario)) {
                return Response.status(Response.Status.OK).build();
            } else {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
        } catch (RuntimeException e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }

    }
    
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("supervisores")
    public String getSupervisores(){

        FuncionarioDAO funcionarioDao = new FuncionarioDAO();
        ArrayList<Funcionario> funcionarios = funcionarioDao.getLista();

        List<Funcionario> supervisores = new ArrayList<>();
        for (Funcionario f1 : funcionarios) {
            for (Funcionario f2 : funcionarios) {
                if (f1.getNumat() == f2.getNsuper()) {
                    supervisores.add(f1);
                    break;
                }
            }
        }


        Gson gson = new Gson();

        return gson.toJson(supervisores);
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
