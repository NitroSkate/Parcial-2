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
public class HQRUS implements Rusia{
    public static EAtaque HQRUS = new EAtaque();

    @Override
    public void build(String nombre) {
        HQRUS.setNombre(nombre);
        HQRUS.setVida(0);
        HQRUS.setTiempoC(0);
        HQRUS.setCosto1(0);
        HQRUS.setCosto2(0);
    }

    @Override
    public Sourcerer getSource() {
        return null;
    }

    @Override
    public Base getBase() {
        return null;
    }

    @Override
    public EAtaque getEAtaque() {
        return HQRUS;
    }
    
}
