import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.CalcRetangulo;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Exercicio1_RadioButton extends JFrame {

private static final long serialVersionUID = 1L;
private JPanel contentPane;
private JTextField textBase;
private JTextField textAltura;
private final ButtonGroup buttonGroup = new ButtonGroup();

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Exercicio1_RadioButton frame = new Exercicio1_RadioButton();
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
public Exercicio1_RadioButton() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 402, 300);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JRadioButton rdbtnArea = new JRadioButton("Área");
buttonGroup.add(rdbtnArea);
rdbtnArea.setBounds(63, 111, 109, 23);
contentPane.add(rdbtnArea);

JRadioButton rdbtnPerimetro = new JRadioButton("Perímetro");
buttonGroup.add(rdbtnPerimetro);
rdbtnPerimetro.setBounds(223, 111, 109, 23);
contentPane.add(rdbtnPerimetro);

JLabel lblResultado = new JLabel("");
lblResultado.setBounds(63, 155, 269, 14);
contentPane.add(lblResultado);

JButton btnCalcular = new JButton("Calcular");
btnCalcular.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {


String altura = textAltura.getText();

Float alturaF = Float.valueOf(altura);

String base = textBase.getText();

Float baseF = Float.valueOf(base);

CalcRetangulo calc = new CalcRetangulo();

Float area = calc.calcularArea(baseF, alturaF);

Float perimetro = calc.calcularPerimetro(baseF, alturaF);

if(rdbtnArea.isSelected()) {
	
	lblResultado.setText("A área do retangulo é "+area);
}
else if(rdbtnPerimetro.isSelected()) {

	lblResultado.setText("O perimetro do retangulo é "+perimetro);
}

}
});
btnCalcular.setBounds(55, 192, 89, 23);
contentPane.add(btnCalcular);

JButton btnLimpar = new JButton("Limpar");
btnLimpar.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
textBase.setText("");
textAltura.setText("");
}
});
btnLimpar.setBounds(155, 192, 89, 23);
contentPane.add(btnLimpar);

JButton btnFechar = new JButton("Fechar");
btnFechar.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
setVisible(false);
}
});
btnFechar.setBounds(254, 192, 89, 23);
contentPane.add(btnFechar);

JLabel lblBase = new JLabel("Base:");
lblBase.setFont(new Font("Tahoma", Font.PLAIN, 15));
lblBase.setBounds(63, 44, 46, 14);
contentPane.add(lblBase);

JLabel lblAltura = new JLabel("Altura:");
lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 15));
lblAltura.setBounds(224, 44, 46, 14);
contentPane.add(lblAltura);

textBase = new JTextField();
textBase.setBounds(63, 69, 114, 20);
contentPane.add(textBase);
textBase.setColumns(10);

textAltura = new JTextField();
textAltura.setBounds(224, 69, 108, 20);
contentPane.add(textAltura);
textAltura.setColumns(10);

}
}
