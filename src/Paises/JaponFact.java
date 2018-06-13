/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paises;

import ConstruccionesNiponas.*;


/**
 *
 * @author NitroSkate <00159817@uca.edu.sv>
 */
public class JaponFact implements AbstractFact{
    @Override
    public Japon getJapon(String t){
        switch(t){
            case "taladero":
                return new Taladero();
            case "maquila":
                return new Maquila();
            case "herradero":
                return new Herradero();
        }
        return null;
    }

    @Override
    public Eeuu getEeuu(String t) {
        return null;
    }

    @Override
    public Rusia getRusia(String t) {
        return null;
    }
    
}
