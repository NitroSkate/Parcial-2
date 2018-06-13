/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paises;

import ConstruccionesGringas.Aserradero;
import ConstruccionesGringas.Fabrica;
import ConstruccionesGringas.Fundidora;

/**
 *
 * @author NitroSkate <00159817@uca.edu.sv>
 */
public class EeuuFact implements AbstractFact{
    @Override
    public Eeuu getEeuu(String t) {
        switch(t){
            case "Aserradero":
                return new Aserradero();
            case "fabrica":
                return new Fabrica();
            case "fundidora":
                return new Fundidora();
        }
        return null;
    }

    @Override
    public Rusia getRusia(String t) {
        return null;
    }

    @Override
    public Japon getJapon(String t) {
        return null;
    }
    
}
