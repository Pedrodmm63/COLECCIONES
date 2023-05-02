package go;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import restaurante.Comanda;
import restaurante.Restaurante;

public class Start {

	public static void main(String[] args) throws IOException {
		
		Restaurante restaurante = new Restaurante();
		Comanda comanda1 = new Comanda("Patatas");
		Comanda comanda2 = new Comanda("Merluza");
		Comanda comanda3 = new Comanda("Jamon");
		
		
//		restaurante.añadirComanda("Comanda 1");
//		restaurante.añadirComanda("Comanda 2");
//		restaurante.añadirComanda("Comanda 3");
		
		restaurante.addComanda(comanda1);
		restaurante.addComanda(comanda2);
		restaurante.addComanda(comanda3);
		
		//System.out.println(restaurante.listarComandasPendientes());
		System.out.println(restaurante);
		//restaurante.eliminarComanda();
		restaurante.atenderComanda(comanda2);
		System.out.println(restaurante);
		restaurante.save();
//		Scanner miTeclado = new Scanner(System.in);
//		//ESCRIBIMOS TEXTO DESDE TECLADO A FICHERO DE TEXTO
//        System.out.print("Da nombre del fichero de texto donde escribir: ");
//        String s1 = miTeclado.next();        
//        EscribirFichero(s1);
		//System.out.println(restaurante.listarComandasPendientes());
		

	}

}
