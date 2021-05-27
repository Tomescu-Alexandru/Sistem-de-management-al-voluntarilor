// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Tema1;

/************************************************************/
/**
 * 
 */
public class Manager extends Persoana{

    private Eveniment[] evenimente;
    private static final int NR_MAX_EVENIMENTE = 10;
    private int nrEvenimente;

    public Manager(String username, String parola, String nume, String prenume, int varsta){
        super(username,parola,nume,prenume,varsta);
        nrEvenimente=0;
        evenimente = new Eveniment[NR_MAX_EVENIMENTE];
    }

    public Eveniment[] getEveniment() {
        return evenimente;
    }

    public void solicitareRaport(Echipa echipa){

    }

    public void adaugareVoluntar(Voluntar voluntar){

    }

    public void alocareEchipa(){

    }

    public void asignareActivitateEchipa(Activitati activitate, Echipa echipa){

    }

    public void creareEchipa(String nume){

    }
};
