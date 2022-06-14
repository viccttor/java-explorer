package br.com.javaExplorer.jdbc.conexao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
	
	public static Connection getConnection() throws SQLException {

		try {
			
			Properties prop = geProperties();
//			final String URL = "jdbc:mysql://localhost/cod3r_db";
//			final String USER = "root";
//			final String PASSWORD  = "mysql";
			final String URL = prop.getProperty("banco.url");
			final String USER = prop.getProperty("banco.user");
			final String PASSWORD  = prop.getProperty("banco.password");
		
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	private static Properties geProperties() throws IOException {
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		return prop;
		
	}
}
