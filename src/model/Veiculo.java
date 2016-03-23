package model;

public class Veiculo {

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	
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
	
	
}
