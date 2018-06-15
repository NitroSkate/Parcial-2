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
        CMUSA.setVida(2000);
        CMUSA.setCapRecurso1(10000);
        CMUSA.setCapRecurso2(5000);
        CMUSA.setCapRecurso3(3000);
        CMUSA.setCantRecurso1(3500);
        CMUSA.setCantRecurso2(2000);
        CMUSA.setCantRecurso3(500);
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
