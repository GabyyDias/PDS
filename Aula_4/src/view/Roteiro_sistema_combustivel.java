package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Roteiro_sistema_combustivel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Roteiro_sistema_combustivel frame = new Roteiro_sistema_combustivel();
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
	public Roteiro_sistema_combustivel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Tabela de pre\u00E7os do combust\u00EDvel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Tabela do pre\u00E7o do \u00F3leo do motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Formas de pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JButton btnNewButton = new JButton("Novo Calculo");
		
		JButton btnNewButton_1 = new JButton("Calcular");
		
		JButton btnNewButton_2 = new JButton("Fechar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "\u00D3leo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(2)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(btnNewButton_1)
					.addGap(46)
					.addComponent(btnNewButton)
					.addGap(41)
					.addComponent(btnNewButton_2)
					.addGap(122))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_2))
					.addContainerGap())
		);
		panel_1_1.setLayout(new MigLayout("", "[][][][][grow]", "[][][][][]"));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Á vista");
		panel_1_1.add(rdbtnNewRadioButton, "cell 0 1");
		
		JLabel lblNewLabel_14 = new JLabel("Dias: ");
		panel_1_1.add(lblNewLabel_14, "cell 2 1");
		
		textField_9 = new JTextField();
		panel_1_1.add(textField_9, "cell 3 1,growx");
		textField_9.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Á prazo");
		panel_1_1.add(rdbtnNewRadioButton_1, "cell 0 2");
		
		JLabel lblNewLabel_15 = new JLabel("Total a pagar: ");
		panel_1_1.add(lblNewLabel_15, "cell 1 3");
		
		JLabel lblNewLabel_16_1_1_1 = new JLabel("           -");
		panel_1_1.add(lblNewLabel_16_1_1_1, "cell 3 3");
		panel_3.setLayout(new MigLayout("", "[][][][grow][grow]", "[][][][]"));
		
		JLabel lblNewLabel_11 = new JLabel("Combustível:");
		panel_3.add(lblNewLabel_11, "cell 1 1");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		panel_3.add(comboBox, "cell 3 1,growx");
		
		JLabel lblNewLabel_12 = new JLabel("Quantidade Litros:");
		panel_3.add(lblNewLabel_12, "cell 1 2");
		
		textField_8 = new JTextField();
		panel_3.add(textField_8, "cell 3 2,growx");
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Total Combustível: ");
		panel_3.add(lblNewLabel_13, "cell 1 3");
		
		JLabel lblNewLabel_16_1_1 = new JLabel("            -");
		panel_3.add(lblNewLabel_16_1_1, "cell 3 3");
		panel_2.setLayout(new MigLayout("", "[][][][][grow][][grow][][grow][][]", "[][][][]"));
		
		JLabel lblNewLabel_8 = new JLabel("Quantidade");
		panel_2.add(lblNewLabel_8, "cell 4 1,alignx center");
		
		JLabel lblNewLabel_9 = new JLabel("Valor a Pagar");
		panel_2.add(lblNewLabel_9, "cell 6 1,alignx center,aligny center");
		
		JLabel lblNewLabel_10 = new JLabel("Total Óleo");
		panel_2.add(lblNewLabel_10, "cell 8 1,alignx center");
		
		JLabel lblNewLabel_6 = new JLabel("Frasco de 500ml");
		panel_2.add(lblNewLabel_6, "cell 1 2");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		panel_2.add(textField_6, "cell 4 2,growx");
		
		JLabel lblNewLabel_16 = new JLabel("           -");
		panel_2.add(lblNewLabel_16, "cell 6 2");
		
		JLabel lblNewLabel_16_2 = new JLabel("         -");
		panel_2.add(lblNewLabel_16_2, "cell 8 2");
		
		JLabel lblNewLabel_7 = new JLabel("Frasco de 1L");
		panel_2.add(lblNewLabel_7, "cell 1 3");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		panel_2.add(textField_7, "cell 4 3,growx");
		
		JLabel lblNewLabel_16_1 = new JLabel("           -");
		panel_2.add(lblNewLabel_16_1, "cell 6 3");
		
		JLabel lblNewLabel_16_2_1 = new JLabel("         -");
		panel_2.add(lblNewLabel_16_2_1, "cell 8 3");
		panel_1.setLayout(new MigLayout("", "[][][][grow]", "[][][]"));
		
		JLabel lblNewLabel_4 = new JLabel("Frasco 500ml");
		panel_1.add(lblNewLabel_4, "cell 1 1");
		
		textField_4 = new JTextField();
		panel_1.add(textField_4, "cell 3 1,growx");
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Frasco 1L");
		panel_1.add(lblNewLabel_5, "cell 1 2");
		
		textField_5 = new JTextField();
		panel_1.add(textField_5, "cell 3 2,growx");
		textField_5.setColumns(10);
		panel.setLayout(new MigLayout("", "[][][][][grow]", "[][][][]"));
		
		JLabel lblNewLabel = new JLabel("Óleo Diesel:");
		panel.add(lblNewLabel, "cell 1 0");
		
		textField = new JTextField();
		panel.add(textField, "cell 3 0,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Gas. Comum:");
		panel.add(lblNewLabel_1, "cell 1 1");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "cell 3 1,growx");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Gas. Aditivada:");
		panel.add(lblNewLabel_2, "cell 1 2");
		
		textField_2 = new JTextField();
		panel.add(textField_2, "cell 3 2,growx");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Etanol:");
		panel.add(lblNewLabel_3, "cell 1 3");
		
		textField_3 = new JTextField();
		panel.add(textField_3, "cell 3 3,growx");
		textField_3.setColumns(10);
		contentPane.setLayout(gl_contentPane);
	}
}
