package colecciones;

import java.util.Iterator;
import java.util.TreeMap;


public class Start {

	public static void main(String[] args) {

		Coche ford = new Coche("33690GBD", "FORD","Azul",220, 2020);
		Coche ferrari = new Coche("33694GBD", "Ferrari","Rojo", 250, 2002);
		Coche masserati = new Coche("33680GBD", "Masserati","Negro", 280, 1987);
		Coche ford2 = new Coche("33690GBD", "FORD2","Azul",220,2023);


		TreeMap<Integer, Coche> coches = new TreeMap<Integer, Coche >();
	
		coches.put(ferrari.getAñoFabricacion(), ferrari);
		coches.put(masserati.getAñoFabricacion(), masserati);
		coches.put(ford.getAñoFabricacion(), ford);
		//coches.put(ford2.getMatricula(), ford2);
		
		System.out.println(coches.ceilingKey(2002));
		System.out.println(coches.floorKey(2002));
		System.out.println(coches.higherKey(2002));
		System.out.println(coches.lowerKey(2002));

		
		Iterator<Coche> misCoches = coches.values().iterator();
		while(misCoches.hasNext() ) {
//			String llave = llaves.next();
//			Coche coche = coches.get(llave);
//			
//			System.out.println(llave + " >> " + coche);
			System.out.println(misCoches.next());
		}
	}
}
