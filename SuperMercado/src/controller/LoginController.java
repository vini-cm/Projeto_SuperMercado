package controller;

import Model.UsuarioDao;
import views.TelaLogin;

public class LoginController {
		private TelaLogin view;
		private final UsuarioDao model;
		private final Navegador navegador;

		public LoginController(TelaLogin view, Navegador navegador, UsuarioDao model) {
			this.view = view;
			this.navegador = navegador;
			this.model = model;
			this.view.entrar(e->{
				String nome = this.view.getNome();
				String cpf = this.view.getCpf();
				
				if(model.buscarAdm(nome, cpf).isFuncao()) {//é adm
					navegador.navegarPara("Tela de Cadastro de Produtos");
				}
				else{//se n for adm
					System.out.println("opa");
					navegador.navegarPara("TELA DE COMPRA");
				}
				
			});
			
			this.view.cadastrar(e -> {
				this.navegador.navegarPara("CADASTRO");
			});
		}
}