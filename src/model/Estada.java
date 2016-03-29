package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Estada {

	private Date checkIn;
	private Date checkOut;
	
	//constants
	public final static ErroDominio CHECKIN_INVALIDO = new ErroDominio("Estada", 1, "CheckIn não pode ser vazio ou negativo");
	public final static ErroDominio CHECKOUT_INVALIDO = new ErroDominio("Estada", 2, "CheckOut não pode ser vazio ou negativo");
		
	@Override
	public String toString() {
		return "Estada [checkIn=" + checkIn + ", checkOut=" + checkOut + "]";
	}
	
	//gets and seters
	public Date getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	
	//constructors
	
	public Estada(){
		
	}
	
	public Estada(Date checkIn, Date checkOut) {
		super();
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	//methods
	public static void validarCheckIn(Date checkIn) throws DominioException{
		if(checkIn.equals(null) || checkIn.equals(0) ){
			throw new DominioException(CHECKIN_INVALIDO);
		}
	}
	
	public static void validarCheckOut(Date checkOut) throws DominioException{
		if(checkOut.equals(null) || checkOut.equals(0) ){
			throw new DominioException(CHECKOUT_INVALIDO);
		}
	}
	
	public static void adicionarEstada(Date checkIn, Date checkOut){
		SimpleDateFormat df = new SimpleDateFormat("DD/MM/yyyy");
		try{
		checkIn = df.parse("12/06/2016");
		checkOut = df.parse("15/06/2016");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void removerEstada(Date checkIn, Date checkOut){
		checkIn = null;
		checkOut = null;
	}
	
}

