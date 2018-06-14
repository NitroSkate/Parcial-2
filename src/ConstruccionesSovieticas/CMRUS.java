/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstruccionesSovieticas;

import Paises.Base;
import Paises.EAtaque;
import Paises.Rusia;
import Paises.Sourcerer;

/**
 *
 * @author estudiante
 */
public class CMRUS implements Rusia {
    public static Base CMRUS = new Base();

    @Override
    public void build(String nombre) {
        CMRUS.setNombre(nombre);
        CMRUS.setVida(0);
        CMRUS.setCapRecurso1(0);
        CMRUS.setCapRecurso2(0);
        CMRUS.setCapRecurso3(0);
        CMRUS.setCantRecurso1(0);
        CMRUS.setCantRecurso2(0);
        CMRUS.setCantRecurso3(0);
    }

    @Override
    public Sourcerer getSource() {
        return null;
    }

    @Override
    public Base getBase() {
        return CMRUS;
    }

    @Override
    public EAtaque getEAtaque() {
        return null;
    }
    
}
