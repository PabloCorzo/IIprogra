package com.prograII;
import static org.junit.Assert.*;
import org.junit.Test;

public class FechaTest {
    @Test
    public void test(){
        //test cases
        Fecha hoy =new Fecha(26,4,2022);
        Fecha m= hoy.maniana();
        assertTrue(m.dia()==27 && m.mes()==4 && m.anio()==2022);

    }
    @Test
    
}