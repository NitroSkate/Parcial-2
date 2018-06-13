/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstruccionesGringas;

import Paises.*;

/**
 *
 * @author estudiante
 */
public class CMUSA implements Eeuu {
    public static Base CMUSA = new Base();

    @Override
    public void build(String nombre) {
        CMUSA.setNombre(nombre);
        CMUSA.setVida(0);
        CMUSA.setCapRecurso1(0);
        CMUSA.setCapRecurso2(0);
        CMUSA.setCapRecurso3(0);
        CMUSA.setCantRecurso1(0);
        CMUSA.setCantRecurso2(0);
        CMUSA.setCantRecurso3(0);
    }

    @Override
    public Sourcerer getSource() {
        return null;
    }

    @Override
    public Base getBase() {
        return CMUSA;
    }

    @Override
    public EAtaque getEAtaque() {
        return null;
    }
    
    
    
}
