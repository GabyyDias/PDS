package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_cadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel txtGenero;
	private JTextField txtNome;
	private JTextField textField_1;
	private JTextField txtNacionalidade;
	private JTextField txtCep;
	private JTextField txtEndereco;
	private JTextField txtSobrenome;
	private JTextField txtData;
	private JTextField txtCpf;
	private JTextField txtEstado;
	private JTextField txtTelefone;
	private JTextField txtRg;
	private JTextField txtEmail;
	private JTextField txtCidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_cadastro frame = new Tela_cadastro();
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
	public Tela_cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		txtGenero = new JPanel();
		txtGenero.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(txtGenero);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(5, 5, 420, 1080);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\menu lateral.png"));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(453, 16, 1500, 62);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\Location.png"));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(435, 175, 1455, 126);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\cadastrar.png"));
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(553, 413, 44, 16);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtNome = new JTextField();
		txtNome.setBounds(553, 440, 206, 20);
		txtNome.setColumns(25);
		
		JLabel lblGenero = new JLabel("Gênero:");
		lblGenero.setBounds(553, 503, 100, 16);
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		textField_1 = new JTextField();
		textField_1.setBounds(553, 530, 206, 20);
		textField_1.setColumns(25);
		
		JLabel lblNacionalidade = new JLabel("Nacionalidade:");
		lblNacionalidade.setBounds(553, 600, 100, 16);
		lblNacionalidade.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtNacionalidade = new JTextField();
		txtNacionalidade.setBounds(553, 622, 206, 20);
		txtNacionalidade.setColumns(25);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(553, 692, 100, 16);
		lblCep.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtCep = new JTextField();
		txtCep.setBounds(553, 714, 206, 20);
		txtCep.setColumns(25);
		
		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setBounds(553, 777, 100, 16);
		lblEndereco.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(553, 804, 206, 20);
		txtEndereco.setColumns(25);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(930, 413, 100, 16);
		lblSobrenome.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(930, 440, 206, 20);
		txtSobrenome.setColumns(25);
		
		JLabel lblData = new JLabel("Data de Nascimento:");
		lblData.setBounds(930, 503, 150, 16);
		lblData.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtData = new JTextField();
		txtData.setBounds(930, 530, 206, 20);
		txtData.setColumns(25);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(930, 600, 100, 16);
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtCpf = new JTextField();
		txtCpf.setBounds(930, 622, 206, 20);
		txtCpf.setColumns(25);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(930, 692, 100, 16);
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtEstado = new JTextField();
		txtEstado.setBounds(930, 714, 206, 20);
		txtEstado.setColumns(25);
		
		JLabel lblTelefone = new JLabel("telefone:");
		lblTelefone.setBounds(930, 777, 100, 16);
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(930, 804, 206, 20);
		txtTelefone.setColumns(25);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(1399, 413, 100, 16);
		lblRg.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtRg = new JTextField();
		txtRg.setBounds(1399, 440, 206, 20);
		txtRg.setColumns(25);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(1399, 503, 100, 16);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtEmail = new JTextField();
		txtEmail.setBounds(1399, 530, 206, 20);
		txtEmail.setColumns(25);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(1399, 600, 100, 16);
		lblCidade.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtCidade = new JTextField();
		txtCidade.setBounds(1399, 622, 206, 20);
		txtCidade.setColumns(25);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(1417, 804, 0, 0);
		txtGenero.setLayout(null);
		txtGenero.add(lblSobrenome);
		txtGenero.add(txtSobrenome);
		txtGenero.add(lblData);
		txtGenero.add(txtData);
		txtGenero.add(lblCpf);
		txtGenero.add(txtCpf);
		txtGenero.add(lblEstado);
		txtGenero.add(txtEstado);
		txtGenero.add(lblTelefone);
		txtGenero.add(txtTelefone);
		txtGenero.add(lblRg);
		txtGenero.add(txtRg);
		txtGenero.add(lblEmail);
		txtGenero.add(txtEmail);
		txtGenero.add(lblCidade);
		txtGenero.add(txtCidade);
		txtGenero.add(lblNewLabel_4);
		txtGenero.add(lblNewLabel);
		txtGenero.add(lblNewLabel_1);
		txtGenero.add(lblNewLabel_2);
		txtGenero.add(txtNome);
		txtGenero.add(lblNome);
		txtGenero.add(lblGenero);
		txtGenero.add(textField_1);
		txtGenero.add(lblNacionalidade);
		txtGenero.add(txtNacionalidade);
		txtGenero.add(lblCep);
		txtGenero.add(txtCep);
		txtGenero.add(lblEndereco);
		txtGenero.add(txtEndereco);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
				textField_1.setText("");
				txtNacionalidade.setText("");
				txtCep.setText("");
				txtEndereco.setText("");
				txtSobrenome.setText("");
				txtData.setText("");
				txtCpf.setText("");
				txtEstado.setText("");
				txtTelefone.setText("");
				txtRg.setText("");
				txtEmail.setText("");
				txtCidade.setText("");
				
				
			}
		});
		btnCancelar.setBounds(1400, 803, 200, 30);
		txtGenero.add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(1399, 739, 200, 30);
		txtGenero.add(btnSalvar);
	}
}
