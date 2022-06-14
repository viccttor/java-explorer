package br.com.javaExplorer.jdbc.dao;

public class DaoTest {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT  INTO pessoas (nome) VALUES (?)";
		dao.incluir(sql, "João");
		dao.incluir(sql, "Gui");
		dao.incluir(sql, "Antonio");
		
	}

}
