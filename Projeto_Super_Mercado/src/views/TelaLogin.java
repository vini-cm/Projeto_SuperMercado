package views;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;

public class TelaLogin extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public TelaLogin() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField.setBounds(114, 178, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField_1.setBounds(114, 137, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel Nome = new JLabel("Nome");
		Nome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Nome.setBounds(30, 132, 65, 30);
		add(Nome);
		
		JLabel CPF = new JLabel("CPf");
		CPF.setFont(new Font("Tahoma", Font.PLAIN, 20));
		CPF.setBounds(30, 173, 65, 30);
		add(CPF);
		
		JButton botaoEntrar = new JButton("Entrar");
		botaoEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botaoEntrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botaoEntrar.setBounds(75, 219, 89, 23);
		add(botaoEntrar);
		
		Canvas canvas = new Canvas();
		canvas.setBounds(75, 10, 100, 100);
		add(canvas);

	}
}
