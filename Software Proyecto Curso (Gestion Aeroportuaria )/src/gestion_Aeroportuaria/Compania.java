package gestion_Aeroportuaria;

public class Compania { 
	
	private String Nombre ;  
	private Vuelo  Lista_Vuelo[] = new Vuelo [10]; // Max 10 Vuelos  
	private int NumeroVuelo=0  ;   
	
	// Para el NOMBRE DE LA COMPAÑIA  
	
	public Compania (String Nombre) {
		this.Nombre = Nombre ; 
	}
	
	public Compania (String Nombre , Vuelo vuelo [] ) {
		this.Nombre = Nombre ;  
		Lista_Vuelo = vuelo ; 
		NumeroVuelo = vuelo.length; // Dimension del Arreglo osea la cantidad de vuelos 
		
	} 
	
	public void InsertarVuelo (Vuelo vuelo ) {
		
		Lista_Vuelo[NumeroVuelo] = vuelo ;  
		NumeroVuelo ++;  
	}
	
	public String getNombre () {
		return Nombre ; 
	}
	
	public int getNumeroVuelo () {
		return NumeroVuelo ; 
	} 
	
	// Indicar para obtener el  vuelo Preciso 
	//1. Con el INTERADOR 
	
	public Vuelo getVuelo (int i ) {
		
		return Lista_Vuelo [i];
		
	}
	//2. Identificador del Vuelo 
	
	public Vuelo getVuelo (String Identificador) {
		boolean encontrado = false ; 
		int i = 0 ;  
		Vuelo vuelo = null ;
		
		// Mientras Busqueda Secuencial  
		while ((!encontrado) && (i < Lista_Vuelo.length ) ) { 
			
			//ID == Lista_Vuelo[i].getIndentificador() O->>> 
			
			if (Identificador.equals(Lista_Vuelo[i].getIndentificador()) ) {
				encontrado = true ;  
				vuelo = Lista_Vuelo[i];
			}
			i++;
		}
		return vuelo ; 	
	}
}   
	



	
