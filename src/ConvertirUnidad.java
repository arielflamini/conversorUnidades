import javax.swing.JOptionPane;

public class ConvertirUnidad {
	
	public void mostrarUnidades() {
		double calc1 = 0;
		double calc2 = 0;
		//creo las opciones a mostrar
		String [] unidades = {"Divisas","Temperaturas","Longitudes"};
		//muestro en una lista desplegable las opciones
		Object opcion = JOptionPane.showInputDialog(null,"Selecciona un tipo de unidad", "Elegir",JOptionPane.QUESTION_MESSAGE,null,unidades, unidades[0]);
		if(opcion == "Divisas") {
			Divisa d = new Divisa();
			String [] divisas = d.getDivisas();
			double [] valores = d.getValores();
			//muestro en una lista las opciones de divisas a elegir
			Object divisa1 = JOptionPane.showInputDialog(null,"Convertir divisa de...", "Elegir",JOptionPane.QUESTION_MESSAGE,null,divisas, divisas[0]);
			double valor = Double.valueOf(JOptionPane.showInputDialog("Ingrese la cantidad de "+divisa1+" que quieres convertir"));
			Object divisa2 = JOptionPane.showInputDialog(null,"Convertir cantidad a...", "Elegir",JOptionPane.QUESTION_MESSAGE,null,divisas, divisas[0]);
			for(int i = 0;i<divisas.length;i++) {
				if(divisa1.equals(divisas[i])) {
					calc1 = valores[i];
				}
			}
			for(int j = 0;j<divisas.length;j++) {
				if(divisa2.equals(divisas[j])) {
					calc2 = valores[j];
				}
			}
			JOptionPane . showMessageDialog ( null , "Usted tiene "+(valor*calc2)/calc1+" "+divisa2 );
		}
		}
}
	


	

