package gestion_Aeroportuaria;

public class Pasajeros {  
	
	private String Nombre ;  
	private String Pasaporte ;  
	private String Nacionalidad ;  
	
	// Constructor de los Atributos ---- 
	
	public Pasajeros (String Nombre , String Pasaporte , String Nacionalidad) {
		this.Nombre = Nombre  ;  
		this.Pasaporte = Pasaporte ;  
		this.Nacionalidad = Nacionalidad ;  
		
	} 
	
	// Metodos getter  para Obtener Nombre , Pasaporte , Nacionalidad 
	
	public String getNombre () {
		return Nombre ; 
		
	}
	public String getPasaporte () {
		return Pasaporte ; 
	} 
	
	public String getNacionalidad () {
		return Nacionalidad ; 
	}

}
