package ec.com.softwareevolutivo.demos.service;

import ec.com.softwareevolutivo.demos.entities.Persona;
import ec.com.softwareevolutivo.demos.manager.ManagerRegistro;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by fernando on 4/7/17.
 */
@Path("/rest/persona")
public class PersonaService {

    ManagerRegistro registro;

    public PersonaService(){
        registro = new ManagerRegistro();
    }

    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Persona> getPersonaList() {
        try{
            return registro.findAllPersonas();
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
            return null;
        }
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Persona getById(@PathParam("id") Integer id) {
        try{
            return registro.findPersonaId(id);
        }catch(Exception e){
            return null;
        }
    }

}
