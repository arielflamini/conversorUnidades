import javax.swing.JOptionPane;

public class CrearUnidad {

	public static void main(String[] args) {
		//creo las opciones a mostrar
		String [] unidades = {"Divisas","Temperaturas","Longitudes"};
		//muestro en una lista desplegable las opciones
		Object opcion = JOptionPane.showInputDialog(null,"Selecciona un tipo de unidad", "Elegir",JOptionPane.QUESTION_MESSAGE,null,unidades, unidades[0]);

	}

}
