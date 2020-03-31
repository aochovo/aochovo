package autobusesxml;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccesoBD {
	private static Connection c=null;
	private static Statement stmt=null;
	public static void conectar() {
		try {
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/españa","root","");
			stmt=c.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static ArrayList<Provincia> recuperarProvincias() {
		ArrayList<Provincia> lista_provincias=new ArrayList<Provincia>();
		
		String sql="SELECT * FROM provincias;";
		try {
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				String id_provincia=rs.getString("id_provincia");
				String provincia=rs.getString("provincia");
				Provincia p=new Provincia(provincia, id_provincia);
				lista_provincias.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista_provincias;
	}
	public static ArrayList<Municipio> buscarMunicipios(String cod_provincia) {
		
		ArrayList<Municipio> lista_municipios=new ArrayList<Municipio>();
		
		String sql="SELECT * FROM `municipios` WHERE `id_provincia`='"+cod_provincia+"'";
		try {
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				String id_municipio=rs.getString("cod_municipio");
				String municipio=rs.getString("nombre");
				Municipio p=new Municipio(municipio,id_municipio);
				lista_municipios.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista_municipios;
	}
}
