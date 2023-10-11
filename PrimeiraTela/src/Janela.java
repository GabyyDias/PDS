import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 219, 242));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHelloWorld = new JLabel("Hello world");
		lblHelloWorld.setForeground(new Color(78, 15, 111));
		lblHelloWorld.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "o foco está no JLabel");
			}
		});
		
		lblHelloWorld.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		lblHelloWorld.setBounds(193, 64, 72, 14);
		contentPane.add(lblHelloWorld);
		
		JButton lbnfechar = new JButton("fechar");
		lbnfechar.setBackground(new Color(236, 206, 242));
		lbnfechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); 
			}
		});
		lbnfechar.setForeground(new Color(78, 15, 111));
		lbnfechar.setFont(new Font("Serif", Font.BOLD, 12));
		lbnfechar.setBounds(287, 120, 89, 23);
		contentPane.add(lbnfechar);
		
		txtNome = new JTextField();
		txtNome.setForeground(new Color(78, 15, 111));
		txtNome.setBackground(new Color(200, 134, 221));
		txtNome.setBounds(174, 89, 139, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JButton lbnValidar = new JButton("validar");
		lbnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// pegar o texto digitado no JTextField (txtNome)
				String nome = txtNome.getText();
				// mostrar o nome digitado usando JOptionPane
				JOptionPane.showMessageDialog(null, "O nome digitado é: "+ nome); 
			}
		});
		lbnValidar.setFont(new Font("Serif", Font.BOLD, 12));
		lbnValidar.setForeground(new Color(78, 15, 111));
		lbnValidar.setBackground(new Color(236, 206, 242));
		lbnValidar.setBounds(188, 120, 89, 23);
		contentPane.add(lbnValidar);
		
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setForeground(new Color(73, 13, 106));
		lblNome.setBounds(127, 92, 46, 14);
		contentPane.add(lblNome);
		
		JButton btnNewButton = new JButton("Limpar");
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(78, 15, 111));
		btnNewButton.setBackground(new Color(236, 206, 242));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText(" ");
			}
		});
		btnNewButton.setBounds(78, 121, 100, 23);
		contentPane.add(btnNewButton);
	}
}
