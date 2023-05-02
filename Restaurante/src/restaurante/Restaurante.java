package restaurante;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import utilidades.ComandasOutPut;

public class Restaurante {

	private ArrayList<Comanda> comandas;
    
    public Restaurante() {
       comandas = new ArrayList<Comanda>();
    }
    
    public void añadirComanda(String descripcion) {
        Comanda comanda = new Comanda(descripcion);
        comandas.add(comanda);
    }
    
//    public String listarComandasPendientes() {
//        for (Comanda comanda : comandas) {
//            comanda.getDescripcion();
//        }
//        return"Restaurante" + comandas ;
//    }
    
    public void eliminarComanda() {
       // int numeroComanda = 0;
        
    	
        Comanda comanda = comandas.remove(0);
    
    	//comandas.remove(0);
    }

	@Override
	public String toString() {
		return "Restaurante" + comandas ;
	}

	public void addComanda(Comanda comanda) {
		comandas.add(comanda);
		
	}

	public void atenderComanda(Comanda comanda) {
		
		boolean restultado = comandas.remove(comanda);
	}

	public void save() {

		ComandasOutPut co= new ComandasOutPut();
		co.save(comandas.iterator());
	}
	
	//public void EscribirFichero() throws IOException {
//        FileWriter fich = null;
//        PrintWriter pw = null;
//
//        try
//        {
//            fich = new FileWriter(namefile);
//            pw = new PrintWriter(fich);
//            int i=0;                                  
//
//             //Leemos texto de teclado y volcamos en fichero
//            Scanner miTeclado = new Scanner(System.in);            
//
//            //System.out.println("ESCRIBE TEXTO ACABADO EN '.': ");
//
//            String s = miTeclado.nextLine();                                          
//            while(!s.equals("."))
//            {
//                pw.print("Linea " + (++i) + ": ");
//                pw.println(s);
//                //pw.write(s);                
//                //pw.newLine();
//                s = miTeclado.nextLine();            
//            }
//
//        } 
//        catch (Exception e) 
//        {
//            e.printStackTrace();
//        } 
//        finally 
//        {
//           try 
//           {
//           // Aseguramos que se cierra el fichero.
//           if (pw != null)
//              pw.close();
//           } 
//           catch (Exception e2) 
//           {
//              e2.printStackTrace();
//           }
//        }
		//FileWriter fichero = new FileWriter("C:\\Users\\Mañana\\Documents\\Comanda.txt");
		// for (Comanda comanda : comandas) {
      //    fichero.write(comanda.getDescripcion() +"\n");
	//	 }
		
		//	fichero.close();
    //}

}
