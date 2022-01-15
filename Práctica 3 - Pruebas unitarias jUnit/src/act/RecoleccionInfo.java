package act;

import org.junit.Test;

public class RecoleccionInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pelicula p1 = new Pelicula();
		p1.imdb = new String ("0000");
		p1.autor = null;
		p1.titulo = "null";
		p1.tiempo = 0; //min
		p1.genero = "null";
		
		String [] generos = {"Thriller", "Terror", "Crimen", "Aventura", "Accion"};
		
		insertarDatos(p1);
		//mostrar(p1);
		añadirAutor(p1);
		//mostrar(p1);
		modificarValores(p1, generos);
		//mostrar(p1);
	}
	
	@Test
	public static void insertarDatos(Pelicula p1) {
		
		p1.imdb = new String ("0a1b");
		p1.autor = null;
		p1.titulo = "Last night in soho";
		p1.tiempo = 117; //min
		p1.genero = "Thriller";
		
	}
	
	
	public static void añadirAutor(Pelicula p1) {
		
		p1.autor = "Edgar Wright";
		
	}
	
	
	public static void modificarValores(Pelicula p1, String [] generos) {
		
		p1.imdb = new String ("0001");
		p1.titulo = "La ultima noche en soho";
		p1.genero = "Suspense";
		generos[0] = "Suspense";
		
	}
	@Test
	public void mostrar(Pelicula p1) {
		System.out.println("PELICULA LISTA: ");
		System.out.println("_______________");
		System.out.println("Imdb: "+ p1.imdb);
		System.out.println("Autor: "+ p1.autor);
		System.out.println("Titulo: "+ p1.titulo);
		System.out.println("Tiempo: "+ p1.tiempo);
		System.out.println("Genero: "+ p1.genero);

	}
	
	

}
