package model;

public class Produto {
	
	//atributes
	private String nome;
	private float valor;
	private int quantitade;
	
	//constants
	public final static ErroDominio NOME_INVALIDO = new ErroDominio("Produto", 1, "Nome não pode ser vazio ou nulo");
	public final static ErroDominio VALOR_INVALIDO = new ErroDominio("Produto", 2, "Valor não pode ser vazio ou negativo");
	public final static ErroDominio QTDE_INVALIDO = new ErroDominio("Produto", 3, "Quantidade não pode ser vazio ou negativo");
	
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valor=" + valor + ", quantitade=" + quantitade + "]";
	}
	
	//geters and Seters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws DominioException {
		Produto.validarNome(nome);
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) throws DominioException {
		Produto.validarValor(valor);
		this.valor = valor;
	}
	public int getQuantitade() {
		return quantitade;
	}
	public void setQuantitade(int quantitade) {
		this.quantitade = quantitade;
	}
	
	//Constructors
	public Produto(){
		
	}
	
	public Produto(String nome, float valor, int quantitade)throws DominioException {
		this.setNome(nome);
		this.setQuantitade(quantitade);
		this.setValor(valor);
		
	}
	
	//Methods
	
	public static void validarNome(String nome) throws DominioException{
		if(nome == null || nome.length() == 0){
			throw new DominioException(NOME_INVALIDO);
		}
	}
	
	public static void validarValor(float valor) throws DominioException{
		if (valor == 0 || valor < 0){
			throw new DominioException(VALOR_INVALIDO);
		}
	}
	
	public static void validarQtde(int qtde) throws DominioException{
		if (qtde == 0 || qtde < 0){
			throw new DominioException(QTDE_INVALIDO);
		}
	}
	
	public static void adicionarProduto(String nome, float valor, int qtde){
		nome  = "Coca Lata";
		valor = (float) 6.50;
		qtde  = 2;
	}
	
	public static void removerProduto(String nome, float valor, int qtde){
		nome = null;
		valor = (Float) null;
		qtde = 0;
	}
	
}
