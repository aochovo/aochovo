package autobusesxml;

import java.util.ArrayList;

public class PintaHTML {

	public static String crearPagina(ArrayList<Clima> lista_climas) {
		// TODO Auto-generated method stub
		String municipio=lista_climas.get(0).getMunicipio();
		String html_pagina="<html><head><title>Predicción para "+municipio+"</title></head><body><table border=1>";
		html_pagina+="<tr><th>Día</th><th>T min</th><th>T max</th></tr>";
		for(int i=0; i<lista_climas.size(); i++)
		{
			html_pagina+=lista_climas.get(i).pintarFila();
		}
		html_pagina+="</table>";
		return html_pagina;
	}

}
