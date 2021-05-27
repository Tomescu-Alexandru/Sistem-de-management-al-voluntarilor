package testare;


import Tema1.Activitati;
import Tema1.Program;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testareActivitati {

    private String[] intervaleOrare={"8-10","10-12","12-14"};
    private Program program =  new Program(intervaleOrare);

    @Test
    public void testare(){
        Activitati activitate = new Activitati("activitate","activitate",5);
        program.adaugareActivitate(activitate);
        assertEquals(false, program.adaugareActivitate(activitate));
        Activitati activitate2 = new Activitati("activitate2","activitate",5);
        assertEquals(true, program.adaugareActivitate(activitate2));
        Activitati activitate3 = new Activitati("activitate3","activitate",5);
        program.adaugareActivitate(activitate3);
        Activitati activitate4 = new Activitati("activitate4","activitate",5);
        assertEquals(false, program.adaugareActivitate(activitate4));

        Activitati activitate5 = new Activitati("activitate5","activitate",5);
        assertEquals(false, program.stergereActivitate(activitate5));
        assertEquals(true,program.stergereActivitate(activitate3));

        assertEquals(false,program.redenumireActivitate("activitate1","activitate1"));
        assertEquals(false,program.redenumireActivitate("activitate1",""));
        assertEquals(false,program.redenumireActivitate("activitate1","activitate2"));
        assertEquals(false,program.redenumireActivitate("activitate5","activitate4"));
        assertEquals(true,program.redenumireActivitate("activitate","activitate4"));

    }

}
