package testare;


import Tema1.Eveniment;
import Tema1.Echipa;
import Tema1.Activitati;
import Tema1.Program;
import Tema1.Voluntar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdaugareVoluntar {

    private String[] intervaleOrare={"8-10","10-12","12-14"};
    private Program program =  new Program(intervaleOrare);
    private Eveniment eveniment = new Eveniment("eveniment1");
    @Test
    public void testare(){
        Activitati activitate = new Activitati("activitate","activitate",5);
        Echipa echipa1 = new Echipa("Echipa1");
        program.adaugareActivitate(activitate);
       
        assertEquals(true, eveniment.creareEchipa(echipa1));
        assertEquals(true,eveniment.asignareActivitateEchipa(activitate, echipa1));
        
        Activitati activitate2 = new Activitati("activitate2","activitate",5);
        assertEquals(false,eveniment.asignareActivitateEchipa(activitate2, echipa1));
        
        Echipa echipa2 = new Echipa("Echipa2");
        assertEquals(false,eveniment.asignareActivitateEchipa(activitate, echipa2));
        
        Voluntar voluntar = new Voluntar("voluntar1","voluntar1","voluntar1","voluntar1",18,"10-12","Zi1","Rol1");
       
        assertEquals(true,eveniment.alocareEchipa(voluntar, echipa1));
        assertEquals(false,eveniment.alocareEchipa(voluntar, echipa1));
    }

}
