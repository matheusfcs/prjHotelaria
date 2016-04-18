package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Acomodacao {
	
	private int numero;
	private int tamanho;
	private int qtdePessoas;
	
	//constants
	public final static ErroDominio NUMERO_INVALIDO = new ErroDominio("Acomodacao", 1, "Numero não pode ser vazio ou negativo");
	public final static ErroDominio TAMANHO_INVALIDO = new ErroDominio("Acomodacao", 2, "Tamanho não pode ser vazio ou negativo");
	public final static ErroDominio QTDE_INVALIDO = new ErroDominio("Acomodacao", 3, "Quantidade não pode ser vazio ou negativo");
		
	
	@Override
	public String toString() {
		return "Acomodacao [numero=" + numero + ", tamanho=" + tamanho + ", qtdePessoas=" + qtdePessoas + "]";
	}
	
	//geters and seters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) throws DominioException {
		Acomodacao.validarNumero(numero);
		this.numero = numero;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) throws DominioException {
		Acomodacao.validarTamanho(tamanho);
		this.tamanho = tamanho;
	}

	public int getQtdePessoas() {
		return qtdePessoas;
	}

	public void setQtdePessoas(int qtdePessoas) throws DominioException {
		Acomodacao.validarQtde(qtdePessoas);
		this.qtdePessoas = qtdePessoas;
	}
	
	//constructors
	public Acomodacao(){
		
	}
	
	public Acomodacao(int numero, int tamanho, int qtdePessoas) {
		super();
		this.numero = numero;
		this.tamanho = tamanho;
		this.qtdePessoas = qtdePessoas;
	}
	
	//Methods
	
		public static void validarNumero(int numero) throws DominioException{
			if(numero == 0 || numero < 0){
				throw new DominioException(NUMERO_INVALIDO);
			}
		}
		
		public static void validarTamanho(int tamanho) throws DominioException{
			if (tamanho == 0 || tamanho < 0){
				throw new DominioException(TAMANHO_INVALIDO);
			}
		}
		
		public static void validarQtde(int qtde) throws DominioException{
			if (qtde == 0 || qtde < 0){
				throw new DominioException(QTDE_INVALIDO);
			}
		}
	
		public String status(){
			Estada estada = new Estada();
			Date data = new Date();
			SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
			String dataFormatada  = formataData.format(data);
			String status;
			if(estada.getCheckOut().equals(data)){
				status = "Liberada";
			}else{
				status = "Ocupada";
			}
			return status;
		}
	
}
