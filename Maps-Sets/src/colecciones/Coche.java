package colecciones;

import java.util.Objects;

public class Coche {

	private String matricula;
	private String marca;
	private String color;
	private int potencia;
	
	
	public Coche(String matricula, String marca, String color, int potencia) {
		this.matricula = matricula;
		this.marca = marca;
		this.potencia = potencia;
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(matricula, other.matricula);
	}

	@Override
	public String toString() {
		return " Coche: " + marca;
	}
	
	
}
