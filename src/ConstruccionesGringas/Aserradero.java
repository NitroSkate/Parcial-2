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
public class Aserradero implements Eeuu {
    public static Sourcerer Aserradero= new Sourcerer();

    @Override
    public void build(String nombre){
        Aserradero.setNombre(nombre);
        Aserradero.setVida(100);
        Aserradero.setCosto1(2500);
        Aserradero.setCosto2(500);
        Aserradero.setCosto3(0);
        Aserradero.setFasesT(0);
        Aserradero.setRecurso1(2000);
        Aserradero.setRecurso2(0);
        Aserradero.setRecurso3(0);
    }
    
    @Override
    public Sourcerer getSource(){
        return Aserradero;
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
