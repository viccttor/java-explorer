package br.com.javaExplorer.jdbc.alterar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.javaExplorer.jdbc.Pessoa;
import br.com.javaExplorer.jdbc.conexao.FabricaConexao;

public class AlterarPessoa {

	public static void main(String[] args) throws SQLException {
		
		String select = "SELECT * FROM pessoas WHERE nome LIKE ?";

		Scanner scanner = new Scanner(System.in);
		Connection connection = FabricaConexao.getConnection();
		
		System.out.print("Digite o valor para pesquisa: ");
		String valor = scanner.nextLine();
		
		PreparedStatement preparedStatement = connection.prepareStatement(select);
		preparedStatement.setString(1, "%" + valor + "%");
		ResultSet resultadoBusca = preparedStatement.executeQuery();
		
		List<Pessoa> pessoa = new ArrayList<>();

		while (resultadoBusca.next()) {
			int codigo = resultadoBusca.getInt("codigo");
			String nome = resultadoBusca.getString("nome");
			pessoa.add(new Pessoa(codigo, nome));
		}

		for (Pessoa p : pessoa) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}
		preparedStatement.close();
		
		
		System.out.print("Digite o codigo que deseja alterar: ");
		int codigoAlteracao = scanner.nextInt();
		System.out.print("Digite o novo nome: ");
		String novoNome1 = scanner.nextLine();
		String novoNome = scanner.nextLine();
		
		String update = "UPDATE pessoas SET nome = ? WHERE codigo LIKE ?  ";
		
		preparedStatement = connection.prepareStatement(update);	
		preparedStatement.setString(1, novoNome);
		preparedStatement.setInt(2, codigoAlteracao);
		preparedStatement.execute();
		
		System.out.println("Alteração realizado com Sucesso! Novo nome: " + novoNome1 + novoNome);
		
		preparedStatement.close();
		connection.close();
		scanner.close();

	}

}
