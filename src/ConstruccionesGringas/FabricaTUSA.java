/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstruccionesGringas;

import Paises.*;


/**
 *
 * @author NitroSkate <00159817@uca.edu.sv>
 */
public class FabricaTUSA implements Eeuu{
    public static EAtaque FabricaTUSA = new EAtaque();
    
    @Override
    public void build(String nombre) {
        FabricaTUSA.setNombre(nombre);
        FabricaTUSA.setVida(400);
        FabricaTUSA.setCosto1(1500);
        FabricaTUSA.setCosto2(1000);
        FabricaTUSA.setCosto3(1000);
        FabricaTUSA.setTiempoC(0);
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
        return FabricaTUSA;
    }
    
}
