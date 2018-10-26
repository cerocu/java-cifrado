package cifradoCesar.cifrado;

import java.util.Map;

public class Mensaje {
	
	public Mensaje() {
		
	}
	public void mensajeErrores(Map<ArgumentoNombreOpcion,ArgumentoValorOpcion> mapita) {
		   for (Map.Entry<ArgumentoNombreOpcion,ArgumentoValorOpcion> d : mapita.entrySet()) {
			     if(!d.getKey().esValido()) {
			    	 System.out.println("opcion '"+d.getKey().getOpcion()+"' no es valido");
			     }
			     else {System.out.println("valor '"+d.getValue().getValorOpcion()+"' de la opcion '"+d.getKey().getOpcion()+"' no es valido");
			     }
		}
	}

}
