/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paises;

import java.util.ArrayList;

/**
 *
 * @author NitroSkate <00159817@uca.edu.sv>
 */
public class Sourcerer implements SourPlan{
    private String nombre;
    private int vida,rec1,rec2,rec3,fasest, costo1, costo2, costo3;
    
    @Override
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    @Override
    public void setVida(int vida){
        this.vida=vida;
    }
    @Override
    public void setFasesT(int fasest){
        this.fasest=fasest;
    }
    @Override
    public void setCosto1(int costo1){
        this.costo1=costo1;
    }
    
    @Override
    public void setCosto2(int costo2){
        this.costo2=costo2;
    }
    
    @Override
    public void setCosto3(int costo3){
        this.costo3=costo3;
    }
    
    @Override
    public void setRecurso1(int rec1){
        this.rec1=rec1;
    }
    @Override
    public void setRecurso2(int rec2){
        this.rec2=rec2;
    }
    @Override
    public void setRecurso3(int rec3){
        this.rec3=rec3;
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
    public int getFasesT() {
        return fasest;
    }

    @Override
    public int getCosto1() {
        return costo1;
    }

    @Override
    public int getCosto2() {
        return costo2;
    }
    
    @Override
    public int getCosto3(){
        return costo3;
        
    }
    @Override
    public int getRecurso1() {
        return rec1;
    }

    @Override
    public int getRecurso2() {
        return rec2;
    }

    @Override
    public int getRecurso3() {
        return rec3;
    }
    
}
