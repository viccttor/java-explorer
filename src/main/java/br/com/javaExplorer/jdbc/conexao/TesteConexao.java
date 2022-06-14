package br.com.javaExplorer.jdbc.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {

		final String URL = "jdbc:mysql://localhost";
		final String USER = "root";
		final String PASSWORD  = "mysql";
		
		Connection conexao = DriverManager.getConnection(URL, USER, PASSWORD);
		
		System.out.println("Conexão efetuada!");
		conexao.close();
	}

}
