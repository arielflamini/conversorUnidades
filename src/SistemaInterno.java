import javax.swing.JOptionPane;

public class SistemaInterno {
	
	String clave;
	
	public void ingresarSistema() {
		//creo las opciones a mostrar
		Usuario u = new Usuario();
		String[] usus = u.getUsuarios();
		//muestro en una lista desplegable las opciones
		Object opcion = JOptionPane.showInputDialog(null,"Selecciona un tipo de usuario", "Elegir",JOptionPane.QUESTION_MESSAGE,null,usus, usus[0]);
		if(opcion == "Administrador") {
			Administrador admin = new Administrador();
			clave = JOptionPane.showInputDialog("Ingrese la clave de acceso");
			autentica(admin);
		}else if(opcion == "Cliente") {
			Cliente cliente = new Cliente();
			clave = JOptionPane.showInputDialog("Ingrese la clave de acceso");
			autentica(cliente);
		}
	}
	//autentica que inicie bien sesión
	public boolean autentica(Autenticable usuario) {
		boolean puedeIniciarSesion = usuario.iniciarSesion(clave);
		if(puedeIniciarSesion) {
			System.out.println("Login exitoso");
			
			ConvertirUnidad cd = new ConvertirUnidad();
			cd.mostrarUnidades();
			return true;
		}else {
			System.out.println("Error en login");
			return false;
		}
	}
}