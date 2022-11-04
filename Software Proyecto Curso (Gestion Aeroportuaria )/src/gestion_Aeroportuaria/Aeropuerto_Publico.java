package gestion_Aeroportuaria;

public class Aeropuerto_Publico extends Aeropuerto {
	
	private double Subvencion;  
	
	
	
	// Strings Nombre , ciudad , Pais 
	public Aeropuerto_Publico (String Nombre , String Ciudad , String Pais  ) {
		super (Nombre , Ciudad , Pais );
		
	}
	
	public Aeropuerto_Publico (String Nombre , String Ciudad , String Pais , Compania Co  , double Subvencion ) {
		
		super (Nombre , Ciudad ,Pais); 
		this.Subvencion= Subvencion ; 
		
	} 
	
	public Aeropuerto_Publico (String Nombre , String Ciudad ,String Pais , double sub) {
		super (Nombre , Ciudad ,Pais); 
		this.Subvencion= sub ;  
	} 
	
	public double getSubvencion () {
		return Subvencion ; 
	}
	
}
