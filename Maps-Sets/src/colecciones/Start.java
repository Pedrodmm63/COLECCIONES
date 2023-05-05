package colecciones;

import java.util.HashMap;
import java.util.Iterator;


public class Start {

	public static void main(String[] args) {

		Coche ford = new Coche("33690GBD", "FORD","Azul",220);
		Coche ferrari = new Coche("33694GBD", "Ferrari","Rojo", 250);
		Coche masserati = new Coche("33680GBD", "Masserati","Negro", 280);
		Coche ford2 = new Coche("33690GBD", "FORD2","Azul",220);


		HashMap<String, Coche> coches = new HashMap<String, Coche >();
	
		coches.put(ford.getMatricula(), ford);
		coches.put(ferrari.getMatricula(), ferrari);
		coches.put(masserati.getMatricula(), masserati);
		coches.put(ford2.getMatricula(), ford2);
		
		Iterator<String> llaves = coches.keySet().iterator();
		while(llaves.hasNext() ) {
			String llave = llaves.next();
			Coche coche = coches.get(llave);
			
			System.out.println(llave + " >> " + coche);
		}
	}
}
