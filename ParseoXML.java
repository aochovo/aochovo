package autobusesxml;

import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;

public class ParseoXML {

	public static ArrayList<Clima> parsear(Document documento) {
		ArrayList<Clima> lista_climas=new ArrayList();
		Element elemento_raiz=documento.getRootElement();
		Element elemento_muni=elemento_raiz.getChild("nombre");
		Element elemento_prov=elemento_raiz.getChild("provincia");
		String municipio=elemento_muni.getValue();
		String provincia=elemento_prov.getValue();
		municipio=municipio+" ("+provincia+")";
		Element elemento_prediccion=elemento_raiz.getChild("prediccion");
		List<Element> objetos_dia=elemento_prediccion.getChildren("dia");
		for (Element elemento_dia : objetos_dia) {
			String fecha=elemento_dia.getAttribute("fecha").getValue();
			Element elm_temperatura=elemento_dia.getChild("temperatura");
			Element elm_t_min=elm_temperatura.getChild("minima");
			String t_min=elm_t_min.getValue();
			
			String t_max=elemento_dia.getChild("temperatura").getChild("maxima").getValue();
			
			Clima c=new Clima(municipio, fecha, Integer.parseInt(t_min), Integer.parseInt(t_max));
			lista_climas.add(c);
		}
		// TODO Auto-generated method stub
		return lista_climas;
	}

}