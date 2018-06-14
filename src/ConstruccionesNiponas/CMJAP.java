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
        CMJAP.setVida(0);
        CMJAP.setCapRecurso1(0);
        CMJAP.setCapRecurso2(0);
        CMJAP.setCapRecurso3(0);
        CMJAP.setCantRecurso1(0);
        CMJAP.setCantRecurso2(0);
        CMJAP.setCantRecurso3(0);
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
