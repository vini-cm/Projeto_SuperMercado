package controller;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Model.Produto;
import Model.ProdutoDAO;
import Model.Usuario;
import views.TelaCadastroDeProdutos;

public class TelaCadastroDeProdutosController {
	private final TelaCadastroDeProdutos view;
	private final ProdutoDAO model;
	private final Navegador navegador;
	
	public TelaCadastroDeProdutosController(TelaCadastroDeProdutos view, ProdutoDAO model, Navegador navegador) {
		this.view = view;
		this.model = model;
		this.navegador = navegador;
		
		List<Produto> lista = this.model.listarProdutos();
		this.view.adicionar(e -> {
			String nome = this.view.getNome();
			int id = this.view.getId();
			String descricao = this.view.getDescricao();
			double preco = this.view.getPreco();
			int quantidade = this.view.getQuantidade();
			if(nome != null || !nome.isBlank() || !nome.isEmpty() ||
					id != null || !id.isBlank()|| !id.isEmpty()||
					descricao != null || !descricao.isBlank()|| !descricao.isEmpty()||
					preco != null || !preco.isBlank()|| !preco.isEmpty()||
					quantidade != null || !quantidade.isBlank()|| !quantidade.isEmpty()) {
				Produto existente = this.model.pesquisarProduto(id);
				if(existente != null) {
						JPanel painel = new JPanel();
						JOptionPane.showMessageDialog(
			                    painel, // Componente pai (opcional, mas recomendado)
			                    "Produto Ja Existente", // Mensagem
			                    "Título do Alerta", // Título da janela
			                    JOptionPane.WARNING_MESSAGE // Tipo da mensagem (ícone)
			            );
				}
				if(this.model.pesquisarProduto(id)!= null) {
					Produto produto = new Produto(nome,id, descricao, preco);
					model.adicionarProduto(produto);
					JOptionPane.showMessageDialog(null, "Deu certo!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
					navegador.navegarPara("TELA DE COMPRA");
				}
				else {
					JOptionPane.showMessageDialog(null, "Algum erro no Cadastro", "Problema", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Prencha todos os Campos", "Erro", JOptionPane.WARNING_MESSAGE);
			}

		});
	}
	
	
}

