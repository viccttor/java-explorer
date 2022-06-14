package br.com.javaExplorer.jdbc.consulta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.javaExplorer.jdbc.Pessoa;
import br.com.javaExplorer.jdbc.conexao.FabricaConexao;

public class ConsultarPessoas {

	public static void main(String[] args) throws SQLException {

		Connection connection = FabricaConexao.getConnection();
		String sql = "SELECT * FROM pessoas";
		
		Statement statement = connection.createStatement();
		ResultSet resultado =  statement.executeQuery(sql);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}
		
		statement.close();
		connection.close();
		
	}

}
