/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstruccionesGringas;

import Paises.Base;
import Paises.EAtaque;
import Paises.Eeuu;
import Paises.Sourcerer;

/**
 *
 * @author NitroSkate <00159817@uca.edu.sv>
 */
public class FabricaTUSA implements Eeuu{
    public static EAtaque FabricaTUSA = new EAtaque();
    
    @Override
    public void build() {
        FabricaTUSA.setVida(0);
        FabricaTUSA.setCosto1(0);
        FabricaTUSA.setCosto2(0);
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
