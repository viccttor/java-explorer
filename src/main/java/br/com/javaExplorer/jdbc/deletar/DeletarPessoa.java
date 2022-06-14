package br.com.javaExplorer.jdbc.deletar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.javaExplorer.jdbc.Pessoa;
import br.com.javaExplorer.jdbc.conexao.FabricaConexao;

public class DeletarPessoa {
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
		
		String delete = "DELETE FROM pessoas WHERE codigo = ?";
		System.out.print("Digite o código que deseja excluir: ");
		int cod = scanner.nextInt();
		
		preparedStatement = connection.prepareStatement(delete);
		preparedStatement.setInt(1, cod);
		preparedStatement.execute();
		
		System.out.println("Registro Excluído com Sucesso!");
		preparedStatement.close();
		connection.close();
		scanner.close();
	}
}
