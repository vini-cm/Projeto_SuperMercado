package Model;

public class Usuario {
	private String nome, cpf;
	private boolean funcao;
	
	
	public Usuario(String nome, String cpf, boolean funcao) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.funcao = funcao;
	}
	
	public Usuario() {
		
	}
	
	public void imprimir() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("cpf: "+ this.cpf);
		if(this.funcao == true) {
		System.out.println("funcao : Adimistrador");
		}
		else {
			System.out.println("funcao : Funcionario");
		}
		System.out.println("##################################");
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
		cpf = cpf;
	}
	public boolean isFuncao() {
		return funcao;
	}
	public void setFuncao(boolean funcao) {
		this.funcao = funcao;
	}
	
	
}
