package gestion_Aeroportuaria;

public class Vuelo { 
	
	private String Indentificador; 
	private String Ciudad_Origen ;  
	private String Ciudad_Destino; 
	private double Precio ;  
	private int NumMax_Pasajeros ; 
	private int NumActual_Pasajeros ; 
	
	// Lista de Pasajeros 
	private  Pasajeros listaPasajeros[];  
	
	public Vuelo (String Identificador , String Ciudad_O ,String Ciudad_D , double Precio , int NumMaxP  ) {
		this.Indentificador = Identificador ;  
		this.Ciudad_Origen = Ciudad_O ;  
		this.Ciudad_Destino = Ciudad_D; 
		this.Precio = Precio ;  
		this.NumMax_Pasajeros = NumMaxP ;
		
		this.NumActual_Pasajeros = 0 ;					// Comienza siendo cero
		this.listaPasajeros = new Pasajeros[NumMaxP];		// La Cantidad Max de Pasajeros 
		
	}
	
	public void InsertarPasajeros(Pasajeros pasajero) { // Pedir Pasajero 
		listaPasajeros[NumActual_Pasajeros]= pasajero;// Insertar un Pasajero a la Lista 
		NumActual_Pasajeros++; 
		
	} 
	
	public String getIndentificador () {
		return Indentificador ; 
	}
	
	public String getCiudad_O() {
		return Ciudad_Origen ;  
	}
	
	public String getCiudad_D() {
		return Ciudad_Destino; 
	}
	
	public double getPrecio () {
		return Precio  ; 
	}
	
	public int getNumActual_Pasajeros () {
		return NumActual_Pasajeros ;  
	} 
	
	public int getNumMax_Pasajeros() {
		return NumMax_Pasajeros ; 
	}
	
	//  Metodos para  Obtener un Determinado Pasajeros  // 
	//1. Por el Indice de la lista   
	
	// Retorar PASAJERO
	public Pasajeros getPasajero(int i ) {
		return listaPasajeros[i];
	}
	// No sabe en que posicion esta el pasajero : 
	// 2. Por el ID  
	
	public Pasajeros getPasajeros(String Pasaporte) {
		boolean  encontrado = false ;  
		int i=0 ;  
		Pasajeros pas= null ; 
		
		// Busqueda Secuencial //  
		
		/*
		 * Mientras encontrado == false y interador Recorra el arreglo completo  
		 * 
		 * se va seguir repitiendo osea hasta que sea true 
		 * 
		 */
		
										// Cantidad Max 
		
		while ((encontrado == false ) && (i <listaPasajeros.length)) {
		
			// Pasaporte es igual a mi lista de pasaporte 
			
			if (Pasaporte .equals(listaPasajeros[i].getPasaporte())) {
				encontrado = true ;  
				pas = listaPasajeros[i]; 
			}
			
			i++; 
		}
		// Arregglo 
		return pas ; 
	} 
	
	
	
	
	
	
	
	
}
