package main;

import Model.UsuarioDao;
import controller.LoginController;
import controller.Navegador;
import controller.TelaDeCadastroController;
import views.JanelaPrincipal;
import views.TelaCadastroDeProdutos;
import views.TelaDeCadastro;
import views.TelaDeCompra;
import views.TelaLogin;

public class Main {

	public static void main(String[] args) {
		JanelaPrincipal janela = new JanelaPrincipal();
		Navegador navegador = new Navegador(janela);
		UsuarioDao dao = new UsuarioDao();
		
		
		
		TelaLogin telaLog = new TelaLogin();
		LoginController loginController = new LoginController(telaLog, navegador, dao);
		
		TelaDeCadastro telaCadastro = new TelaDeCadastro();
		TelaDeCadastroController cadastroController = new TelaDeCadastroController(telaCadastro, dao, navegador);
		telaCadastro.adicionarController(cadastroController);
		
		TelaDeCompra telacompra = new TelaDeCompra();
		TelaCadastroDeProdutos telaprodutos = new TelaCadastroDeProdutos();
	
		
		navegador.adicionarPainel("TELA LOGIN", telaLog);
		navegador.adicionarPainel("TELA DE COMPRA", telacompra);
		navegador.adicionarPainel("CADASTRO", telaCadastro);
		navegador.adicionarPainel("Tela de Cadastro de Produtos", telaprodutos);
		navegador.navegarPara("TELA LOGIN");
		
		
		
		
		janela.setLocationRelativeTo(null);
		janela.setVisible(true); 

	}

}
