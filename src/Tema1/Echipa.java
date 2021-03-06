// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Tema1;

import java.util.Arrays;
import java.util.Objects;

/************************************************************/
/**
 * 
 */
public class Echipa {
	/**
	 * 
	 */
	private Voluntar liderEchipa;
	/**
	 * 
	 */
	public Voluntar[] voluntar;
	/**
	 * 
	 */
	public Raport raport;
	/**
	 * 
	 */
	private Activitati activitateEchipa;
	/**
	 * 
	 */
	private String numeEchipa;
	
	public int nr_voluntari;
	
	static final int NR_MAX_VOLUNTARI = 20;


	public Echipa(Voluntar liderEchipa, Voluntar[] voluntar, Raport raport, Activitati activitateEchipa,
			String numeEchipa) {
		super();
		this.liderEchipa = liderEchipa;
		nr_voluntari = 0;
		this.voluntar = new Voluntar[NR_MAX_VOLUNTARI];
		this.raport = raport;
		this.activitateEchipa = activitateEchipa;
		this.numeEchipa = numeEchipa;
	}

	public Echipa(String nume){
		this.numeEchipa = nume;
		nr_voluntari = 0;
		this.voluntar = new Voluntar[NR_MAX_VOLUNTARI];
	}

	
	public Voluntar getLiderEchipa() {
		return liderEchipa;
	}

	public void setLiderEchipa(Voluntar liderEchipa) {
		this.liderEchipa = liderEchipa;
	}

	public Voluntar[] getVoluntar() {
		return voluntar;
	}

	public void setVoluntar(Voluntar[] voluntar) {
		this.voluntar = voluntar;
	}

	public Raport getRaport() {
		return raport;
	}

	public void setRaport(Raport raport) {
		this.raport = raport;
	}

	public Activitati getActivitateEchipa() {
		return activitateEchipa;
	}

	public void setActivitateEchipa(Activitati activitateEchipa) {
		this.activitateEchipa = activitateEchipa;
	}

	public String getNumeEchipa() {
		return numeEchipa;
	}

	public void setNumeEchipa(String numeEchipa) {
		this.numeEchipa = numeEchipa;
	}

	public void asignareLider(int nrVoluntar) {
		this.voluntar[nrVoluntar] = this.liderEchipa;
	}
	/**
	 * 
	 * @param nrVoluntar 
	 * @param rol 
	 */
	public void asignareRol(int nrVoluntar, String rol) {
		this.voluntar[nrVoluntar].setRol(rol);
	}

	/**
	 * 
	 * @param ocupatie 
	 */
	public boolean completareRaport(String ocupatie) {
		if(ocupatie != " "){
			raport.adaugareOcupatie(ocupatie);
			return true;
		}else{
			System.out.println("Nu este o ocupatie valida!");
			return false;
		}
	}

	/**
	 * 
	 */
	public void eliberareRaport() {
		raport.getIstoricOcupatii();
	}

	public void afisare(){
		System.out.println("Lider echipa: ");
		this.liderEchipa.afisare();
		System.out.println("Voluntari: ");
		for(int i = 0; i < nr_voluntari; i++){
			this.voluntar[i].afisare();
		}
		System.out.println("Raport: ");
		this.raport.afisare();
		System.out.println("Activitate echipa: ");
		this.activitateEchipa.toString();
	}
	
    public boolean adaugareVoluntar(Voluntar voluntar){
    	boolean solicitare = voluntar.getSolicitare();
        if(voluntar.solicitareInscriere(solicitare)){
            if(nr_voluntari < NR_MAX_VOLUNTARI){
            	for(int i = 0; i < nr_voluntari; i++) {
            		if(this.voluntar[i].getNume() == voluntar.getNume()) {
            			System.out.println("Voluntar existent!");
            			return false;
            		}
            	}
				this.voluntar[nr_voluntari++] = voluntar;
				System.out.println("Voluntar adaugat!");
				return true;
			}else{
				System.out.println("S-a atins numarul maxim de voluntari!");
				return false;
			}
        }else{
            return false;
        }
    }

	@Override
    public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Echipa echipa = (Echipa) o;
    return nr_voluntari == echipa.nr_voluntari && Objects.equals(liderEchipa, echipa.liderEchipa) && Arrays.equals(voluntar, echipa.voluntar) && Objects.equals(raport, echipa.raport) && Objects.equals(activitateEchipa, echipa.activitateEchipa) && Objects.equals(numeEchipa, echipa.numeEchipa);
    }

    @Override
    public int hashCode() {
    int result = Objects.hash(liderEchipa, raport, activitateEchipa, numeEchipa, nr_voluntari);
    result = 31 * result + Arrays.hashCode(voluntar);
    return result;
    }
};
