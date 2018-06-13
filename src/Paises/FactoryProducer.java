/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paises;


/**
 *
 * @author NitroSkate <00159817@uca.edu.sv>
 */
public class FactoryProducer {
    public static AbstractFact getPais(String t){
        switch(t){
            case "eeuu":
                return new EeuuFact();
            case "rusia":
                return new RusiaFact();
            case "japon":
                return new JaponFact();
        }
        return null;
    }
}
