/*
 *	-| Diseñar y codificar una aplicacion informatica para una compañia de Gestion Aeroportuaria 
	satisfaciendo los siguientes requisitos : 
	
.	||Para cada aeropuerto es necesario saber||  // Clase Aeropuerto 

A) . Todas las compañias de vuelos que operan en el . 
B) . Nombre del aeropuerto , la ciudad donde se ubica y el pais que pertenece 

.||Cada Compañia se Caracteriza por el Nombre y la lista de vuelos que ofrece .:|| // Clase Compañia 

Los Vuelos estan definidos por su indentificador , la ciudad de origen , la ciudad destino y el precio 
del viaje , la lista de pasajeros , el numero maximo de pasajeros permitidos en el vuelo y el numero 
real de pasajeros que ha reservado asiento en el avion . 

.|| Los Aeropuertos puede ser privados y publicos   
	
A)- Los aeropuertos privados tienen una serie de empresas que la patrocinan y es necesario saber el nombre 
de cada una de esas empresas .  

B)- Para los aeropuertos publicos se requiere saber la cantidad de dinero correspondiente a  la subvencion 
Gubernamental . 

.|| Se Necesita Gestionar tambien la Informacion de los pasajeros .|| // Clase Pasajeros 

A) Para cada pasajero se necesita saber nombre , numero de pasaporte y Nacionalidad . 
 *
 */
package gestion_Aeroportuaria;

import java.util.Scanner;

public class Clase_Principal {
	
	static Scanner entrada = new Scanner(System.in);  
	final static int numAeropuerto= 4 ; // Numero de Aeropuerto  cuantos aeropuertos hay  
	static Aeropuerto  aeropuerto[] = new Aeropuerto[numAeropuerto];// Arreglo de Aeropuerto 

	public static void main(String[] args) { 
		
		// Insertar Datos del los Aeropuertos    
		
		
		InsertarDatosAeropuerto(aeropuerto);
		
		Menu ();
		
		
		
	}
	
	public static void InsertarDatosAeropuerto (Aeropuerto aero[]) { // Enviamos el Arreglo aeropuerto
		
										// Constructor Nombre , Ciudad , pais , Subvencion 
		aero[0]= new Aeropuerto_Publico("Jorge Chavez","Lima" ,"Peru" ,800000); // Costructor  
		
		// Compañias
		aero[0].InsertarCompania(new Compania ("AeroPeru")); 
		aero[0].InsertarCompania(new Compania ("LATAM"));
		// Vuelo 										// Indentificador , CiudadO , CiudadD , precio , cantimaxPasajeros
		aero[0].getCompania("AeroPeru").InsertarVuelo(new Vuelo("IB20","Lima" ,"Mexico" ,150.90 ,150));
		aero[0].getCompania("AeroPeru").InsertarVuelo(new Vuelo("IB21" ,"Lima" ,"Mexico" ,180.99 ,120)); 
		aero[0].getCompania("LATAM").InsertarVuelo(new Vuelo ("FC12" ,"Lima " ,"Londres" ,500.90 ,180));
		
		// Pasajeros de Aero Peru dentro del vuelo IB20
		
		aero[0].getCompania("AeroPeru").getVuelo("IB20").InsertarPasajeros(new Pasajeros ("Alejandro" ,"2S30SJX" ,"Peruana"));
		aero[0].getCompania("AeroPeru").getVuelo("IB20").InsertarPasajeros(new Pasajeros("Maria ","PJK" ,"Peruana")); 
		aero[0].getCompania("LATAM").getVuelo("FC12").InsertarPasajeros(new Pasajeros ("Raul" ,"JH21L2" ,"Mexicano"));  
		
		//------------------------------------Datos Primer Aeropuerto --------------------------------------------------------
		aero[1]= new Aeropuerto_Privado("Central Ciudad Real" ,"Ciudad Real" ,"España");  // Atributos de el aeropuerto 
		aero[1].InsertarCompania(new Compania ("AirEuropa"));  // La compañia 
		String empresas[] = {"Cobresol " ,"Anguilar34"} ; // Empresas
		((Aeropuerto_Privado) aero[1]).InsertarEmpresas(empresas);  
		//Atributos del Vuelo 
		aero[1].getCompania("AirEuropa").InsertarVuelo(new Vuelo ("AE025" ,"Madrid" ,"Buenos Aires" ,345.12 ,160));
		aero[1].getCompania("AirEuropa").getVuelo("AE025").InsertarPasajeros(new Pasajeros ("Jesus" ,"KS23KS" ,"Ecuatoriana"));
		
		//----------------------Aeropuerto 2------------------------------------
		
		aero[2]= new Aeropuerto_Publico ("Aeropuerto Bogota" ,"Bogota" ,"Colombia" ,450520.99); 
		aero[2] .InsertarCompania(new Compania("AirAmerica")); 
		aero[2].InsertarCompania(new Compania ("VuelaBogota")); 
		
		aero[2].getCompania("AirAmerica") .InsertarVuelo(new Vuelo ("AEO30" ,"Bogota","Lima" ,250.90 ,100));
		aero[2].getCompania("AirAmerica") .InsertarVuelo(new Vuelo("AEO45" ,"Bogota" ,"Lima" ,220.99 ,150)); 
		aero[2].getCompania("AirAmerica").getVuelo("AEO30").InsertarPasajeros(new Pasajeros ("Jorge " ,"LKSJ23" ,"Aleman"));
		aero[2].getCompania("AirAmerica").getVuelo("AEO30").InsertarPasajeros(new Pasajeros ("Gonzalo " ,"LSKJ80" ,"Colombiano")); 
		
		// Atributos del Aeropuerto 
		aero[3]= new Aeropuerto_Publico ("Air Panama City" ,"Ciudad de Panama" ,"Panama" ,750000.45); 
		
		// Compañias del Vuelo
		aero[3] .InsertarCompania(new Compania ("AirExprex")); 
		aero[3].InsertarCompania(new Compania ("CityAir")); 
		
		// Vuelo  									// Destino Actual , Destino D 
		aero[3].getCompania("CityAir").InsertarVuelo(new Vuelo ("PANM4523","Panama" ,"Estados Unidos",500.99 ,80 ));
		aero[3].getCompania("AirExprex").InsertarVuelo(new Vuelo ("PANM4893","Panama" ,"Estados Unidos",480.00 ,50 ));
		
		// Pasajero 
		
		aero[3].getCompania("AirExprex").getVuelo("PANM4893").InsertarPasajeros(new Pasajeros ("Mario Guzman" ,"HASXJV" ,"Canadiense")); 
		aero[3].getCompania("AirExprex").getVuelo("PANM4893").InsertarPasajeros(new Pasajeros ("Sebastian " ,"MSACZX" ,"Italiano"));
		
	}  
	
	public static void Menu() {
		String nombreAeropuertos=null ,nombreCompania , origen , destino; 
		Compania Nombcompa ; 
		int opcion ;   
		Aeropuerto aeropuertoS;

		System.out.println(); 
		do {
			System.out.println("\tMenu "); 
			System.out.println("1. Consultar Aeropuerto Gestioandos (Publicos o Privados ) "); 
			System.out.println("2. Ver Empresas (Privado ) o Subvencion Publico "); 
			System.out.println("3. Lista Companias de un Aeropuerto ");
			System.out.println("4. Lista de Vuelos por Companias "); 
			System.out.println("5. Listar Posibles Vuelos Origen a Destino "); 
			System.out.println("6. Salir "); 
			System.out.print("Ingrese la Opcion >> ");
			opcion = entrada.nextInt();
			System.out.println(); 
			
			switch (opcion) {
			
			case 1 : // Ver Aeropuerto Gestionados (Publicos y Privados )    
				System.out.println("");
				MostrarDatosAeropuertos (aeropuerto);
				break;  
			case 2 : // Ver Empresas (Privados ) o Subvencion (Publicos ).   
				System.out.println("");
				MostrarPatrocinio(aeropuerto);
				break ;  
			case 3 : // Lista de Compañias   
				entrada.nextLine();
				System.out.print("\nDigite el Nombre del Aeropuerto : "); 
				nombreAeropuertos= entrada.nextLine();
				aeropuertoS = BuscarAeropuerto(nombreAeropuertos, aeropuerto); 

				if (aeropuertoS ==null){
					System.out.println("El Aeropuerto no Existe ");
				} 
				else{
					MostrarCompanias(aeropuertoS);
				}
				break ; 
			case 4 : // Lista de Vuelos de una Compañia   
				entrada.nextLine();
				System.out.print("\nIngrese el Nombre del Aeropuerto >>"); 
				nombreAeropuertos = entrada.nextLine(); 

				// Buscar el Aeropuerto  
				aeropuertoS = BuscarAeropuerto(nombreAeropuertos, aeropuerto); 
				if (aeropuertoS==null){ 
					System.out.println();
					System.out.println("El Aeropuerto no Existe:");
				} 
				else {
					System.out.println("Digite el Nombre de la Compania ->");  
					
					nombreCompania = entrada.nextLine();  
					Nombcompa = aeropuertoS.getCompania(nombreCompania); 
					MostrarVuelos(Nombcompa);
					
				}

				break ;  
			case 5 : // Listar los Posibles Vuelos Origen a DESTINO  
				entrada.nextLine(); 
				System.out.println("Digite la Ciudad Origen :"); 
				origen = entrada.nextLine(); 

				System.out.println("Digite la Ciuadad Destino : "); 
				destino = entrada.nextLine(); 
				MostrarVueloOrigenADestino(origen, destino, aeropuerto);
				
				break ;  
			case 6 :  
				break ;  
				
			default : System.out.println("Error Se Equivoco de Menu ");
			
			}
			
			
		}while (opcion !=6);
		
		
	}
	
	public static void MostrarDatosAeropuertos (Aeropuerto aeropuertos[] ) {
		
		for (int i = 0 ; i<aeropuertos.length; i++) {
			
			// Separar Publicos y Privados 
						
			// Instanceof : Si pertenece Aeropuerto Privado   
			
			if (aeropuertos[i] instanceof Aeropuerto_Privado) {
				System.out.println("\tAeropuerto Privado "); 
			
				System.out.println("Nombre : "+aeropuertos[i].getNombre() ); 
				System.out.println("Ciudad :"+aeropuertos[i].getCiudad() ); 
				System.out.println("Pais  :"+aeropuertos[i].getPais() );
				System.out.println();
 			}
			else {
				System.out.println("\tAeropuerto Publico  ");
				
				System.out.println("Nombre : "+aeropuertos[i].getNombre() ); 
				System.out.println("Ciudad :"+aeropuertos[i].getCiudad() ); 
				System.out.println("Pais  :"+aeropuertos[i].getPais() );
			}
			
		}
	} // Final Metodo    

	// 2. Ver Empresas (Privado ) o Subvencion Publico ");OPCION 2 
	// Si es un Aeropuerto Privado mostrar Empresas si es  Publico mostrar la Subvencion   

	public static void MostrarPatrocinio(Aeropuerto aeropuertos[]) { 
		String empresas [];
			
		for (int i = 0 ; i<aeropuertos.length ; i++){
			if (aeropuertos[i] instanceof Aeropuerto_Privado ){
				System.out.println("\tAeropuerto Privado :"+aeropuertos[i].getNombre()  ); 
				// DownCasting  
				empresas= ((Aeropuerto_Privado)aeropuertos[i]).getListaEmpresas() ;  
				
				for (int j = 0 ; j<empresas.length ; j++){
					System.out.println(empresas[j]); 
					System.out.println("");
				}

			}
			else {
				System.out.println("\tAeropuerto Publico :" +" "+aeropuertos[i].getNombre());  
				// Los Aeropuerto lo guardamos en un arreglo de aeropuerto publico 


				System.out.println("Subvencion :"+((Aeropuerto_Publico)aeropuertos[i]).getSubvencion() ); 
				System.out.println("");
			}
		}
	}// Final  
	// 3. Lista Companias de un Aeropuerto 
	// Retornar un Aeropuerto  
	public static Aeropuerto BuscarAeropuerto(String Nombre , Aeropuerto aeropuertos []) {
		boolean encontrado = false ;  
		int i = 0 ;  
		Aeropuerto aero = null ;   

		while((!encontrado ) && (i<aeropuertos.length)){
			if (Nombre.equals(aeropuertos[i].getNombre() )){
				encontrado= true ;  
				aero = aeropuertos[i];
			}
			
			i++;
		}
		return aero;
	} 

	public static void MostrarCompanias(Aeropuerto aeropuerto) { 

		System.out.println("Las Compañias del Aeropuerto :" +aeropuerto.getNombre() ) ;
		for(int i = 0 ; i<aeropuerto.getNumeroCompania() ; i++){
			System.out.println(aeropuerto.getCompania(i).getNombre()); 
		}

	} 

	// Hacer que si aeoropuerto si Existe , Preguntar cual Compañia 
	public static void MostrarVuelos (Compania compani) { 
		Vuelo vuelos ;   
		System.out.println("Los Vuelos de la Compañia ->"+compani.getNombre()); 

		for(int i = 0 ; i<compani.getNumeroVuelo() ; i++){ 
			vuelos= compani.getVuelo(i);
			System.out.println("Indentificador : "+vuelos.getIndentificador() ); 
			System.out.println("Ciudad Origen "+vuelos.getCiudad_O()); 
			System.out.println("Ciudad Destino : "+vuelos.getCiudad_D()); 
			System.out.println("Precio : "+vuelos.getPrecio());
		}
	}  

	public static Vuelo[] BuscarVuelosOrigenDestino (String origen , String destino ,Aeropuerto aeropuerto[]){
		Vuelo vuelo ;  
		int contador = 0 ;  

		Vuelo listaVuelos[];

		for (int i = 0 ; i<aeropuerto.length ; i++){ // Recorremos los aeropuertos 

				// Recorremos las compañias 
			for (int j =0 ; j<aeropuerto[i].getNumeroCompania() ; j++){// Cada Aeropuerto tiene compañias   

				// Recorremos los Vuelos  
				for (int k =0 ; k<aeropuerto[i].getCompania(j).getNumeroVuelo() ; k++){
						vuelo = aeropuerto[i].getCompania(j).getVuelo(k);
						if ((origen.equals(vuelo.getCiudad_O()) && (destino.equals(vuelo.getCiudad_D())))){
							contador++;
						}
				}
			}
		}

		 listaVuelos  = new Vuelo [contador];   
		 int q=0 ;

		 for (int i = 0 ; i<aeropuerto.length ; i++){  // recorrer los aeopuertos 
			for(int j =0 ; j<aeropuerto[i].getNumeroCompania() ; j++){ //Recorrer aerpuerto pero con recorrer la lista de las companias 

				for (int k =0  ; k<aeropuerto[i].getCompania(j).getNumeroVuelo(); k++){ // recorro aepuerto dentro de la compañia .hay vuelos numeros vuelos 
					vuelo = aeropuerto[i].getCompania(j).getVuelo(k); 

					if ((origen.equals(vuelo.getCiudad_O()) && (destino.equals(vuelo.getCiudad_D())))){
						listaVuelos[q] =vuelo ; 
						q++;
					}
				}

			}
		 } 

		 return listaVuelos;

	}



	public static void MostrarVueloOrigenADestino(String origen , String destino ,Aeropuerto aeropuerto[]){

		Vuelo vuelos[] ; 
		vuelos= BuscarVuelosOrigenDestino(origen, destino, aeropuerto); 

		if (vuelos.length ==0){
			System.out.println("No Existe Vuelos de esa ciudad origen a destino  ");
		}
		else {
			System.out.println("\nVuelos Encontrados "); 
			for(int i = 0 ; i<vuelos.length ; i++){ 
				System.out.println("Indentificador de Vuelo : "+vuelos[i].getIndentificador()); 
				System.out.println("Ciudad Origen :"+vuelos[i].getCiudad_O()); 
				System.out.println("Ciudad Destino :"+vuelos[i].getCiudad_D()); 
				System.out.println("Precio vuelo : $"+vuelos[i].getPrecio()); 
				System.out.println("");
			}
		}
	}

	

	
	

}
