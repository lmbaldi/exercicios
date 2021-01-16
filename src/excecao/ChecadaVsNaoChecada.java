package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) {
		
		
		try {
			gerarError1();
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			gerarError2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Fim: ");
	}
	
	//excecao nao checada ou nao verificada
	private static void gerarError1() {
		throw new RuntimeException("ocorreu um erro bem legal #01");
		
	}

	//excecao checada ou verificada
	private static void gerarError2() throws Exception {
		
		try {
			throw new Exception("ocorreu um erro bem legal #02");
		}catch(Exception e) {
			System.out.println("Exception");
		}
		
	}

}
