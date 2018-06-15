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
public class AeropuertoJAP implements Japon{
    public static EAtaque AeropuertoJAP = new EAtaque();

    @Override
    public void build(String nombre) {
        AeropuertoJAP.setNombre(nombre);
        AeropuertoJAP.setVida(500);
        AeropuertoJAP.setTiempoC(0);
        AeropuertoJAP.setCosto1(2000);
        AeropuertoJAP.setCosto2(2000);
        AeropuertoJAP.setCosto3(2000);
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
        return AeropuertoJAP;
    }
    
}
