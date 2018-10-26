package cifradoCesar.cifrado;

public class Parametros {
	ClasificadorArgumentoOpcion parametros;
	ClasificadorArgumentoOpcion clasificador;
public	Parametros(ClasificadorArgumentoOpcion parametros){
		 this.parametros=parametros;
	}
public	Parametros(Object[]args){
	
	 this.parametros=new ClasificadorArgumentoOpcion(args);

}

public ClasificadorArgumentoOpcion getParametros() {
	return this.parametros;
}
public String getOperacion() {
	return parametros.operador().getValorOpcion();
}
public String getTexto() {
    {
		return parametros.texto().getValorOpcion();
	}
	
}
public String getDesplazamiento() {
	return parametros.desplazamiento().getValorOpcion();
}
public String getArchivo() {
       return parametros.archivo().getValorOpcion();
}
public String getAlfabeto() {
       return parametros.alfabeto().getValorOpcion();	
}
public String toString(){
	String re="[";
	re+="mapa"+this.parametros.toString();
	//re+="o"+this.getOperacion();
			return re;
	
}
}
