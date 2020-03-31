package autobusesxml;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class ClasePrincipal {

	public static void main(String[] args) {
		AccesoBD.conectar();
		ArrayList<Provincia> lista_provincias=AccesoBD.recuperarProvincias();
		EntradaSalida.mostrarArrayList(lista_provincias);
		String cod_provincia=EntradaSalida.pedirProvincia();
		String cod_provincia2=EntradaSalida.crearCodigo(cod_provincia);
		ArrayList<Municipio> lista_municipios=AccesoBD.buscarMunicipios(cod_provincia);
		EntradaSalida.mostrarArrayList2(lista_municipios);
		String cod_municipio=EntradaSalida.pedirMunicipio();
		String cod_municipio2=EntradaSalida.crearCodigo2(cod_municipio);
		SAXBuilder builder=new SAXBuilder();
		// TODO Auto-generated method stub
		String texto=PeticionWeb.hacerPeticion("http://www.aemet.es/xml/municipios/localidad_"+cod_provincia2+cod_municipio2+".xml");
		//abcdef
		//ab->Codigo provincia
		//cde->Codigo municipio
		InputStream stream;
		try {
			stream = new ByteArrayInputStream(texto.getBytes("UTF-8"));
			Document documento=builder.build(stream);
			ArrayList<Clima> lista_climas=ParseoXML.parsear(documento);
			String html=PintaHTML.crearPagina(lista_climas);
			AccesoFichero.grabarHML(html);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
