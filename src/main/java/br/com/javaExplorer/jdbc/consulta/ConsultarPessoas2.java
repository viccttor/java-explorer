package br.com.javaExplorer.jdbc.consulta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.javaExplorer.jdbc.Pessoa;
import br.com.javaExplorer.jdbc.conexao.FabricaConexao;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = FabricaConexao.getConnection();
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor para pesquisa: ");
		String valor = sc.nextLine();
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, "%" + valor + "%");
		ResultSet resultado = preparedStatement.executeQuery();
		
		
		List<Pessoa> pessoa = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoa.add(new Pessoa(codigo,nome));
		}
		
		for(Pessoa p: pessoa) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}
		
		preparedStatement.close();
		connection.close();
		sc.close();
	}

}
