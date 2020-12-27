package oo.heranca.game;

public class Jogo {

	public static void main(String[] args) {
		
//		Jogador j1 = new Jogador();
		Jogador monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
//		Jogador j2 = new Jogador();
		Jogador heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;
		
		System.out.println("Monstro tem ==> " + monstro.vida + " vidas");
		System.out.println("Heroi tem ====> " + heroi.vida + " vidas");
		
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem ==> " + monstro.vida + " vidas");
		System.out.println("Heroi tem ====> " + heroi.vida + " vidas");
		

	}

}
