package Tema1;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    public static void main(String[] args) {

        String[] intervaleOrare={"8-10","10-12","12-14","14-16"};
        Program program =  new Program(intervaleOrare);

        Activitati activitate = new Activitati("activitate","activitate",5);
        program.adaugareActivitate(activitate);
        program.adaugareActivitate(activitate);
        program.adaugareActivitate(activitate);
        //assertEquals(true, program.adaugareActivitate(activitate));
        //assertEquals(false, program.adaugareActivitate(activitate));
        System.out.println(program.activitati[0].toString());
        //System.out.println(program.activitati[0].redenumireActivitate(""));
    }
}
