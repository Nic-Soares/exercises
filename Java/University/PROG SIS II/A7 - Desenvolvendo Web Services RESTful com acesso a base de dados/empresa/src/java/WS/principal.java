/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package WS;

import DAO.*;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

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
        // cria uma instância da classe FuncionarioDao
        FuncionarioDAO funcionarioDao = new FuncionarioDAO();
        // obtém a lista atualizada de funcionários
        ArrayList<Funcionario> funcionarios = funcionarioDao.getLista();
        
        String resposta = "";

        for (Funcionario f:funcionarios)
            resposta += "Numat: " + f.getNumat() +
                        "Nome: " + f.getNome() +
                        "Salario: " + f.getSalario() +
                        "Sexo: " + f.getSexo() +
                        "Ndepto: " + f.getNdepto() +
                        "NSUper: " + f.getNsuper() + "\n";
        return resposta;

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
