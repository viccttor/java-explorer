package br.com.javaExplorer.jdbc.criacao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.javaExplorer.jdbc.conexao.FabricaConexao;

public class CriarTabelaPessoas {
	public static void main(String[] args) throws SQLException {
		
		Connection connection = FabricaConexao.getConnection();
		
		String sql=" CREATE TABLE IF NOT EXISTS pessoas("
				+ "codigo INT AUTO_INCREMENT PRIMARY KEY,"
				+ "nome VARCHAR(80) NOT NULL"
				+ ")";
		Statement statement = connection.createStatement();
		statement.execute(sql);
		
		System.out.println("Tabela Criada!");
		statement.close();
	}
}
