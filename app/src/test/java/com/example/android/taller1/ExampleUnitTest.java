package com.example.android.taller1;

import com.example.android.taller1.core.Calculate;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void cotizarDosZapatillasParaHombreMarcaPuma(){
        int sexo = 0, tipo = 0, marca = 2, cantidad = 2;
        assertEquals(260000, Calculate.cotizar(sexo,tipo,marca,cantidad),0);
    }
}