package act;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class TestAssertions {
	String imdb1 = new String ("0a1b");
	String imdb2 = new String ("0a1b");
	String autor = "Edgar Wright";
	String tit1 = "Last night in soho";
	String tit2 = "La ultima noche en soho";
	int peliLargaDuracion = 200; //min
	String gen1 = "Thriller";
	String gen2 = "Suspense";
	
	Pelicula p1;
	
	String [] expected = {"Thriller", "Terror", "Crimen", "Aventura", "Accion"};
	
	@BeforeClass
	public void beforeClass() {
		p1 = new Pelicula();
		p1.titulo = "Sin titulo";
		System.out.println(p1.titulo);
	}
	
	@AfterClass
	public void afterClass() {
		p1.imdb = null;
		p1.autor = null;
		p1.titulo = null;
		p1.tiempo = 0; //min
		p1.genero = null;
	}
	
	@Before
	public void before() {
		p1.imdb = new String ("1ab1");
		p1.autor = null;
		p1.titulo = "titulo";
		p1.tiempo = 0; //min
		p1.genero = "genero";

		
	}
	
	@After
	public void after() {
		p1.tiempo = 105; //tiempo medio de una pelicula	
	}
	
	
	@Test
	void testInsertarDatos1() {
		p1 = new Pelicula();
		p1.imdb = new String ("1ab1");
		p1.autor = null;
		p1.titulo = "titulo";
		p1.tiempo = 0; //min
		p1.genero = "genero";
		RecoleccionInfo.insertarDatos(p1);
		assertEquals(p1.imdb, imdb1);	
	}
	
	@Test
	void testInsertarDatos2() {
		p1 = new Pelicula();
		p1.imdb = new String ("1ab1");
		p1.autor = null;
		p1.titulo = "titulo";
		p1.tiempo = 0; //min
		p1.genero = "genero";
		RecoleccionInfo.insertarDatos(p1);
		assertTrue(p1.tiempo >= peliLargaDuracion);	
	}

	@Ignore
	@Test
	void testInsertarDatos3() {
		p1 = new Pelicula();
		p1.imdb = new String ("1ab1");
		p1.autor = null;
		p1.titulo = "titulo";
		p1.tiempo = 0; //min
		p1.genero = "genero";
		RecoleccionInfo.insertarDatos(p1);		
		assertFalse(p1.tiempo <= peliLargaDuracion);
	
	}


	@Test
	void testAñadirAutor1() {
		p1 = new Pelicula();
		p1.imdb = new String ("1ab1");
		p1.autor = null;
		p1.titulo = "titulo";
		p1.tiempo = 0; //min
		p1.genero = "genero";
		RecoleccionInfo.añadirAutor(p1);
		assertNotNull(p1.autor);	
	}
	
	@Test
	void testAñadirAutor2() {	
		p1 = new Pelicula();
		p1.imdb = new String ("1ab1");
		p1.autor = null;
		p1.titulo = "titulo";
		p1.tiempo = 0; //min
		p1.genero = "genero";
		RecoleccionInfo.añadirAutor(p1);		
		assertNull(p1.autor);		
	}

	@Test
	void testModificarValores1() {	
		p1 = new Pelicula();
		p1.imdb = new String ("1ab1");
		p1.autor = null;
		p1.titulo = "titulo";
		p1.tiempo = 0; //min
		p1.genero = "genero";
		RecoleccionInfo.modificarValores(p1,expected);		
		assertSame(p1.genero,gen2);		
	}
	
	@Test
	void testModificarValores2() {
		p1 = new Pelicula();
		p1.imdb = new String ("1ab1");
		p1.autor = null;
		p1.titulo = "titulo";
		p1.tiempo = 0; //min
		p1.genero = "genero";
		RecoleccionInfo.modificarValores(p1,expected);		
		assertSame(p1.genero,gen2);		
	}
	
	@Test
	void testModificarValores3() {
		p1 = new Pelicula();
		p1.imdb = new String ("1ab1");
		p1.autor = null;
		p1.titulo = "titulo";
		p1.tiempo = 0; //min
		p1.genero = "genero";
		String [] generos = {"Thriller", "Terror", "Crimen", "Aventura", "Accion"};		
		RecoleccionInfo.modificarValores(p1,generos);	
		assertSame(generos,expected);
		
	}

}
