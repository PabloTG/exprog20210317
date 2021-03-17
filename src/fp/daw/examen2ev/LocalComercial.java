package fp.daw.examen2ev;

public class LocalComercial implements Alquilable {
	// atributos
	String direccion;
	
	// getter
	public String getDireccion() {
		return direccion;
	}
	
	// setter
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	// método de Alquilable
	@Override
	public float getPrecioAlquiler(int dias) {
		float precio = 0;
		// a completar cuando se conozca la fórmula específica
		return precio;
	}

}
