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
public class Maquila implements Japon {
    public static Sourcerer Maquila = new Sourcerer();
    
    @Override
    public void build(String nombre){
        Maquila.setNombre(nombre);
        Maquila.setVida(200);
        Maquila.setFasesT(0);
        Maquila.setCosto1(1000);
        Maquila.setCosto2(1500);
        Maquila.setCosto3(0);
        Maquila.setRecurso1(0);
        Maquila.setRecurso2(2500);
        Maquila.setRecurso3(0);
    }
    
    @Override
    public Sourcerer getSource(){
        return Maquila;
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
