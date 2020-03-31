package autobusesxml;

import java.io.FileWriter;
import java.io.IOException;

public class GrabarFichero {

	public static void grabarLinea(String html_tabla, String ruta_fichero) {
		
			try 
	                {   
				FileWriter fw=new FileWriter(ruta_fichero, true);
				
				fw.write(html_tabla);
				fw.close();
			} 
	                
	                catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}


