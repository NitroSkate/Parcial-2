/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstruccionesNiponas;

import Paises.Base;
import Paises.EAtaque;
import Paises.Japon;
import Paises.Sourcerer;

/**
 *
 * @author estudiante
 */
public class CMJAP implements Japon{
    public static Base CMJAP = new Base();

    @Override
    public void build(String nombre) {
        CMJAP.setNombre(nombre);
        CMJAP.setVida(2000);
        CMJAP.setCapRecurso1(10000);
        CMJAP.setCapRecurso2(5000);
        CMJAP.setCapRecurso3(3000);
        CMJAP.setCantRecurso1(3500);
        CMJAP.setCantRecurso2(2000);
        CMJAP.setCantRecurso3(500);
    }

    @Override
    public Sourcerer getSource() {
        return null;
    }

    @Override
    public Base getBase() {
        return CMJAP;
    }

    @Override
    public EAtaque getEAtaque() {
        return null;
    }
    
}
