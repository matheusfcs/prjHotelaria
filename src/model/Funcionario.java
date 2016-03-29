package model;

public class Funcionario {
	private String nome;
	private int ctps;
	private String telefone;
	
	//constants
	public final static ErroDominio NOME_INVALIDO = new ErroDominio("Funcionario", 1, "Nome não pode ser vazio ou nulo");
	public final static ErroDominio CTPS_INVALIDO = new ErroDominio("Funcionario", 2, "CPTS não pode ser vazio ou negativo");
	public final static ErroDominio TELEFONE_INVALIDO = new ErroDominio("Funcionario", 3, "Telefone não pode ser vazio ou negativo");
	
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
	
	//methods
	public static void validarNome(String nome) throws DominioException{
		if(nome == null || nome.length() == 0){
			throw new DominioException(NOME_INVALIDO);
		}
	}
	
	public static void validarCtps(int ctps) throws DominioException{
		if(ctps == 0 || ctps < 0){
			throw new DominioException(CTPS_INVALIDO);
		}
	}
	
	public static void validarTelefone(int telefone) throws DominioException{
		if(telefone == 0 || telefone < 0){
			throw new DominioException(TELEFONE_INVALIDO);
		}
	}
}
