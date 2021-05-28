// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Tema1;

/************************************************************/

import java.util.Arrays;
import java.util.Objects;

/**
 *
 */
public class Eveniment {
    /**
     *
     */
    private String locatie;
    /**
     *
     */
    private String numeEveniment;
    /**
     *
     */
    public Echipa[] echipa;
    private int nrEchipe=0;
    private static final int NR_MAX_ECHIPE=20;
    /**
     *
     */
    public Program program;
    /**
     *
     */
    public Manager manager;

    public Eveniment(String locatie, String numeEveniment, Program program, Manager manager) {
        this.locatie = locatie;
        this.numeEveniment = numeEveniment;
        this.echipa = new Echipa[NR_MAX_ECHIPE];
        this.program = program;
        this.manager = manager;
        this.nrEchipe=0;
    }
    
    public Eveniment(String nume) {
    	this.numeEveniment = nume;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public String getNumeEveniment() {
        return numeEveniment;
    }

    public void setNumeEveniment(String numeEveniment) {
        this.numeEveniment = numeEveniment;
    }

    public Echipa[] getEchipa() {
        return echipa;
    }

    public void setEchipa(Echipa[] echipa) {
        this.echipa = echipa;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void afisareVoluntari() {
		for(int i=0;i<nrEchipe;i++){
			echipa[i].afisare();
		}
    }

    public void creareProgram(String intervaleOrare[]) {
        this.program = new Program(intervaleOrare);
    }

    public void solicitareRaport(Echipa echipa){
        echipa.eliberareRaport();
    }

    //mutata din Manager + parametrii 
    public boolean alocareEchipa(Voluntar voluntar, Echipa echipa){
        return echipa.adaugareVoluntar(voluntar);
    }

    //mutata din clasa Manager
    public boolean asignareActivitateEchipa(Activitati activitate, Echipa echipa){
        boolean verif = false;
        for(int i = 0; i < program.getNrActivitati(); i++){
            if(program.activitati[i].equals(activitate)){
                verif = true;
            }
        }

        if(verif == false){
            return false;
        }

        for(int i = 0; i < nrEchipe; i++){
            if(this.echipa[i].equals(echipa)){
                this.echipa[i].setActivitateEchipa(activitate);
                return true;
            }
        }

        return false;
    }
	
    public boolean creareEchipa(Echipa echipa){
        if (nrEchipe < NR_MAX_ECHIPE) {
            for (int i = 0; i < nrEchipe; i++)
                if (this.echipa[i].getNumeEchipa() == echipa.getNumeEchipa()) {
                    System.out.println("Echipa existenta");
                    return false;
                }
            this.echipa[nrEchipe++]=echipa;
            System.out.println("Echipa adaugata");
            return true;
        }
        System.out.println("Numar maxim de echipe atins");
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Eveniment eveniment = (Eveniment) o;
        return nrEchipe == eveniment.nrEchipe && Objects.equals(locatie, eveniment.locatie) && Objects.equals(numeEveniment, eveniment.numeEveniment) && Arrays.equals(echipa, eveniment.echipa) && Objects.equals(program, eveniment.program) && Objects.equals(manager, eveniment.manager);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(locatie, numeEveniment, nrEchipe, program, manager);
        result = 31 * result + Arrays.hashCode(echipa);
        return result;
    }
};
