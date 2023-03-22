import java.util.Date;

public class ValorDivisa {
	
	private Date fecha;
	private double valor;
	private Divisa divisa;
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Divisa getDivisa() {
		return divisa;
	}
	public void setMoneda(Divisa divisa) {
		this.divisa = divisa;
	}
	
	
}
