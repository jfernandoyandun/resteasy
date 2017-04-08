package ec.com.softwareevolutivo.demos.manager;

import ec.com.softwareevolutivo.demos.entities.Persona;
import java.util.List;

public class ManagerRegistro {

	private DAO manager;

	public ManagerRegistro(){
		manager= new DAO();
	}

	public DAO getManager() {
		return manager;
	}

	public void setManager(DAO manager) {
		this.manager = manager;
	}

	//Manejo de Personas

	//Lista de Personas
	@SuppressWarnings("unchecked")
	public List<Persona> findAllPersonas(){
        List<Persona> result = getManager().findAll(Persona.class, "o.id");
		return result;
	}

	//Insertar Personas
	public void insertarPersona(Persona persona){
		try {
			getManager().insertar(persona);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Actualizar Persona
	public void actualizarPersona(Persona persona) {
		try {
			getManager().actualizar(persona);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Eliminar Persona
	public void eliminarPersona(Integer idPersona){
		try {
			getManager().eliminar(Persona.class, idPersona);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//Buscar Persona por Id
	public Persona findPersonaId(Integer idPersona) throws Exception{
		return (Persona) getManager().findById(Persona.class, idPersona);
	}
}
