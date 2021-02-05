package jdbc;

import java.io.IOException;

public class DAOTest {

	public static void main(String[] args) throws IOException {
	
		DAO dao = new DAO();
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		dao.incluir(sql, "Thomas Sowell");
		dao.incluir(sql, "Alexis de Tocqueville");
		dao.incluir(sql, "Edmund Burke");
		
		dao.close();
	}

}
