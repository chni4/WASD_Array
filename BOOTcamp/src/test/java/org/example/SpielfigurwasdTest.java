package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpielfigurwasdTest {
@Test

    public void consolInput_if_Y_Up() {

    //GIVEN
    char sig = 'W';

    //WHEN
    int actual = Spielfigurwasd.gyatX(sig);



    //THEN
    assertEquals(1, actual );
    }

    @Test

    public void consolInput_if_Y_Down() {

        //GIVEN
        char sig = 'S';

        //WHEN
        int actual = Spielfigurwasd.gyatX(sig);



        //THEN
        assertEquals(-1, actual );
    }

    @Test

    public void consolInputX_Left() {

        //GIVEN
        char sig = 'A';

        //WHEN
        int actual = Spielfigurwasd.gyatX(sig);



        //THEN
        assertEquals(-1, actual );
    }

    @Test

    public void consolInput_if_Right() {

        //GIVEN
        char sig = 'D';

        //WHEN
        int actual = Spielfigurwasd.gyatX(sig);



        //THEN
        assertEquals(1, actual );
    }


    @Test

    public void consolInput_Player_Moves() {

        //GIVEN


        //WHEN
        int actual = Spielfigurwasd.gyatX();



        //THEN
        assertEquals(1, actual );
    }
}