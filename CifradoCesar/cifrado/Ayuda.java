package cifradoCesar.cifrado;

import java.util.HashMap;
import java.util.Map;

public class Ayuda {
  Map<String,String> mapAyuda ;
	public Ayuda() 
	{
		mapAyuda=new HashMap<>();
	    mapAyuda.put("-d", "valor ha desplzar");
	    mapAyuda.put("--desplazamiento", "valor ha desplzar");
	    mapAyuda.put("-o", " operacion ha realizar cifrar o decifrar");
	    mapAyuda.put("--o", "operacion ha realizar cifrar o decifrar");
	    mapAyuda.put("-d", "valor numerico ha desplzar");
	    mapAyuda.put("--deplazamiento", "valor numerico ha desplzar");
	    mapAyuda.put("-t", "palabra o texto ha cifrar");
	    mapAyuda.put("--texto", "palabra o texto ha cifrar");
	    mapAyuda.put("-f", "archivo ha cifrar");
	    mapAyuda.put("--texto", "archivo ha cifrar");
	    mapAyuda.put("-t", "palabra o texto ha cifrar");
	    mapAyuda.put("--texto", "palabra o texto ha cifrar");
	    
	}
	public String toString() {
		   String representacion="[";
		   representacion+=""+mapAyuda;
		   return representacion;
	}
	
  

}
