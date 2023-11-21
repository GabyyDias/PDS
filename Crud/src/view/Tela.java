package view;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel labelNome;
	private JTextField txtNome;
	private JLabel lblNewLabel;
	private JTextField txtCPF;
	private JTextField txtTelefone;
	private JTextField txtIdade;
	private JTextField txtAltura;
	private JTextField txtPeso;
	ArrayList< Pessoa > listaPessoas = new ArrayList< Pessoa >();
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 344, 391, 95);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int linha = table.getSelectedRow();
				Pessoa pessoaSelecionada = listaPessoas.get(linha);
				JOptionPane.showMessageDialog(null, "Pessoa Selecionada: " + pessoaSelecionada.getNome());
			}
		});
		atualizarJTableModel();
		scrollPane.setViewportView(table);

		labelNome = new JLabel("Nome: ");
		labelNome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		labelNome.setBounds(15, 79, 46, 14);
		contentPane.add(labelNome);

		txtNome = new JTextField();
		txtNome.setBounds(15, 104, 146, 36);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(193, 79, 46, 14);
		contentPane.add(lblNewLabel);

		txtCPF = new JTextField();
		txtCPF.setBounds(193, 104, 132, 36);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);

		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpf = txtCPF.getText();
				Integer telefone = Integer.parseInt(txtTelefone.getText());
				Integer idade = Integer.parseInt(txtIdade.getText());
				Float peso = Float.parseFloat(txtPeso.getText());
				Float altura = Float.parseFloat(txtAltura.getText());

				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setCpf(Integer.parseInt(cpf));
				p.setTelefone(telefone);
				p.setIdade(idade);
				p.setPeso(peso);
				p.setAltura(altura);

				listaPessoas.add(p);

				atualizarJTableModel();
				limparCampos();

			}
		});
		btnNewButton.setBounds(49, 297, 125, 36);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int linhaparaexc = table.getSelectedRow();

				int cpf = (int) table.getValueAt(linhaparaexc, 1);

				for (Pessoa pessoa : listaPessoas) {
					if (pessoa.getCpf() == cpf) {
						listaPessoas.remove(pessoa);
					}
				}

				atualizarJTableModel();
			}
		});
		btnNewButton_1.setBounds(190, 297, 109, 36);
		contentPane.add(btnNewButton_1);

		btnNewButton_2 = new JButton("Alterar");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int linhaparaexc = table.getSelectedRow();

				int cpf = (int) table.getValueAt(linhaparaexc, 1);

				for (Pessoa pessoa : listaPessoas) {
					if (pessoa.getCpf() == cpf) {
						 // pegar os valores digitados nos campos de texto
						// setar no obj do arraylist
					}
				}

				atualizarJTableModel();
			}
		});
		btnNewButton_2.setBounds(316, 297, 97, 36);
		contentPane.add(btnNewButton_2);

		txtTelefone = new JTextField();
		txtTelefone.setBounds(15, 207, 153, 36);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);

		txtIdade = new JTextField();
		txtIdade.setBounds(193, 207, 132, 36);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);

		txtAltura = new JTextField();
		txtAltura.setBounds(342, 104, 132, 36);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		txtPeso = new JTextField();
		txtPeso.setBounds(346, 207, 128, 36);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Telefone:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1.setBounds(15, 182, 62, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Idade:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_2.setBounds(190, 182, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Peso:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_3.setBounds(346, 182, 46, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Altura:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_4.setBounds(346, 79, 46, 14);
		contentPane.add(lblNewLabel_4);
	}

	public void atualizarJTableModel() {
		table.setModel(new Modelpessoa (listaPessoas));

	}

	public void limparCampos() {
		txtNome.setText("");
		txtCPF.setText("");
		txtTelefone.setText("");
		txtIdade.setText("");
		txtPeso.setText("");
		txtAltura.setText("");
	}
}
