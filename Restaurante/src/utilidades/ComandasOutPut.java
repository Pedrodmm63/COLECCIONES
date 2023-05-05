package utilidades;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import restaurante.Comanda;

public class ComandasOutPut {

	public void save(Iterator<Comanda> comandas) {

		try {
			FileWriter file = new FileWriter("C:\\Users\\Mañana\\Documents\\Comandas.txt");
			while (comandas.hasNext()) {
				Comanda comanda = comandas.next();
				file.write(comanda.toString() + "\n");
			}
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
