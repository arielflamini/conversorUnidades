public class Divisa extends Unidad{
	
	private Pais pais;
	
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public String [] getDivisas() {
		String [] divisas = {"Dólar","Euro","Libra","Yen","Won-coreano","Peso argentino","Real"}; 
		return divisas;
	}
	
	public double[] getValores() {
		double [] valores = {1.0,0.94,0.82,132.19,1306.19,203.35,5.27};
		return valores;
	}
}
