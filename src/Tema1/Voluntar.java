// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Tema1;

/************************************************************/
/**
 * 
 */
public class Voluntar extends Persoana {
	/**
	 * 
	 */
	private String intervalOrar;
	/**
	 * 
	 */
	private String zileDisponibilitate;
	/**
	 * 
	 */
	private String Rol;
	
	private boolean solicitare;

	/**
	 * 
	 */
	
	public void afisare() {
		super.afisare();
		System.out.println("Interval orar: " + this.intervalOrar);
		System.out.println("Zile disponibilitate: " + this.zileDisponibilitate);
		System.out.println("Rol: " + this.Rol);
	}

	public Voluntar(String username, String parola, String nume, String prenume, int varsta, String intervalOrar,
			String zileDisponibilitate, String rol, boolean solicitare) {
		super(username, parola, nume, prenume, varsta);
		this.intervalOrar = intervalOrar;
		this.zileDisponibilitate = zileDisponibilitate;
		Rol = rol;
		this.solicitare = solicitare;
	}

	public String getIntervalOrar() {
		return intervalOrar;
	}

	public void setIntervalOrar(String intervalOrar) {
		this.intervalOrar = intervalOrar;
	}

	public String getZileDisponibilitate() {
		return zileDisponibilitate;
	}

	public void setZileDisponibilitate(String zileDisponibilitate) {
		this.zileDisponibilitate = zileDisponibilitate;
	}

	public String getRol() {
		return Rol;
	}

	public void setRol(String rol) {
		Rol = rol;
	}

	/**
	 * 
	 * @param echipa 
	 */
	public boolean solicitareInscriere(boolean solicitare) {
		return solicitare;
	}

	public boolean getSolicitare() {
		return solicitare;
	}

	public void setSolicitare(boolean solicitare) {
		this.solicitare = solicitare;
	}
};
