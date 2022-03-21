package codigoExamen;

public class Telefono {
	public String nombre;
	public String prefijoTelefonoTrabajo;
	public String telefonoTrabajo;
	public String prefijoTelefonoCasa;
	public String telefonoCasa;

	public Telefono()
	{
	}
	
	 public String getPrefijoTelefonoTrabajo() {
	        return prefijoTelefonoTrabajo;
	    }

	    public void setPrefijoTelefonoTrabajo(String prefijoTelefonoTrabajo) {
	        this.prefijoTelefonoTrabajo = prefijoTelefonoTrabajo;
	    }

	    public String getTelefonoTrabajo() {
	        return telefonoTrabajo;
	    }

	    public void setTelefonoTrabajo(String telefonoTrabajo) {
	        this.telefonoTrabajo = telefonoTrabajo;
	    }

	    public String getPrefijoTelefonoCasa() {
	        return prefijoTelefonoCasa;
	    }

	    public void setPrefijoTelefonoCasa(String prefijoTelefonoCasa) {
	        this.prefijoTelefonoCasa = prefijoTelefonoCasa;
	    }

	    public String getTelefonoCasa() {
	        return telefonoCasa;
	    }

	    public void setTelefonoCasa(String telefonoCasa) {
	        this.telefonoCasa = telefonoCasa;
	    }
}