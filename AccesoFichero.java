package autobusesxml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class AccesoFichero {

	public static void grabarHML(String html) {
		// TODO Auto-generated method stub
		FileWriter fw;
		try {
			fw = new FileWriter("C:\\proyectosjava\\temperaturas2xml\\clima.html");
			fw.write(html);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}



}
