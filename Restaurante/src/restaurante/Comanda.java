package restaurante;

public class Comanda {

	private String descripcion;
	
	public Comanda(String descripcion) {
		
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public String toString() {
		return  descripcion ;
	}

	
}
