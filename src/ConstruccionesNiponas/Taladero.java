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
 * @author NitroSkate <00159817@uca.edu.sv>
 */
public class Taladero implements Japon {
    public static Sourcerer Taladero = new Sourcerer();
    
    @Override
    public void build(String nombre){
        Taladero.setNombre(nombre);
        Taladero.setVida(100);
        Taladero.setFasesT(0);
        Taladero.setCosto1(2500);
        Taladero.setCosto2(500);
        Taladero.setCosto3(0);
        Taladero.setRecurso1(2000);
        Taladero.setRecurso2(0);
        Taladero.setRecurso3(0);
    }
    
    @Override
    public Sourcerer getSource(){
        return Taladero;
    }

    @Override
    public Base getBase() {
        return null;
    }

    @Override
    public EAtaque getEAtaque() {
        return null;
    }
    
}
