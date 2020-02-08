package servicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Map;
import java.util.logging.Logger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import modelos.Persona;

@DisplayName("Tests Clase ServicioPersona")
public class ServicioPersonaTest {

	private static Logger logger = Logger.getLogger("cl.desafiolatam.servicios.ServicioPersonaTest");
	private final ServicioPersona servicioPersona = new ServicioPersona();

	
	
	@Test
	@DisplayName("Test testCrearPersona")
	void testCrearPersona() {
	logger.info("info test crear persona");
	Persona juanito = new Persona("1234-1", "Juanito");
	String respuestaServicio = servicioPersona.crearPersona(juanito);
	assertEquals("Creada", respuestaServicio);
	}
	@Test
	@DisplayName("Test actualizarPersona")
	void testActualizarPersona() {
	logger.info("info actualizar persona");
	Persona pepe = new Persona("1234-1", "Pepe");
	String respuestaServicio = servicioPersona.actualizarPersona(pepe);
	assertEquals("Actualizada", respuestaServicio);
	}
	@Test
	@DisplayName("Test eliminarPersona")
	void testEliminarPersona() {
	logger.info("info eliminar persona");
	Persona pepe = new Persona("1234-1", "Pepe");
	String respuestaServicio = servicioPersona.eliminarPersona(pepe);
	assertEquals(respuestaServicio, "Eliminada");
	}
	@Test
	@DisplayName("Test ListarPersona")
	void testListarPersona() {
	logger.info("info listar persona");
	Map<String, String> listaPersonas = servicioPersona.listarPersonas();
	assertNotNull(listaPersonas);
	}
	}
	