package cifradoCesar.cifrado;

import CifradoCesar.Cifrador.creaCifrador;

public class Main {
	public static void main(String [] args) {
		//String [] parametro=new String[] {"-h"};
		//String []parametro=new String[]{"-d" ,"90","--file","/home/alumno/proyectopatrones/cifradoCesar/src/cifradoCesar/cifrado/archivo.txt","-o","cifrar","-a","ingles"};
		 String []parametro=new String[]{"-d" ,"4","-t","hola","-o","cifrar","-a","ingles"};
		 
		  Parametros parametros=new Parametros(parametro);
			Validador validador=new Validador(parametros.getParametros());
			       // System.out.println(validador.esValido());
			        Mensaje m=new Mensaje();
			        creaCifrador cc= new creaCifrador(parametros);
			        	
			        			if(validador.esValido())
								  System.out.println(cc.operar());
								else 
									m.mensajeErrores(validador.erroresIdentificado());
		          
		          //LeerArchivo l=new LeerArchivo("/home/alumno/proyectopatrones/cifradoCesar/src/cifradoCesar/cifrado/archivos.txt");
		         // System.out.println(l.contenido());
		/*ArgumentoNombreOpcion nombreOpcion=new ArgumentoNombreOpcion("-a");
		ArgumentoValorOpcion valorOpcion=new ArgumentoValorOpcion("ingles");
		System.out.println(valorOpcion.esValido(nombreOpcion));
		System.out.println("   ".trim().length());
	*/}

}
