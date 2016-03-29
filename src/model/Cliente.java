package model;

public class Cliente {
	private int cpf;
	private String nome;
	private String telefone;
	
	//constants
	public final static ErroDominio CPF_INVALIDO = new ErroDominio("Cliente", 1, "CPF não pode ser vazio ou negativo");
	public final static ErroDominio NOME_INVALIDO = new ErroDominio("Cliente", 2, "Nome não pode ser vazio ou nulo");
	public final static ErroDominio TELEFONE_INVALIDO = new ErroDominio("Cliente", 3, "Telefone não pode ser vazio ou negativo");
	
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
	
	//Methods
	
	public static void validarCpf(int numero) throws DominioException{
		if(numero == 0 || numero < 0){
			throw new DominioException(CPF_INVALIDO);
		}
	}
	
	public static void validarNome(String nome) throws DominioException{
		if(nome == null || nome.length() == 0){
			throw new DominioException(NOME_INVALIDO);
		}
	}	
	
	public static void validarTelefone(int telefone) throws DominioException{
		if(telefone == 0 || telefone < 0){
			throw new DominioException(TELEFONE_INVALIDO);
		}
	}
	
}
