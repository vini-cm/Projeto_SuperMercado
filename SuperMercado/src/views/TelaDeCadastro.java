package views;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaDeCadastro extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textNome;
	private JTextField textCpf;
	private JButton btnCadastrar;
	private String nome, cpf;
	/**
	 * Create the panel.
	 */
	public TelaDeCadastro() {
		setLayout(null);
		
		JLabel lblTituloCadastro = new JLabel("CADASTRO");
		lblTituloCadastro.setBounds(155, 5, 139, 35);
		lblTituloCadastro.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
		add(lblTituloCadastro);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textNome.setBounds(231, 70, 113, 31);
		add(textNome);
		textNome.setColumns(10);
		nome = textNome.getText();
		textCpf = new JTextField();
		textCpf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textCpf.setBounds(231, 140, 113, 31);
		add(textCpf);
		textCpf.setColumns(10);
		cpf = textCpf.getText();
		
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCadastrar.setBounds(172, 239, 106, 35);
		add(btnCadastrar);
		
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(108, 66, 78, 35);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(108, 136, 78, 35);
		add(lblNewLabel_1);
		
	}	
		public void btnCadastrar(JButton btnCadastrar) {
		this.btnCadastrar = btnCadastrar;
		}
		public void cadastrar(ActionListener actionListener) {
			this.btnCadastrar.addActionListener(actionListener);
		}
		public JTextField getTextNome() {
			return textNome;
		}
		public void setTextNome(JTextField textNome) {
			this.textNome = textNome;
		}
		public JTextField getTextCpf() {
			return textCpf;
		}
		public void setTextCpf(JTextField textCpf) {
			this.textCpf = textCpf;
		}
		public Object getBtnCadastrar() {
			return btnCadastrar;
		}
		public void setBtnCadastrar(JButton btnCadastrar) {
			this.btnCadastrar = btnCadastrar;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		public void adicionarController(ComponentListener listener) {
			this.addComponentListener(listener);
		}
		
		
}
