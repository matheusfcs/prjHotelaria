package model;

public class ErroDominio {
	
	private String nomeClasse;
	private int numeroErro;
	private String mensagem;
	
	@Override
	public String toString() {
		return "ErroDominio [nomeClasse=" + nomeClasse + ", numeroErro=" + numeroErro + ", mensagem=" + mensagem + "]";
	}

	//geters and seters
	public String getNomeClasse() {
		return nomeClasse;
	}



	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}



	public int getNumeroErro() {
		return numeroErro;
	}



	public void setNumeroErro(int numeroErro) {
		this.numeroErro = numeroErro;
	}



	public String getMensagem() {
		return mensagem;
	}



	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	//constructors
	public ErroDominio(String nomeClasse, int numeroErro, String mensagem){
		
	}

}
