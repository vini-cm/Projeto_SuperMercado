package controller;



import java.awt.event.ComponentAdapter;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Model.Usuario;
import Model.UsuarioDao;
import views.TelaDeCadastro;

public class TelaDeCadastroController extends ComponentAdapter{
	private final TelaDeCadastro view;
	private final UsuarioDao model;
	private final Navegador navegador;	
	
	

	public TelaDeCadastroController(TelaDeCadastro view, UsuarioDao model, Navegador navegador) {
		super();
		this.view = view;
		this.model = model;
		this.navegador = navegador;
		
		List<Usuario> lista = this.model.listarUsuarios();
		this.view.cadastrar(e->{
			String nome = this.view.getNome();
			String cpf = this.view.getCpf();
			boolean funcao = false;
			if (nome != null || !nome.isBlank() || !nome.isEmpty() ||
					cpf != null || !cpf.isBlank() || !cpf.isEmpty()) {
				Usuario existente = this.model.pesquisarUsuario(cpf);
				if (existente != null) {
					JPanel painel = new JPanel();
					JOptionPane.showMessageDialog(
		                    painel, // Componente pai (opcional, mas recomendado)
		                    "CPF JA EM USO", // Mensagem
		                    "Título do Alerta", // Título da janela
		                    JOptionPane.WARNING_MESSAGE // Tipo da mensagem (ícone)
		            );
                return;
				}
				
				if (this.model.pesquisarUsuario(cpf) != null) {
					Usuario user = new Usuario(nome, cpf, funcao = false);
					model.adicionarUsuario(user);
					JOptionPane.showMessageDialog(null, "Deu certo!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
					navegador.navegarPara("TELA LOGIN");
		                  
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


	public TelaDeCadastro getView() {
		return view;
	}



	public UsuarioDao getModel() {
		return model;
	}



	public Navegador getNavegador() {
		return navegador;
	}



	
}
