package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.ConversaoTemperatura;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Exercício1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTemperatura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercício1 frame = new Exercício1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exercício1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(77, 64, 20, -4);
		contentPane.add(lblNewLabel);
		
		JLabel lblTemperatura = new JLabel("Temperatura (F): ");
		lblTemperatura.setBounds(42, 64, 123, 14);
		contentPane.add(lblTemperatura);
		
		txtTemperatura = new JTextField();
		txtTemperatura.setBounds(141, 64, 104, 20);
		contentPane.add(txtTemperatura);
		txtTemperatura.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// pegar a temperatura digitada no componente do texto 
				String tempDigitada = txtTemperatura.getText(); 
				// converter a temperatura de string para float 
				float tempConvertidaF = Float.valueOf(tempDigitada); 
				// criar objeto da classe ConversaoTemperatura
				ConversaoTemperatura conv = new ConversaoTemperatura(); 
				// chamar método conversão 
				float tempC = conv.converterFtoC(tempConvertidaF); 
				// mostrar Temperatura convertida 
				JOptionPane.showMessageDialog(null, "Temperatura convertida: "+tempC);
			}
		});
		btnCalcular.setBounds(42, 95, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(151, 95, 89, 23);
		contentPane.add(btnFechar);
	}

}
