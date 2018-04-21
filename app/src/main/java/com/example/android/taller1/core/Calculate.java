package com.example.android.taller1.core;

/**
 * Created by android on 21/04/2018.
 */

public class Calculate {

    public static int cotizar(int cmbSexo, int cmbTipo,int cmbMarca, int cantidad){
        int resultado = 0;
        switch (cmbSexo){
            case 0:
                switch (cmbTipo){
                    case 0:
                        switch (cmbMarca){
                            case 0:
                                resultado = 120000 * cantidad;
                                break;
                            case 1:
                                resultado = 140000 * cantidad;
                                break;
                            case 2:
                                resultado = 130000 * cantidad;
                                break;
                        }
                        break;
                    case 1:
                        switch (cmbMarca){
                            case 0:
                                resultado = 50000 * cantidad;
                                break;
                            case 1:
                                resultado = 80000 * cantidad;
                                break;
                            case 2:
                                resultado = 100000 * cantidad;
                                break;
                        }
                        break;
                }
                break;
            case 1:
                switch (cmbTipo){
                    case 0:
                        switch (cmbMarca){
                            case 0:
                                resultado = 100000 * cantidad;
                                break;
                            case 1:
                                resultado = 130000 * cantidad;
                                break;
                            case 2:
                                resultado = 110000 * cantidad;
                                break;
                        }
                        break;
                    case 1:
                        switch (cmbMarca){
                            case 0:
                                resultado = 60000 * cantidad;
                                break;
                            case 1:
                                resultado = 70000 * cantidad;
                                break;
                            case 2:
                                resultado = 120000 * cantidad;
                                break;
                        }
                        break;
                }
                break;
        }
        return resultado;
    }

}
