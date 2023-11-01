import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Calculadora;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Exercicio2_RadioButton extends JFrame {

private static final long serialVersionUID = 1L;
private JPanel contentPane;
private JTextField Primeiro;
private JTextField Segundo;
private final ButtonGroup buttonGroup = new ButtonGroup();

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Exercicio2_RadioButton frame = new Exercicio2_RadioButton();
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
public Exercicio2_RadioButton() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 364, 272);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel lblPNI = new JLabel("Primeiro Número Inteiro:");
lblPNI.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblPNI.setBounds(22, 30, 152, 14);
contentPane.add(lblPNI);

JLabel lblSNI = new JLabel("Segundo Número Inteiro: ");
lblSNI.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblSNI.setBounds(22, 55, 171, 14);
contentPane.add(lblSNI);

Primeiro = new JTextField();
Primeiro.setBounds(173, 30, 152, 20);
contentPane.add(Primeiro);
Primeiro.setColumns(10);

Segundo = new JTextField();
Segundo.setBounds(173, 53, 152, 20);
contentPane.add(Segundo);
Segundo.setColumns(10);

JRadioButton Somar = new JRadioButton("+ Adição");
buttonGroup.add(Somar);
Somar.setBounds(22, 76, 109, 23);
contentPane.add(Somar);

JRadioButton Subtrair = new JRadioButton("- Subtração");
buttonGroup.add(Subtrair);
Subtrair.setBounds(22, 102, 109, 23);
contentPane.add(Subtrair);

JRadioButton Multiplicar = new JRadioButton("x Multiplicação");
buttonGroup.add(Multiplicar);
Multiplicar.setBounds(22, 128, 109, 23);
contentPane.add(Multiplicar);

JRadioButton Dividir = new JRadioButton("/ Divisão");
buttonGroup.add(Dividir);
Dividir.setBounds(22, 154, 109, 23);
contentPane.add(Dividir);

JLabel lblResposta = new JLabel("");
lblResposta.setBounds(121, 189, 109, 23);
contentPane.add(lblResposta);

JButton btnCalcular = new JButton("Calcular");
btnCalcular.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		int primeiro = Integer.valueOf(Primeiro.getText());
        int segundo = Integer.valueOf(Segundo.getText());
        Calculadora calculo = new Calculadora();
        int adicao = calculo.CalcSoma(primeiro, segundo);
        int subtracao = calculo.CalcSubtrair(primeiro, segundo);
        int multiplicacao = calculo.CalcMultiplicar(primeiro, segundo);
        int divisao = calculo.CalcDividir(primeiro, segundo);
        if(Somar.isSelected()) {
            lblResposta.setText("Resultado:"+adicao);
        }
        else if(Subtrair.isSelected()) {
            lblResposta.setText("Resultado:"+subtracao);
        }
        else if(Multiplicar.isSelected()) {
            lblResposta.setText("Resultado:"+multiplicacao);
        }
        else if(Dividir.isSelected()) {
            lblResposta.setText("Resultado:"+divisao);
        }
	}
});
btnCalcular.setBounds(22, 189, 89, 23);
contentPane.add(btnCalcular);
JButton btnNewButton = new JButton("fechar");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) { 
		setVisible(false);
	}
});
btnNewButton.setBounds(257, 193, 81, 19);
contentPane.add(btnNewButton);

}
}
