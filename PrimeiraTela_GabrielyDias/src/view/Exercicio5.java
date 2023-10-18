package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Preco;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Exercicio5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtQuilo;
	private JTextField txtPeso;
	private JLabel lblPreco;
	private JLabel lblPeso;
	private JButton btnLimpar;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio5 frame = new Exercicio5();
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
	public Exercicio5() {
		setTitle("Calcular valor do prato");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 328, 247);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 242, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtQuilo = new JTextField();
		txtQuilo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtQuilo.setBounds(142, 33, 86, 25);
		contentPane.add(txtQuilo);
		txtQuilo.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPeso.setText("");
		txtPeso.setBounds(142, 69, 86, 25);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setForeground(new Color(255, 255, 255));
		btnCalcular.setBackground(new Color(193, 220, 253));
		btnCalcular.setFont(new Font("Arial", Font.BOLD, 12));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPeso.getText();
				float precoQuilo = Float.valueOf(txtQuilo.getText());
				float peso = Float.valueOf(txtPeso.getText());
				Preco p = new Preco();
				float preco = p.calcularPreco(precoQuilo, peso);
				JOptionPane.showMessageDialog(null, "O valor a pagar é R$" + String.format("%.2f", preco));
			}	
		});
		btnCalcular.setBounds(31, 111, 125, 31);
		contentPane.add(btnCalcular);
		
		lblPreco = new JLabel("Preço:");
		lblPreco.setHorizontalAlignment(SwingConstants.LEFT);
		lblPreco.setFont(new Font("Corbel", Font.BOLD, 16));
		lblPreco.setBounds(70, 37, 79, 25);
		contentPane.add(lblPreco);
		
		lblPeso = new JLabel("Peso:");
		lblPeso.setHorizontalAlignment(SwingConstants.LEFT);
		lblPeso.setFont(new Font("Corbel", Font.BOLD, 16));
		lblPeso.setBounds(80, 69, 79, 25);
		contentPane.add(lblPeso);
		
		btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtQuilo.setText("");
				txtPeso.setText("");
			}
		});
		btnLimpar.setForeground(new Color(255, 255, 255));
		btnLimpar.setBackground(new Color(193, 220, 253));
		btnLimpar.setFont(new Font("Arial", Font.BOLD, 12));
		btnLimpar.setBounds(165, 111, 125, 30);
		contentPane.add(btnLimpar);
		
		btnNewButton = new JButton("Fechar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(193, 220, 253));
		btnNewButton.setBounds(117, 153, 89, 23);
		contentPane.add(btnNewButton);
	}

}