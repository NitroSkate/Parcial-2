/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstruccionesNiponas;

import Paises.*;


/**
 *
 * @author NitroSkate <00159817@uca.edu.sv>
 */
public class Herradero implements Japon {
    public static Sourcerer Herradero = new Sourcerer();
    
    @Override
    public void build(String nombre){
        Herradero.setNombre(nombre);
        Herradero.setVida(300);
        Herradero.setFasesT(0);
        Herradero.setCosto1(0);
        Herradero.setCosto2(0);
        Herradero.setRecurso1(0);
        Herradero.setRecurso2(0);
        Herradero.setRecurso3(0);
    }
    
    @Override
    public Sourcerer getSource(){
        return Herradero;
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
