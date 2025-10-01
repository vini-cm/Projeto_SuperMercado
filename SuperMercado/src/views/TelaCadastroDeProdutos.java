package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastroDeProdutos extends JPanel {

	private static final long serialVersionUID = 1L;
	JButton btn_adicionar;
	private JTextField textID;
	private JTextField textnome;
	private JTextField textDesc;
	private JTextField textQtd;
	private JTextField textpreco;
	private String id;
	private String nome;
	private String descricao;
	private String preco;
	private String quantidade;
	

	public JButton getBtn_adicionar() {
		return btn_adicionar;
	}

	public void setBtn_adicionar(JButton btn_adicionar) {
		this.btn_adicionar = btn_adicionar;
	}

	public JTextField getTextID() {
		return textID;
	}

	public void setTextID(JTextField textID) {
		this.textID = textID;
	}

	public JTextField getTextnome() {
		return textnome;
	}

	public void setTextnome(JTextField textnome) {
		this.textnome = textnome;
	}

	public JTextField getTextDesc() {
		return textDesc;
	}

	public void setTextDesc(JTextField textDesc) {
		this.textDesc = textDesc;
	}

	public JTextField getTextQtd() {
		return textQtd;
	}

	public void setTextQtd(JTextField textQtd) {
		this.textQtd = textQtd;
	}

	public JTextField getTextpreco() {
		return textpreco;
	}

	public void setTextpreco(JTextField textpreco) {
		this.textpreco = textpreco;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public TelaCadastroDeProdutos() {
		setPreferredSize(new Dimension(450, 350));
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		
		
		JButton btn_adicionar = new JButton("Adicionar Produto");
		btn_adicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_adicionar.setBounds(107, 234, 160, 30);
		add(btn_adicionar);
		
		textID = new JTextField();
		textID.setBounds(181, 74, 86, 20);
		add(textID);
		textID.setColumns(10);
		id = textID.getText();
		
		textnome = new JTextField();
		textnome.setBounds(181, 99, 86, 20);
		add(textnome);
		textnome.setColumns(10);
		nome = textnome.getText();
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(56, 77, 46, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(56, 102, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Descrição");
		lblNewLabel_1_1.setBounds(56, 127, 46, 14);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Preço");
		lblNewLabel_1_1_1.setBounds(56, 179, 46, 14);
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Quantidade");
		lblNewLabel_1_1_2.setBounds(56, 152, 86, 16);
		add(lblNewLabel_1_1_2);
		
		textDesc = new JTextField();
		textDesc.setBounds(181, 124, 86, 20);
		add(textDesc);
		textDesc.setColumns(10);
		descricao = textDesc.getText();
		
		textQtd = new JTextField();
		textQtd.setBounds(181, 150, 86, 20);
		add(textQtd);
		textQtd.setColumns(10);
		quantidade = textQtd.getText();
		
		textpreco = new JTextField();
		textpreco.setBounds(181, 176, 86, 20);
		add(textpreco);
		textpreco.setColumns(10);
		preco = textpreco.getText();
		
		JLabel lblNewLabel_2 = new JLabel("CADASTRAR PRODUTO");
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(42, 11, 312, 52);
		add(lblNewLabel_2);
	}
	
	public void adicionar(ActionListener actionListener) {
		this.btn_adicionar.addActionListener(actionListener);
	}
	
	public void adicionarOuvinte(ComponentListener listener) {
		this.addComponentListener(listener);
	}
}
