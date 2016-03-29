package model;

public class Veiculo {

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	
	public final static ErroDominio MARCA_INVALIDO = new ErroDominio("Veiculo", 1, "Marca não pode ser vazio ou nulo");
	public final static ErroDominio MODELO_INVALIDO = new ErroDominio("Veiculo", 2, "Modelo não pode ser vazio ou nulo");
	public final static ErroDominio PLACA_INVALIDO = new ErroDominio("Veiculo", 3, "Placa não pode ser vazio ou nulo");
	public final static ErroDominio COR_INVALIDO = new ErroDominio("Veiculo", 4, "Cor não pode ser vazio ou nulo");
	
	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", cor=" + cor + "]";
	}
	
	//geters and seters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	//Constructors
	public Veiculo(){
		
	}
	
	public Veiculo(String marca, String modelo, String placa, String cor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
	}
	
	//methods
	public static void validarMarca(String marca) throws DominioException{
		if(marca == null || marca.length() == 0){
			throw new DominioException(MARCA_INVALIDO);
		}
	}
	
	public static void validarModelo(String modelo) throws DominioException{
		if(modelo == null || modelo.length() == 0){
			throw new DominioException(MODELO_INVALIDO);
		}
	}
	
	public static void validarPlaca(String placa) throws DominioException{
		if(placa == null || placa.length() == 0){
			throw new DominioException(PLACA_INVALIDO);
		}
	}
	
	public static void validarCor(String cor) throws DominioException{
		if(cor == null || cor.length() == 0){
			throw new DominioException(COR_INVALIDO);
		}
	}
}
