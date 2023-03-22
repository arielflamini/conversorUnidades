
public class Administrador extends Usuario implements Autenticable {

	private String clave = "admin1234";

	@Override
	public void setClave(String clave) {
		this.setClave(clave);
	}
	
	@Override
	public boolean iniciarSesion(String clave) {
		return this.clave.equals(clave);
	}

	@Override
	public String getClave() {
		// TODO Auto-generated method stub
		return null;
	}

}
