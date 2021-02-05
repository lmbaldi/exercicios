package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {

	public static void main(String[] args)  throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o código da pessoa: ");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String selectSql = "SELECT codigo,nome FROM pessoas WHERE codigo = ?";
		String updateSql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(selectSql);
		stmt.setInt(1,  codigo);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			
			System.out.println("O nome atual e " + p.getNome());
			entrada.nextLine();
			
			System.out.println("Informe o novo nome: ");
			String novoNome = entrada.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(updateSql);
			stmt.setString(1,  novoNome);
			stmt.setInt(2,  codigo);
			stmt.execute();
			
		} else {
			System.out.println("Pessoa não encontrada");
		}
		
		conexao.close();
		entrada.close();
		stmt.close();

	}

}
