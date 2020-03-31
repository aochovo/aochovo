package autobusesxml;

import java.util.ArrayList;
import java.util.Scanner;

public class EntradaSalida {

	public static String pedirProvincia() {
		System.out.println("¿Cual es la provincia donde se encuentra su municipio?");
		Scanner sc=new Scanner(System.in);
		String cod_provincia=sc.nextLine();
		return cod_provincia;
		
	}
	public static String pedirMunicipio() {
		System.out.println("¿Cual es su municipio?");
		Scanner sc=new Scanner(System.in);
		String cod_provincia=sc.nextLine();
		return cod_provincia;
		
	}
	public static void mostrarArrayList(ArrayList<Provincia> lista)
	{
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
	public static void mostrarArrayList2(ArrayList<Municipio> lista)
	{
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
	public static String crearCodigo(String cod_provincia) {
		if(cod_provincia.length()<2)
		{
			cod_provincia="0"+cod_provincia;
			return cod_provincia;
		}
		else
		{
			return cod_provincia;
		}
	}
	public static String crearCodigo2(String cod_municipio) {
		while(cod_municipio.length()<3)
		{
			cod_municipio="0"+cod_municipio;
		}
		return cod_municipio;
	}

}
