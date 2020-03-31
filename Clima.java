package autobusesxml;

public class Clima {
private String municipio;
private String dia;
private int t_min;
private int t_max;
public Clima(String municipio, String dia, int t_min, int t_max) {
	super();
	this.municipio = municipio;
	this.dia = dia;
	this.t_min = t_min;
	this.t_max = t_max;
}
public String getMunicipio() {
	return municipio;
}
public String getDia() {
	return dia;
}
public int getT_min() {
	return t_min;
}
public int getT_max() {
	return t_max;
}
public String pintarFila()
{
	String[] datos_fecha=dia.split("-");//aaaa-mm-dd
	String fecha=datos_fecha[2]+"/"+datos_fecha[1]+"/"+datos_fecha[0];
	String aux="<tr><td>"+fecha+"</td><td>"+t_min+"</td><td>"+t_max+"</td></tr>";
	return aux;
}

}