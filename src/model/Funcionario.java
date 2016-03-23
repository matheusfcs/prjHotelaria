package model;

public class Funcionario {
	private String nome;
	private int ctps;
	private String telefone;
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", ctps=" + ctps + ", telefone=" + telefone + "]";
	}
	//geters and seters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCtps() {
		return ctps;
	}

	public void setCtps(int ctps) {
		this.ctps = ctps;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//constructors
	public Funcionario(){
		
	}

	public Funcionario(String nome, int ctps, String telefone) {
		super();
		this.nome = nome;
		this.ctps = ctps;
		this.telefone = telefone;
	}
	
	
	
	
}
