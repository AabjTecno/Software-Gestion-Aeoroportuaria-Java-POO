package gestion_Aeroportuaria;

public class Aeropuerto {
	private String Nombre;  
	private String Ciudad ;   
	private String Pais ;  
	private Compania ListaCompanias[]= new Compania[10]; 
	private int NumeroCompañia ;  
	
	
	// Constructor  String  
	
	public Aeropuerto (String Nombre , String Ciudad , String Pais ) {
		this.Nombre = Nombre ; 
		this.Ciudad = Ciudad ; 
		this.Pais= Pais ;  
		this.NumeroCompañia=0;
	
	}
	
	public Aeropuerto (String Nombre , String Ciudad , String Pais , Compania c[]  ) {
		this.Nombre = Nombre ;  
		this.Ciudad = Ciudad ;  
		this.Pais = Pais ;    
		this.NumeroCompañia=0;  
		
		ListaCompanias = c ; // va hacer igual  
		this.NumeroCompañia = c.length ; // Dimensio del Arreglo cantidad
		
	}
	// Insertar 
	public void InsertarCompania (Compania compañia ) {
		ListaCompanias[NumeroCompañia] =compañia ;  
		NumeroCompañia++; 
		
	}
	
	public String getNombre () {
		return Nombre ; 
	}
	
	public String getCiudad () {
		return Ciudad ; 
	}
	
	public String getPais () {
		return Pais ; 
	}
	// Obtener la Lista de Compañias  
	
	public  Compania [] getListaCompanias (){
		return ListaCompanias ; 
	} 
	
	public int getNumeroCompania () {
		return NumeroCompañia ; 
	} 
	// Busqueda por el Indice 
	
	public Compania getCompania (int i ) {
		return ListaCompanias[i] ; 
		
	}
	
	// Busqueda Secuencial // 
	// Por su Nombre 
	
	public Compania getCompania (String Nombre ) {
		
		int i = 0;  
		boolean buscar = false ; 
		Compania E = null; 
		
		while ((!buscar) && ( i<ListaCompanias.length)) {
			
			if (Nombre.equals(ListaCompanias[i].getNombre() ) )  {
				
				buscar = true ; 
				E = ListaCompanias[i];
			}
			i++;  
		}
		return E ; 
	} 
	
	
	//---------------------
	
}
