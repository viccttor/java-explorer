package br.com.javaExplorer.jdbc.criacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		final String URL = "jdbc:mysql://localhost";
		final String USER = "root";
		final String PASSWORD  = "mysql";
		
		Connection conexao = DriverManager.getConnection(URL, USER, PASSWORD);
		System.out.println("Conexão efetuada!");
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS cod3r_db");
		System.out.println("Banco criado com Sucesso!");
		
		conexao.close();

	}

}
