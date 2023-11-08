package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SpringLayout;

public class PostoCombustivel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtOleoDiesel;
	private JTextField txtGasComum;
	private JTextField txtGasAditivada;
	private JTextField txtEtanol;
	private JTextField txtPreco500;
	private JTextField txtPreco1L;
	private JTextField txtQuantidade500;
	private JTextField txtQuantidade2;
	private JTextField txtQuantAbas;
	private JTextField txtDias;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PostoCombustivel frame = new PostoCombustivel();
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
	public PostoCombustivel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tabela de Preco do Combustivel", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		
		
		
		JLabel lblOleoDiesel = new JLabel("Oleo Diesel:");
		
		txtOleoDiesel = new JTextField();
		txtOleoDiesel.setColumns(10);
		
		JLabel label = new JLabel("");
		
		JLabel label_1 = new JLabel("");
		
		JLabel lblNewLabel = new JLabel("Gas. Comum:");
		
		txtGasComum = new JTextField();
		txtGasComum.setColumns(10);
		
		JLabel label_2 = new JLabel("");
		
		JLabel lblGasAditivada = new JLabel("Gas. Aditivada:");
		
		JLabel label_3 = new JLabel("");
		
		txtGasAditivada = new JTextField();
		txtGasAditivada.setColumns(10);
		
		JLabel lblEtanol = new JLabel("Etanol:");
		
		JLabel label_4 = new JLabel("");
		
		JLabel label_5 = new JLabel("");
		
		txtEtanol = new JTextField();
		txtEtanol.setColumns(10);
		
		JLabel label_6 = new JLabel("");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Tabela de Preco do Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		
		
		JLabel lblPrecoFrascoMotor = new JLabel("Frasco 500ml");
		
		txtPreco500 = new JTextField();
		txtPreco500.setColumns(10);
		
		JLabel lblPrecoFrasco1L = new JLabel("Frasco 1L");
		
		txtPreco1L = new JTextField();
		txtPreco1L.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setLayout(new MigLayout("", "[78px][86px][68px][][61px][]", "[14px][24px][][][][][20px]"));
		
		
		JLabel lblQuantidade = new JLabel("    Quantidade");
		panel_2.add(lblQuantidade, "cell 1 0,alignx left,aligny top");
		
		JLabel lblValorPagar = new JLabel("Valor a Pagar");
		panel_2.add(lblValorPagar, "cell 3 0,alignx left,aligny top");
		
		JLabel lblTotalOleo = new JLabel("Total Oleo");
		panel_2.add(lblTotalOleo, "cell 5 0,alignx right,aligny top");
		
		JLabel lblValor500 = new JLabel("");
		panel_2.add(lblValor500, "cell 3 1,grow");
		
		JLabel lblTotal2 = new JLabel("");
		panel_2.add(lblTotal2, "cell 5 1,grow");
		
		JLabel lblOleoMotor500 = new JLabel("Frasco de 500ml");
		panel_2.add(lblOleoMotor500, "cell 0 2,alignx left,aligny center");
		
		txtQuantidade500 = new JTextField();
		panel_2.add(txtQuantidade500, "cell 1 2,alignx left,aligny center");
		txtQuantidade500.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("-");
		panel_2.add(lblNewLabel_3, "cell 5 3");
		
		JLabel lblOleoMotor1 = new JLabel("Frasco de 1L");
		panel_2.add(lblOleoMotor1, "cell 0 4,alignx left,aligny center");
		
		txtQuantidade2 = new JTextField();
		panel_2.add(txtQuantidade2, "cell 1 4,alignx left,aligny top");
		txtQuantidade2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("-");
		panel_2.add(lblNewLabel_2, "cell 3 4");
		
		JLabel lblNewLabel_4 = new JLabel("-");
		panel_2.add(lblNewLabel_4, "cell 5 4");
		
		JLabel lblNewLabel_1 = new JLabel("-");
		panel_2.add(lblNewLabel_1, "cell 3 5");
		
		JLabel lblValor1L = new JLabel("");
		panel_2.add(lblValor1L, "cell 3 6,grow");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setLayout(new MigLayout("", "[104px][10px][36px][10px][62px]", "[20px][20px][22px]"));
		
		
		JLabel lblCombustivel = new JLabel("Combustivel:");
		panel_3.add(lblCombustivel, "cell 0 0,alignx left,aligny center");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Oleo Diesel", "Gas.Comum", "Gas. Aditivada", "Etanol"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBox.setToolTipText("");
		panel_3.add(comboBox, "cell 2 0 3 1,alignx left,aligny top");
		
		JLabel lblQuantidadeAbas = new JLabel("Quantidade de Litros:");
		panel_3.add(lblQuantidadeAbas, "cell 0 1,alignx left,aligny center");
		
		txtQuantAbas = new JTextField();
		panel_3.add(txtQuantAbas, "cell 2 1 3 1,alignx left,aligny top");
		txtQuantAbas.setColumns(10);
		
		JLabel lblTotalComb = new JLabel("Total Combustivel:");
		panel_3.add(lblTotalComb, "cell 0 2 3 1,alignx right,aligny bottom");
		
		JLabel lblTotalComb2 = new JLabel("");
		panel_3.add(lblTotalComb2, "cell 4 2,grow");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setLayout(new MigLayout("", "[63px][24px][17px][5px][2px][10px][86px]", "[23px][6px][23px][15px]"));
		
		
		
		JRadioButton rdbtnVista = new JRadioButton("À vista");
		panel_4.add(rdbtnVista, "cell 0 0,alignx left,aligny top");
		
		JRadioButton rdbtnPrazo = new JRadioButton("À prazo");
		panel_4.add(rdbtnPrazo, "cell 0 2,alignx left,aligny top");
		
		JLabel lblDias = new JLabel("Dias:");
		panel_4.add(lblDias, "cell 2 0 3 3,alignx left,aligny center");
		
		txtDias = new JTextField();
		panel_4.add(txtDias, "cell 6 0 1 3,alignx left,aligny center");
		txtDias.setColumns(10);
		
		JLabel lblPagar = new JLabel("Total a Pagar:");
		panel_4.add(lblPagar, "cell 0 3 3 1,alignx right,aligny top");
		
		JLabel lblTotalPagar = new JLabel("");
		panel_4.add(lblTotalPagar, "cell 4 3 3 1,alignx left,growy");
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnCalculo = new JButton("Novo Cálculo");
		btnCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOleoDiesel.setText("");
				txtGasComum.setText("");
				txtGasAditivada.setText("");
				txtEtanol.setText("");
				txtPreco500.setText("");
				txtPreco1L.setText("");
				txtQuantidade500.setText("");
				txtQuantidade2.setText("");
				txtQuantAbas.setText("");
				txtDias.setText("");
			}
		});
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		SpringLayout sl_contentPane = new SpringLayout();
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnFechar, 459, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnFechar, 350, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnFechar, 439, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCalculo, 459, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCalculo, 186, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCalculo, 296, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCalcular, 459, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCalcular, 39, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCalcular, 128, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_4, 305, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_4, 259, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_4, 434, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_4, 487, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_3, 305, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_3, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_3, 434, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_3, 249, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_2, 165, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_2, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_2, 294, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_2, 487, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_1, 11, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_1, 241, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_1, 145, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_1, 482, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 11, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, 145, SpringLayout.NORTH, contentPane);
		contentPane.setLayout(sl_contentPane);
		panel.setLayout(new MigLayout("", "[1px][74px][1px][1px][1px][26px][50px][10px]", "[1px][20px][20px][20px][20px]"));
		panel.add(lblOleoDiesel, "cell 1 1,alignx left,aligny center");
		panel.add(txtOleoDiesel, "cell 5 1 3 1,alignx left,aligny top");
		panel.add(label, "cell 0 0,alignx left,aligny top");
		panel.add(label_1, "cell 5 1,alignx right,aligny center");
		panel.add(lblNewLabel, "cell 1 2,alignx left,aligny center");
		panel.add(txtGasComum, "cell 5 2 3 1,alignx left,aligny top");
		panel.add(label_2, "cell 2 2,alignx left,aligny center");
		panel.add(lblGasAditivada, "cell 1 3,alignx left,aligny center");
		panel.add(label_3, "cell 7 2,alignx left,aligny center");
		panel.add(txtGasAditivada, "cell 5 3 3 1,alignx left,aligny top");
		panel.add(lblEtanol, "cell 1 4,alignx left,aligny center");
		panel.add(label_4, "cell 3 3,alignx left,aligny center");
		panel.add(label_5, "cell 4 3,alignx left,aligny center");
		panel.add(txtEtanol, "cell 5 4 3 1,alignx left,aligny top");
		panel.add(label_6, "cell 0 0,alignx left,aligny top");
		contentPane.add(panel);
		contentPane.add(panel_1);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(13)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblPrecoFrascoMotor)
							.addGap(4)
							.addComponent(txtPreco500, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblPrecoFrasco1L)
							.addGap(21)
							.addComponent(txtPreco1L, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(lblPrecoFrascoMotor))
						.addComponent(txtPreco500, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(lblPrecoFrasco1L))
						.addComponent(txtPreco1L, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.add(panel_2);
		contentPane.add(panel_3);
		contentPane.add(panel_4);
		contentPane.add(btnCalcular);
		contentPane.add(btnCalculo);
		contentPane.add(btnFechar);
		
		JComboBox comboBox_1 = new JComboBox();
		contentPane.add(comboBox_1);
	}
}
