package utilidades;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import restaurante.Comanda;

public class ComandasOutPut {

	public void save(Iterator<Comanda> comandas) {

		while (comandas.hasNext()) {
			Comanda comanda = comandas.next();

			try {
				FileWriter file = new FileWriter("C:\\Users\\Mañana\\Documents\\Comanda.txt");

				file.write(comanda.toString());
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
