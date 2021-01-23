package excecao.personalizadaB;
import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Bianca", -7);
			Validar.aluno(aluno);
			
		}catch(StringVaziaException e) {
			System.out.println(e.getMessage());
		}catch(NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Validar.aluno(null);
		} catch (NumeroForaIntervaloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (StringVaziaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Fim ");
		
	}

}
