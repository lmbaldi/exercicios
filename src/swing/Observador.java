package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	
	public static void main(String[] args) {
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);//define o tamanho da tela
		janela.setLayout(new FlowLayout());//botao fica menor
		janela.setLocationRelativeTo(null);//centralizar
		
		JButton botao =  new JButton("Clicar");
		janela.add(botao);
		
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Evento ocorreu!");
			}
		});
		
		janela.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				
				
			}

			@Override
			public void focusLost(FocusEvent e) {
				
				
			}
			
		});
		
		janela.setVisible(true);
	}

}
