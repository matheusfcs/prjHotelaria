package model;

public class Cliente {
	private int cpf;
	private String nome;
	private String telefone;
	
	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + "]";
	}
	
	//geters and seters
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//constructors
	public Cliente(){
		
	}

	public Cliente(int cpf, String nome, String telefone) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	
	
	
	
	
}
