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
    private int vida;
    private int rec1,rec2,rec3,fasest, costo1, costo2;
    public ArrayList<Sourcerer> sour = new ArrayList<>();
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
    public int getVida() {
        return this.vida;
    }

    @Override
    public int getFasesT() {
        return this.fasest;
    }

    @Override
    public int getCosto1() {
        return this.costo1;
    }

    @Override
    public int getCosto2() {
        return this.costo2;
    }
    @Override
    public int getRecurso1() {
        return this.rec1;
    }

    @Override
    public int getRecurso2() {
        return this.rec2;
    }

    @Override
    public int getRecurso3() {
        return this.rec3;
    }
    
}
