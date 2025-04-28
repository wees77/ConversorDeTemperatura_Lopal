package br.dev.weslei.gui;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Format;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class TelaConversor {
	private JTextField txtCelsius;
	private JLabel lblCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel lblResultado;
	private JLabel lblMensagemErro;
	private JButton buttonLimpar;
	
	public void criarTela(){
		JFrame tela = new JFrame();
		tela.setSize(400, 500);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(true);
		tela.setTitle("Conversor de Temperatura");
		
		// Caixa temperatura Celsius
		lblCelsius = new JLabel();
		lblCelsius.setText("Temperatura em graus Celsius: ");
		lblCelsius.setBounds(20, 10, 200, 20);
		
		txtCelsius = new JTextField(); 
		txtCelsius.setBounds(20, 30, 340, 40);
		
		// Botao Fahreinheit
		buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("FAHREINHEIT");
		buttonFahreinheit.setBounds(20, 75, 160, 40);
		
		// Botao Kelvin
		buttonKelvin = new JButton();
		buttonKelvin.setText("KELVIN");
		buttonKelvin.setBounds(200, 75, 160, 40);
		
		// Campo resultado
		lblResultado = new JLabel();
		lblResultado.setBounds(100, 140, 250, 40);
		lblResultado.setFont(new Font("Arial", Font.BOLD, 22));
		
		// Configurar listeners dos botoes
		buttonFahreinheit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double celsius = Double.parseDouble(txtCelsius.getText());
					double fahreinheit = (celsius * 9/5) + 32;
					lblResultado.setText(String.format("%.2f", fahreinheit ) + " Fahreinheit");
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(tela, "Por favor, insira um valor válido.");
				}
				
				
				
			}
		});
		
		buttonKelvin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double celsius = Double.parseDouble(txtCelsius.getText());
					double kelvin = celsius + 273.15;
					lblResultado.setText(String.format("%.2f", kelvin) + " Kelvin");
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(tela, "Por favor, insira um valor válido.");
				}
				
			}
		});
	
				
		// Adicionar componentes ao painel de conteudo
		tela.getContentPane().add(lblCelsius);
		tela.getContentPane().add(txtCelsius);
		tela.getContentPane().add(buttonFahreinheit);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(lblResultado);
		
		
		
		tela.setVisible(true);
	
		
		 
		
	}

}
