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
public class HQJAP implements Japon {
    public static EAtaque HQJAP = new EAtaque();

    @Override
    public void build(String nombre) {
        HQJAP.setNombre(nombre);
        HQJAP.setVida(300);
        HQJAP.setTiempoC(0);
        HQJAP.setCosto1(1000);
        HQJAP.setCosto2(1000);
        HQJAP.setCosto3(1000);
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
        return HQJAP;
    }
}
