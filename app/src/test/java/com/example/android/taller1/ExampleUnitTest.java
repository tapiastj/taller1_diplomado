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

    @Test
    public void cotizarTresZapatosClasicosParaHombreMarcaNike(){
        int sexo = 0, tipo = 1, marca = 0, cantidad = 3;
        assertEquals(150000, Calculate.cotizar(sexo,tipo,marca,cantidad),0);
    }

    @Test
    public void cotizarCuatroZapatillasParaMujerMarcaAdidas(){
        int sexo = 1, tipo = 0, marca = 1, cantidad = 4;
        assertEquals(520000, Calculate.cotizar(sexo,tipo,marca,cantidad),0);
    }

    @Test
    public void cotizarCincoZapatosClasicosParaMujerMarcaPuma(){
        int sexo = 1, tipo = 1, marca = 2, cantidad = 5;
        assertEquals(600000, Calculate.cotizar(sexo,tipo,marca,cantidad),0);
    }
}