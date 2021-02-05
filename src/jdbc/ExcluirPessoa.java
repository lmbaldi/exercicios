package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o código da pessoa: ");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String sqlDelete = "DELETE FROM pessoas WHERE codigo = ?";
		String sqlConsulta = "SELECT nome FROM pessoas WHERE codigo = ?";
		
		
		//obtem o nome excluido
		//Statement stmtConsulta = conexao.createStatement();
		PreparedStatement stmtConsulta = conexao.prepareStatement(sqlConsulta);
		stmtConsulta.setInt(1, codigo);
		ResultSet resultado = stmtConsulta.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();

		while (resultado.next()) {
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		PreparedStatement stmtDelete = conexao.prepareStatement(sqlDelete);
		stmtDelete.setInt(1, codigo);
		
		int contador = stmtDelete.executeUpdate();
		
		if( contador > 0 ) {
			for (Pessoa p : pessoas) {
				System.out.println("A pessoa " + p.getNome() + " foi excluida com sucesso!");
			}
			System.out.println("Linhas afetadas: " + contador);
		} else {
			System.out.println("Pessoa  nao existe");
		}
		
		stmtConsulta.close();	
		stmtDelete.close();		

		conexao.close();
		entrada.close();

	}

}
