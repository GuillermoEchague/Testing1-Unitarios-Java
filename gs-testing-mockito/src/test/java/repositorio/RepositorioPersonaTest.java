package repositorio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import modelos.Persona;
import repositorios.RepositorioPersona;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class RepositorioPersonaTest {

	private RepositorioPersona repositorioPersona = mock(RepositorioPersona.class);

	@Test
	@DisplayName("given crearPersona mocked method when crearPersona invoked then mocked value returned")
	public void testCrearPersona() {
		Persona pepe = new Persona("1-2", "Pepe");
		// when(repositorioPersona.crearPersona(pepe)).thenReturn("OK");

		// when(repositorioPersona.crearPersona(null)).thenThrow(new
		// NullPointerException());
		when(repositorioPersona.crearPersona(pepe)).thenReturn("OK");
		String crearPersonaRes = repositorioPersona.crearPersona(pepe);
		assertEquals("OK", crearPersonaRes);
		verify(repositorioPersona).crearPersona(pepe);

	}

	@Test
	@DisplayName("given actualizarPersona mocked method when actualizarPersona invoked then mocked value returned")
	public void testActualizarPersona() {
		Persona juanito = new Persona("1-2", "Juanito");
		when(repositorioPersona.actualizarPersona(juanito)).thenReturn("OK");
		String actualizarRes = repositorioPersona.actualizarPersona(juanito);
		assertEquals("OK", actualizarRes);
		verify(repositorioPersona).actualizarPersona(juanito);
	}

	@Test
	@DisplayName("given eliminarPersona mocked method when eliminarPersona	invoked then mocked value returned")
	public void testEliminarPersona() {
		Persona sam = new Persona("1-4", "Sam");
		when(repositorioPersona.eliminarPersona(sam)).thenReturn("OK");
		String eliminarRes = repositorioPersona.eliminarPersona(sam);
		assertEquals("OK", eliminarRes);
		verify(repositorioPersona).eliminarPersona(sam);
	}

	@Test
	@DisplayName("given listarPersona mocked method when listarPersona invoked then mocked value returned")
	public void testListarPersona() {
		Map<String, String> mockRespuesta = new HashMap<>();
		when(repositorioPersona.listarPersonas()).thenReturn(mockRespuesta);
		Map<String, String> listarRes = repositorioPersona.listarPersonas();
		assertEquals(mockRespuesta, listarRes);
		verify(repositorioPersona).listarPersonas();
	}

}
