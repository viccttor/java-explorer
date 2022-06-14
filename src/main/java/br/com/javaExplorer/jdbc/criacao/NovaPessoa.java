package br.com.javaExplorer.jdbc.criacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import br.com.javaExplorer.jdbc.conexao.FabricaConexao;

public class NovaPessoa {
	public static void main(String[] args) throws SQLException {

		Scanner scanner = new Scanner(System.in);
		Connection connection = FabricaConexao.getConnection();

		String sql = "INSERT INTO pessoas (nome) VALUES(?)";
		System.out.println(sql);

		System.out.print("Informe um nome: ");
		String nome = scanner.nextLine();
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.execute();
		System.out.println("Pessoa Incluída com Sucesso");

		System.out.println("FIM");

		scanner.close();

	}
}
