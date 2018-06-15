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
public class EAtaque implements EAtaquePlan {
    private String nombre;
    private int vida, c1, c2, c3, Tiempo;
    
    @Override
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    @Override
    public void setVida(int vida){
        this.vida=vida;
    }

    @Override
    public void setCosto1(int c1) {
        this.c1=c1;
    }

    @Override
    public void setCosto2(int c2) {
        this.c2=c2;
    }
    
    @Override
    public void setCosto3(int c3){
        this.c3=c3;
    }

    @Override
    public void setTiempoC(int Tiempo) {
        this.Tiempo=Tiempo;
    }
    
    @Override
    public String getNombre(){
        return nombre;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public int getCosto1() {
        return c1;
    }

    @Override
    public int getCosto2() {
        return c2;
    }
    
    @Override 
    public int getCosto3(){
        return c3;
    }
    
    @Override
    public int getTiempoC() {
        return Tiempo;
    }

}
