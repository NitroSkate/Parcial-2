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
public class FabricaTJAP implements Japon {
    public static EAtaque FabricaTJAP = new EAtaque();

    @Override
    public void build(String nombre) {
        FabricaTJAP.setNombre(nombre);
        FabricaTJAP.setVida(400);
        FabricaTJAP.setTiempoC(0);
        FabricaTJAP.setCosto1(1500);
        FabricaTJAP.setCosto2(1000);
        FabricaTJAP.setCosto3(1000);
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
        return FabricaTJAP;
    }
    
    
    
}
