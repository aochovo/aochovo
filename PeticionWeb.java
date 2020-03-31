package autobusesxml;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class PeticionWeb {
	public static String hacerPeticion(String string) {
		String aux="";
		// TODO Auto-generated method stub
		try {
			URL direccion=new URL(string);
			URLConnection conexion_web = direccion.openConnection();
	        BufferedReader br = new BufferedReader(new InputStreamReader(conexion_web.getInputStream()));
	        String linea=br.readLine();
	        
	        while(linea!=null)
	        {
	        	
	        	aux+=linea;
	        	linea=br.readLine();
	        }
	        br.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aux;
	}
}